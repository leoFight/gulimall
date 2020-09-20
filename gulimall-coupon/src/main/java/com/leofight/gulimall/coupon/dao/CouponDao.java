package com.leofight.gulimall.coupon.dao;

import com.leofight.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 15:52:27
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
