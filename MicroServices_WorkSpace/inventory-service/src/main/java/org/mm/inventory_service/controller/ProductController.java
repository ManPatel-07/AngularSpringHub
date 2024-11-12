package org.mm.inventory_service.controller;

import java.util.List;

import org.mm.inventory_service.clients.OrdersFeignClient;
import org.mm.inventory_service.entity.OrderRequest;
import org.mm.inventory_service.entity.Product;
import org.mm.inventory_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/products")
public class ProductController
{
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestClient restclient;
	
	@Autowired
	private OrdersFeignClient ordersFeignClient;
	
	@GetMapping(path = "/fetchOrders")
	public String fetchOrders(HttpServletRequest httpServletRequest)
	{
		log.info(httpServletRequest.getHeader("X-Pqr-Header"));
		
		return ordersFeignClient.helloOrders();
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllInventory()
	{
		return new ResponseEntity<>(productService.getAllInventory(), HttpStatus.OK); 
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> getInventoryById(@PathVariable("id") Long id)
	{
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}

	
	@PutMapping(path = "/reduce-stock")
	public ResponseEntity<Double> reduceStocks(@RequestBody OrderRequest orderRequest)
	{
		Double totalPrice = productService.reduceStocks(orderRequest);
		return ResponseEntity.ok(totalPrice);
	}
}
