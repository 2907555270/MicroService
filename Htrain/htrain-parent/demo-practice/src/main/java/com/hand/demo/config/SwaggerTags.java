package com.hand.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger Api 描述配置
 */
@Configuration
public class SwaggerTags {

    public static final String EXAMPLE_SITE = "Example(Site Level)";
    public static final String EXAMPLE_ORG = "Example";
    public static final String TXY_EXAMPLE_SITE = "TXY_Example(Site Level)";
    public static final String TXY_EXAMPLE_ORG = "TXY_Example";
    public static final String CODE_RULE_ORG = "CodeRule";
    public static final String MESSAGE = "Message";
    public static final String PROFILE = "Profile";
    public static final String FILE = "file";

    @Autowired
    public SwaggerTags(Docket docket) {
        docket.tags(
                new Tag(EXAMPLE_ORG, "Example 个人案例"),
                new Tag(EXAMPLE_SITE, "Example 个人案例(平台层)"),
                new Tag(TXY_EXAMPLE_ORG, "TXY_Example 猪齿鱼案例"),
                new Tag(TXY_EXAMPLE_SITE, "TXY_Example 猪齿鱼案例(平台层)"),
                new Tag(CODE_RULE_ORG, "CodeRule 编码规则"),
                new Tag(PROFILE, "Profile 配置维护"),
                new Tag(FILE, "File 文件服务")
        );
    }
}
