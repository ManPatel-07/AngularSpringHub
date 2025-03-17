package org.mm.service;

import org.mm.dao.OrderAnalysisDao;
import org.mm.repository.OrderItemRepository;
import org.mm.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderAnalysisService 
{
	private final OrdersRepository ordersRepository;
	
	private final OrderItemRepository orderItemRepository;
	
	public Object[] summaryMethod()
	{
		return ordersRepository.findOrderStats();
	}
	

    public OrderAnalysisDao getOrderAnalysis() 
    {
//        Object[] stats = ordersRepository.findOrderStats();
//
//        // Map the result to OrderAnalysisDao
//        if (stats != null && stats.length > 0) {
//            OrderAnalysisDao analysis = new OrderAnalysisDao();
//            analysis.setTotalRevenue((Double) stats[0]);
//            analysis.setTotalOrders(((Number) stats[1]).intValue()); // Cast COUNT result to Integer
//            analysis.setAverageOrderValue((Double) stats[2]);
//            return analysis;
//        }
//        return new OrderAnalysisDao(); // Return empty object if no data exists
    	
        Object[] stats = ordersRepository.findOrderStats2();

        OrderAnalysisDao analysis = new OrderAnalysisDao();
        if (stats != null) {
            analysis.setTotalOrders(((Number) stats[0]).intValue()); // COUNT
            analysis.setTotalRevenue((Double) stats[1]);            // SUM
            analysis.setAverageOrderValue((Double) stats[2]);       // AVG
        }
        return analysis;
    }
}
