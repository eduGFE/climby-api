package com.yibao.beta.dao.mapper;



import com.yibao.beta.dao.entity.ProvinceDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProvinceMapper {


    List<ProvinceDB> findAll();

}
