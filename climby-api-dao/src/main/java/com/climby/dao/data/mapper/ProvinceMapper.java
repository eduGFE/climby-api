package com.climby.dao.data.mapper;



import com.climby.vo.locations.ProvinceDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProvinceMapper {

    List<ProvinceDB> findAll();
}
