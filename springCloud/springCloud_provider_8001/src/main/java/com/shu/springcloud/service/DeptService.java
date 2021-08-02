package com.shu.springcloud.service;

import com.shu.springcloud.mapper.DeptMapper;
import com.shu.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DeptService {


    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> queryAll();

}
