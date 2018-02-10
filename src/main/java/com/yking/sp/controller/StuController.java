package com.yking.sp.controller;

import com.yking.sp.common.ServerResponse;
import com.yking.sp.model.Students;
import com.yking.sp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StuController {

    @Autowired
    StudentService studentService;


    @GetMapping("{id}")
    public ServerResponse getItem(@PathVariable Integer id) {
        return studentService.getItem(id);
    }


    @PostMapping("/add")
    public ServerResponse addItem(Students stu) {
        return studentService.addItem(stu);
    }

    @PutMapping("{id}")
    public ServerResponse updateItem(@PathVariable Integer id) {
        return studentService.updateItem(id);
    }

    @DeleteMapping("{id}")
    public ServerResponse deleteItem(@PathVariable Integer id) {
        return studentService.deleteItem(id);
    }


}
