package com.climby.controller.util;

import com.climby.dao.data.entity.ProvinceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ControllerMapper {

    ProvinceDTO map(ProvinceDTO item);
}
