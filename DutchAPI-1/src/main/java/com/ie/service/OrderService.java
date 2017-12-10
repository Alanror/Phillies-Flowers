package com.ie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ie.bean.Order;
@Service
public class OrderService implements IOrderService{

    @Autowired
    private JdbcTemplate jtm;
	
	 @Override
	    public List<Order> findOrderByName(String name) {

	        String sql = "SELECT * FROM ORDERS WHERE SHOPNAME=?";

	        List<Order> order = jtm.query(sql,new Object[]{name}, new BeanPropertyRowMapper(Order.class));

	        return order;
	    }
}
