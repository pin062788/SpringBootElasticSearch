package com.ximo.springbootes.controller;

import com.ximo.springbootes.service.LibraryService;
import com.ximo.springbootes.utils.ResultUtils;
import com.ximo.springbootes.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 朱文赵
 * 2017/9/26
 */
@RestController
@RequestMapping("/book/novel")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/get/{id}")
    public Result get(@PathVariable("id") String id){
        return ResultUtils.success(libraryService.get(id));
    }


}
