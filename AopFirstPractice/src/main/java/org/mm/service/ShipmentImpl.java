package org.mm.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ShipmentImpl implements Shipment {

	@Override
	public String orderPackage(Long orderId) 
	{
//		log.info("Order Package is called ...");
		
		try 
		{
			log.info("processing the order ...");
			Thread.sleep(Duration.ofSeconds(1));
		}
		catch (InterruptedException e) 
		{
			log.error("Error occured while processing the order ...", e);
		}
		return "Order has been processed successfully, orderId : " + orderId;
	}

	@Override
	public String trackPackage(Long orderId) {
		
//		log.info("track package is called ..");
		
		try 
		{
			log.info("Tracking the order ...");
			Thread.sleep(Duration.ofSeconds(1/2));
			throw new RuntimeException("Error occurred during track package ..");
		}
		catch (InterruptedException e) 
		{
			throw new RuntimeException();
		}
	}

}
