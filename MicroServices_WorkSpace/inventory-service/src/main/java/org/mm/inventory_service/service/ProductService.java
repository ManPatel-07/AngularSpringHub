package org.mm.inventory_service.service;

import java.util.Iterator;
import java.util.List;

import org.mm.inventory_service.entity.OrderRequest;
import org.mm.inventory_service.entity.OrderRequestItem;
import org.mm.inventory_service.entity.Product;
import org.mm.inventory_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllInventory()
	{
		return productRepository.findAll();
	}
	
	public Product getProductById(Long id)
	{
		return productRepository.findById(id).orElseThrow();
	}

	public Double reduceStocks(OrderRequest orderRequest)
	{
		for(OrderRequestItem orderRequestItem: orderRequest.getItems())
		{
			Long productId = orderRequestItem.getProductId();
			Integer qantity = orderRequestItem.getQantity();
		
			productRepository.findById(productId).orElseThrow(() -> 
				new RuntimeException("Product NOt Found "));
			
		}
		return null;
	}
}
