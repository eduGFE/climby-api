package com.climby.controller.util;

import com.climby.vo.locations.ProvinceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ControllerMapper {
    @Mapping(target = "nameProvince", source="name_province")
    @Mapping(target = "numberTravels", source="number_travels")
    com.climby.contract.vo.ProvinceDTO map(ProvinceDTO item);
}
