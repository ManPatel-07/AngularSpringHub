package org.mm.order_service.controller;

import java.util.List;

import org.mm.order_service.entity.Orders;
import org.mm.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/core")
public class OrderController 
{
	@Autowired
	private OrderService orderService;
	
	@GetMapping(path = "/helloOrders")
	public String helloOrders()
	{
		return "Hello from order service ...";
	}
	
	@GetMapping
	public ResponseEntity<List<Orders>> getAllOrders()
	{
		return new ResponseEntity<List<Orders>>(orderService.getAllOrders(), HttpStatus.OK);
	}
	
}
