package com.leofight.gulimall.member.dao;

import com.leofight.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 16:01:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
