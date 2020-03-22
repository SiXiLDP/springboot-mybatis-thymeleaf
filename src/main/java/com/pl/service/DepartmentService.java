package com.pl.service;

import com.pl.pojo.Department;

import java.util.List;

public interface DepartmentService {
        // 获取所有部门信息
    List<Department> queryDepartment();

    // 通过id获得部门
    Department queryDepartmentById(Integer id);

    //增加部门
    int addDepartment(Department department);

    //修改部门
    int updateDepartment(Department department);

    //删除部门
    int deleteDepartmentById(Integer id);
}
