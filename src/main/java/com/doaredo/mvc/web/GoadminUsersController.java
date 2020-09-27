package com.doaredo.mvc.web;

import com.doaredo.mvc.core.Result;
import com.doaredo.mvc.core.ResultGenerator;
import com.doaredo.mvc.model.GoadminUsers;
import com.doaredo.mvc.service.GoadminUsersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Jony-J on 2020/09/27
 */
@RestController
@RequestMapping("/goadmin/users")
public class GoadminUsersController {
    @Resource
    private GoadminUsersService goadminUsersService;

    @PostMapping("/add")
    public Result add(GoadminUsers goadminUsers) {
        goadminUsersService.save(goadminUsers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        goadminUsersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(GoadminUsers goadminUsers) {
        goadminUsersService.update(goadminUsers);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        GoadminUsers goadminUsers = goadminUsersService.findById(id);
        return ResultGenerator.genSuccessResult(goadminUsers);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<GoadminUsers> list = goadminUsersService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
