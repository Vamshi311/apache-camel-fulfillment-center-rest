package com.pmic.apachecamelfulfillmentcenterrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pmic.apachecamelfulfillmentcenterrest.entity.OrderStatus;
import com.pmic.apachecamelfulfillmentcenterrest.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ShippingService {

	private final OrderRepository orderRepository;

	public ShippingService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public void processOrders(List<Long> orderIds) {
		log.info("Processing  orders at fulfillment center rest {}", orderIds);
		orderRepository.upadteOrderStatus(orderIds, OrderStatus.PROCESSED);
		log.info("Finished processing orders at fulfillment center rest");
	}
}
