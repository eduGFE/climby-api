package es.climby.dao.mapper;


import es.climby.dao.entity.ProvinceDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProvinceMapper {

    List<ProvinceDB> findAll();
}
