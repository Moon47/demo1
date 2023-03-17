package com.example.demo1.controller;

import com.example.demo1.domain.User;
import com.example.demo1.service.userService;
import com.example.demo1.vo.resultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理接口")
public class RestUserController {

    @Autowired
    private userService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询", notes = "注意事项")
    @ApiImplicitParam(example = "0",paramType = "path",name = "id",value = "要查询的图书id",
    required = true,dataType = "int")
    //paramType 取值 ：header      query(url?id=1)       path
    public resultVo findById(@PathVariable("id")Integer id) {
        User user = userService.findById(id);
        return resultVo.success(user);
    }

    @DeleteMapping("/{id}")
    public resultVo deleteById(@PathVariable("id")Integer id) {
        userService.deleteById(id);
        return resultVo.success();
    }

    @PostMapping()
    public resultVo insert(@RequestBody User user){
        userService.insert(user);
        return resultVo.success();
    }

    @PutMapping("/{id}")
    public resultVo updateById(@PathVariable("id")Integer id,@RequestBody User user){
        userService.updateById(id,user);
        return resultVo.success();
    }
}
