package org.mm.service;

public interface Shipment 
{
	public String orderPackage(Long orderId);
	
	public String trackPackage(Long orderId);
}
