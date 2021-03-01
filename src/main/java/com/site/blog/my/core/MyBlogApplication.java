package com.site.blog.my.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link http://13blog.site
 *
 * 说明：
 * 本项目为个人博客，为尊重原作者，我在源码中保留了原始信息
 */
@MapperScan("com.site.blog.my.core.dao")
@SpringBootApplication
public class MyBlogApplication {
  /*
   * Blog页面：http://localhost:28083/
   * 管理页面：http://localhost:28083/admin （admin / 123456）
   * */
  public static void main(String[] args) {
    SpringApplication.run(MyBlogApplication.class, args);
  }
}

