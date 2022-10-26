package com.climby.dao.mapper;



import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProvinceMapper {

    List<com.climby.dao.entity.ProvinceDB> findAll();
}
