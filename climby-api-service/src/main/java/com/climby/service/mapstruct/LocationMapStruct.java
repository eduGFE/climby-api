package com.climby.service.mapstruct;

import com.climby.vo.locations.ProvinceDB;
import com.climby.vo.locations.ProvinceDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapStruct {

    List<ProvinceDTO> dbToDTO(List<ProvinceDB> provinceDB);

}
