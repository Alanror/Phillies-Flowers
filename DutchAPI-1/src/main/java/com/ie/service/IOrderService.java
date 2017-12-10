package com.ie.service;

import java.util.List;

import com.ie.bean.Order;

public interface IOrderService {

	public List<Order> findOrderByName(String name);
}
