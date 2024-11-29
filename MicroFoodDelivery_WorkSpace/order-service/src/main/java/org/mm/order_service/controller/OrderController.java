package org.mm.order_service.controller;

import org.mm.order_service.entity.Order;
import org.mm.order_service.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/orders")
public class OrderController 
{
	private final OrderService orderService;
	
	@PostMapping()
	public ResponseEntity<?> createNewOrder(@RequestBody Order order)
	{
		return new ResponseEntity<>(orderService.newOrder(order), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllOrdersDetails()
	{
		return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getOrderById(@RequestParam("id") Long id)
	{
		return new ResponseEntity<>(orderService.getOrderById(id), HttpStatus.OK); 
	}
	
}
