package com.mapper;

import com.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    Order getOne(String id);

}
