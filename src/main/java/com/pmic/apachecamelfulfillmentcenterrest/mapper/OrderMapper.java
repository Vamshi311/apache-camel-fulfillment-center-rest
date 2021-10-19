package com.pmic.apachecamelfulfillmentcenterrest.mapper;


import java.util.List;

import org.mapstruct.Mapper;

import com.pmic.apachecamelfulfillmentcenterrest.domain.OrderDto;
import com.pmic.apachecamelfulfillmentcenterrest.entity.OrderEntity;

@Mapper
public interface OrderMapper {

	OrderDto mapToDto(OrderEntity order);

	OrderEntity mapFromDto(OrderDto orderDto);

	List<OrderDto> mapToDtos(List<OrderEntity> orders);

	List<OrderEntity> mapFromDtos(List<OrderDto> orderDtos);
}
