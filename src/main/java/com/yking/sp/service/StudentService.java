package com.yking.sp.service;

import com.yking.sp.common.ServerResponse;
import com.yking.sp.model.Students;

public interface StudentService {

    ServerResponse getItem(Integer id);

    ServerResponse addItem(Students stu);

    ServerResponse updateItem(Integer id);

    ServerResponse deleteItem(Integer id);
}
