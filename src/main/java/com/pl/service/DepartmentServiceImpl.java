package com.pl.service;

import com.pl.mapper.DepartmentMapper;
import com.pl.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{

        @Autowired
        DepartmentMapper departmentMapper;

        @Override
        public List<Department> queryDepartment() {
            return departmentMapper.queryDepartment();
        }

        @Override
        public Department queryDepartmentById(Integer id) {
            return departmentMapper.queryDepartmentById(id);
        }

        @Override
        public int addDepartment(Department department) {
            return departmentMapper.addDepartment(department);
        }

        @Override
        public int updateDepartment(Department department) {
            return departmentMapper.updateDepartment(department);
        }

        @Override
        public int deleteDepartmentById(Integer id) {
            return departmentMapper.deleteDepartmentById(id);
        }
}


