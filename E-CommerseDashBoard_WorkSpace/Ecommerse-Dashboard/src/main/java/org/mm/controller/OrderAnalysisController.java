package org.mm.controller;

import org.mm.dao.OrderAnalysisDao;
import org.mm.service.OrderAnalysisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class OrderAnalysisController 
{
	private final OrderAnalysisService orderService;
	
	@GetMapping(path = "/summary")
	private ResponseEntity<?> summaryData()
	{
		return new ResponseEntity<>(orderService.summaryMethod(), HttpStatus.OK);
	}
	
    @GetMapping("/analysis")
    public ResponseEntity<OrderAnalysisDao> getOrderAnalysis() {
        OrderAnalysisDao orderStats = orderService.getOrderAnalysis();
        return ResponseEntity.ok(orderStats);
    }
}
