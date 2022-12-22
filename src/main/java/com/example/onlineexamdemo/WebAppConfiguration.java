package com.example.onlineexamdemo;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web MVC 配置适配器
 * @ClassName: WebAppConfigurer
 * @Description:
 * @author OnlyMate
 * @Date 2018年8月28日 下午2:39:31  
 *
 * WebAppConfigurer extends WebMvcConfigurerAdapter 在Spring Boot2.0版本已过时了，用官网说的新的类替换
 *
 */
@Configuration
public class WebAppConfiguration implements WebMvcConfigurer {/**
 * SpringBoot设置首页
 */
@Override
public void addViewControllers(ViewControllerRegistry registry) {
    WebMvcConfigurer.super.addViewControllers(registry);
    registry.addViewController("/").setViewName("index");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
}

}