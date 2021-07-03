package com.design.di.frame.parser;

import com.design.di.frame.define.BeanDefinition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Xml配置文件解析类
 * @author lizhenyu
 * @date 2021/6/14
 */
public class XmlBeanConfigParser implements BeanConfigParser {
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();

        try {
            // 初始化一个xml解析工厂
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            // 创建一个documentBuilder实例
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            // 构建一个document实例
            Document document = documentBuilder.parse(inputStream);
            // 用于简化文档树
            document.getDocumentElement().normalize();
            // 开始解析
            NodeList beans = document.getDocumentElement().getElementsByTagName("bean");
            // 逐个解析bean标签
            for (int i = 0, len = beans.getLength(); i < len; i++) {
                Node node = beans.item(i);
                // 如果node并非节点，跳过此标签
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element element = (Element) node;
                // 创建beanDefinition对象
                BeanDefinition beanDefinition = new BeanDefinition(
                        element.getAttribute("id"), element.getAttribute("class"));
                // 判断是否单例
                if ("prototype".equals(element.getAttribute("scope"))) {
                    beanDefinition.setScope(BeanDefinition.Scope.PROTOTYPE);
                }
                // 判断是否延时加载
                if ("true".equals(element.getAttribute("lazyInit"))) {
                    beanDefinition.setLazyInit(true);
                }
                // 加载相关参数
                loadConstructorArgs(element.getElementsByTagName("constructor-arg"), beanDefinition);

                beanDefinitions.add(beanDefinition);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return beanDefinitions;
    }

    /**
     * 加载初始化参数
     * @param nodes 参数节点
     * @param beanDefinition beanDefinition对象
     */
    private void loadConstructorArgs(NodeList nodes, BeanDefinition beanDefinition) {
        if (nodes == null) {
            return;
        }

        List<BeanDefinition.ConstructorArg> args = new ArrayList<>();
        for (int i = 0, len = nodes.getLength(); i < len; i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            Element element = (Element) node;
            BeanDefinition.ConstructorArg constructorArg;
            if (!element.getAttribute("type").isEmpty()) {
                // TODO 加载基础类型--其他基础类型？？？使用if判断还是
                constructorArg = new BeanDefinition.ConstructorArg.Builder()
                        .setType(String.class)
                        .setArg(element.getAttribute("value"))
                        .build();
            } else {
                // 加载引用类型
                constructorArg = new BeanDefinition.ConstructorArg.Builder()
                        .setRef(true)
                        .setArg(element.getAttribute("ref"))
                        .build();
            }
            args.add(constructorArg);
        }
        beanDefinition.setConstructorArgs(args);
    }
}
