package com.yking.sp.service.impl;

import com.yking.sp.common.ServerResponse;
import com.yking.sp.mapper.StudentsMapper;
import com.yking.sp.model.Students;
import com.yking.sp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentsMapper studentsMapper;

    @Override
    public ServerResponse getItem(Integer id) {
        Students students = studentsMapper.selectByPrimaryKey(id);
        if (students == null) {
            return ServerResponse.createByErrorMessage("用户不存在!");
        }
        return ServerResponse.createBySuccess("获取成功!", students);
    }

    @Override
    public ServerResponse addItem(Students stu) {
        int count = studentsMapper.insertSelective(stu);
        if (count <= 0) {
            return ServerResponse.createByErrorMessage("添加失败!");
        }
        return ServerResponse.createBySuccess("获取成功!", stu);
    }

    @Override
    public ServerResponse updateItem(Integer id) {
        return null;
    }

    @Override
    public ServerResponse deleteItem(Integer id) {
        return null;
    }
}
