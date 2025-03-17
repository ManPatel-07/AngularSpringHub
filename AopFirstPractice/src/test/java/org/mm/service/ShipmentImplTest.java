package org.mm.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class ShipmentImplTest {
	
	@Autowired
	private ShipmentImpl shipmentImpl;

	@Test
	void testOrderPackage()
	{
//		shipmentImpl.orderPackage(4L);
		log.info(shipmentImpl.orderPackage(4L));
	}

	@Test
	void testTrackPackage()
	{
		shipmentImpl.trackPackage(4L);
	}

}
