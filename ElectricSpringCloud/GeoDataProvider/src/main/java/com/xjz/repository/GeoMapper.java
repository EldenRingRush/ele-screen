package com.xjz.repository;

import com.xjz.entity.GeoData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GeoMapper {
    @Select("select * from production order by time desc limit 1")
    public GeoData findLast();
}
