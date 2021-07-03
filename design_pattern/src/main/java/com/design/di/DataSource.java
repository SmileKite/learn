package com.design.di;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lizhenyu
 * @date 2021/6/14
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class DataSource {
    /** ip地址 */
    private String ipAddress;
    /** 端口 */
    private String port;
}
