package com.climby.service.mapstruct;

import com.climby.dao.data.entity.ProvinceDTO;
import com.climby.dao.data.entity.ProvinceDB;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapStruct {

    List<ProvinceDTO> dbToDTO(List<ProvinceDB> provinceDB);

}
