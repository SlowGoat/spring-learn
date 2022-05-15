package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于在xml里配置 <bean id="user" class="com.pojo.User">
@Component
// 设置单例或原型
//@Scope("singleton") @Scope("prototype")
public class User {

    // 相当于bean标签里的属性注入  <property name="name" value="SlowGoat" />
    @Value("SlowGoat")
    public String name;

    public void eat() {
        System.out.println("吃饭");
    }
}
