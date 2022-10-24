package es.climby.service.mapstruct;


import es.climby.dao.entity.ProvinceDB;
import es.climby.dao.entity.ProvinceDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LocationMapStruct {

    List<ProvinceDTO> dbToDTO(List<ProvinceDB> provinceDB);

}
