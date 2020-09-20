package com.leofight.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leofight.common.utils.PageUtils;
import com.leofight.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 15:52:27
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

