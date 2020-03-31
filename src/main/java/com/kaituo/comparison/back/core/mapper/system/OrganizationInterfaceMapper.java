package com.kaituo.comparison.back.core.mapper.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaituo.comparison.back.core.entity.system.OrganizationInterface;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrganizationInterfaceMapper extends BaseMapper<OrganizationInterface> {
}
