package org.mm.order_service.service;

import java.util.List;

import org.mm.order_service.entity.Order;
import org.mm.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService 
{
	private final OrderRepository orderRepo;
		
	public Order newOrder(Order order)
	{
		return orderRepo.save(order);
	}
	
	public List<Order> getAllOrders()
	{
		return orderRepo.findAll();
	}
	
	public Order getOrderById(Long id)
	{
		return orderRepo.findById(id).orElseThrow();
	}
	
	public Order orderByCustomerId(Long customerId)
	{
		return orderRepo.findByCustomerId(customerId);
	}
	
}
