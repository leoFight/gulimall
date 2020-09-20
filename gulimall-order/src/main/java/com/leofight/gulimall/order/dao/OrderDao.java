package com.leofight.gulimall.order.dao;

import com.leofight.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 17:48:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
