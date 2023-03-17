package com.example.demo1.controller;

import com.example.demo1.domain.User;
import com.example.demo1.service.userService;
import com.example.demo1.vo.resultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private userService userService;

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }
    

    /**
     * 插入
     */
    @PostMapping("/insert")
    @ResponseBody
    public resultVo insert(@RequestBody User user){
//        User user = new User();
//        user.setName("lisi");
//        user.setPassword("222");
        userService.insert(user);
        return resultVo.success();
    }

    /**
     * 批量删除
     */
    @PostMapping("/deleteBatch")
    @ResponseBody
    public resultVo deleteBatch(@RequestBody Integer[] ids){
        userService.deleteBatch(ids);
        return resultVo.success();
    }
}