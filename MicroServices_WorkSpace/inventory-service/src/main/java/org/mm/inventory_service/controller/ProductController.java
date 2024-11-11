package org.mm.inventory_service.controller;

import java.util.List;

import org.mm.inventory_service.entity.Product;
import org.mm.inventory_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;


@RestController
@RequestMapping("/products")
public class ProductController
{
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestClient restclient;
	
	@GetMapping(path = "/fetchOrders")
	public String fetchOrders()
	{
		ServiceInstance orderService = discoveryClient.getInstances("order-service").getFirst();
		
		return restclient.get()
				.uri(orderService.getUri()+ "/api/v1/orders/helloOrders")
				.retrieve()
				.body(String.class);
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
}
