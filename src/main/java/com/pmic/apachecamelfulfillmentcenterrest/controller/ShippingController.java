package com.pmic.apachecamelfulfillmentcenterrest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmic.apachecamelfulfillmentcenterrest.domain.OrderDto;
import com.pmic.apachecamelfulfillmentcenterrest.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

	private final ShippingService shippingService;

	public ShippingController(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	@PostMapping
	public void addShipments(@RequestBody List<OrderDto> orders) {
		List<Long> orderIds = orders.stream().map(o -> o.getId()).collect(Collectors.toList());
		shippingService.processOrders(orderIds);
	}

}
