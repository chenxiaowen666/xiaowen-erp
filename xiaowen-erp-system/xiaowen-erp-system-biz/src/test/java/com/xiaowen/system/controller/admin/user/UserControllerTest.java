package com.xiaowen.system.controller.admin.user;

import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class UserControllerTest {

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();

        // 构造请求体
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("username", "xiaowen123");
        requestBody.put("nickname", "小文");
        requestBody.put("password", "123456");
        requestBody.put("remark", "这是一个测试用户");
        requestBody.put("deptId", 1001L);
        requestBody.put("postIds", Set.of(1L, 2L, 3L));
        requestBody.put("email", "xiaowen@example.com");
        requestBody.put("mobile", "15601691300");
        requestBody.put("sex", 1);
        requestBody.put("avatar", "https://www.example.com/avatar.png");

        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, headers);

        // 发送请求
        String response = restTemplate.postForObject(
                "http://localhost:60001/system/user/create",
                request,
                String.class
        );

        // 打印响应
        System.out.println(response);
    }



}
