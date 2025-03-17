package org.mm.order_service.service;

import java.util.List;

import org.mm.order_service.entity.Orders;
import org.mm.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService 
{
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> getAllOrders()
	{
		return orderRepository.findAll();
	}
	
	public Orders getOrderById(Long id)
	{
		return orderRepository.findById(id).orElseThrow();
	}
}
