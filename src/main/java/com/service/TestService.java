package com.service;

import com.mapper.TestDao;

import com.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public Order getOne(String id){
        Order one = testDao.getOne(id);
        return  one;
    }
}
