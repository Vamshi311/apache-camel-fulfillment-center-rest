package com.pmic.apachecamelfulfillmentcenterrest.domain;

import java.math.BigDecimal;

import com.pmic.apachecamelfulfillmentcenterrest.entity.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

	private Long id;

	private String address;

	private BigDecimal total;

	private String purchaser;

	private String seller;

	private OrderStatus status;

	private String fulfillmentCenter;
}
