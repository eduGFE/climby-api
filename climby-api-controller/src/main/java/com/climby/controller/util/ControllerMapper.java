package com.climby.controller.util;

import com.climby.dao.entity.ProvinceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ControllerMapper {

    com.climby.dao.entity.ProvinceDTO map(ProvinceDTO item);
}
