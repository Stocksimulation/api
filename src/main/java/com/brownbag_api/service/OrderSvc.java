package com.brownbag_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brownbag_api.model.Order;
import com.brownbag_api.repo.OrderRepo;

@Service
public class OrderSvc {
	
	@Autowired
	private OrderRepo orderRepo;

	public void place(Order order) {
		order.setAmount(order.getPrice() * order.getQty());
		orderRepo.save(order);
	}

}
