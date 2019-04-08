package xyz.qiuyiping.nacos.cloudnacosdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class UserWeb {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Resource
    private UserService userService;

    @GetMapping("/user/list")
    public Object list() {
        return userService.list();
    }

    @GetMapping("dbUrl")
    public String dbUrl() {
        return dbUrl;
    }

}
