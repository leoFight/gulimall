package com.leofight.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leofight.common.utils.PageUtils;
import com.leofight.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 15:52:27
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

