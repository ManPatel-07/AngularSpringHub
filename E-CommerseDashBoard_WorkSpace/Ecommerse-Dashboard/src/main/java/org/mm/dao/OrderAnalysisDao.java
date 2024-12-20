package org.mm.dao;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderAnalysisDao 
{
	private Integer totalOrders;
	private Double totalRevenue;
	private Double averageOrderValue;
}
