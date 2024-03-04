package com.luntek.address.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 类或方法的功能描述 : druid过滤器
 *
 * @author: yangz
 * @date: 2024-02-17 11:59
 */
@WebFilter(
        filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*") // 忽略资源
        }
)
public class DruidStatFilter extends WebStatFilter {

} 

