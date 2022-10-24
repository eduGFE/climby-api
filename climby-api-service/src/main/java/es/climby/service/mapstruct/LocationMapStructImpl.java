package es.climby.service.mapstruct;


import es.climby.dao.entity.ProvinceDB;
import es.climby.dao.entity.ProvinceDTO;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2022-10-20T15:40:02+0200",
        comments = "version: 1.5.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class LocationMapStructImpl implements LocationMapStruct {


    @Override
    public List<ProvinceDTO> dbToDTO(List<ProvinceDB> provinceDB) {
        if ( provinceDB == null ) {
            return null;
        }

        List<ProvinceDTO> list = new ArrayList<ProvinceDTO>( provinceDB.size() );
        for ( ProvinceDB provinceDB1 : provinceDB ) {
            list.add( provinceDBToProvinceDTO( provinceDB1 ) );
        }

        return list;
    }

    protected ProvinceDTO provinceDBToProvinceDTO(ProvinceDB provinceDB) {
        if ( provinceDB == null ) {
            return null;
        }

        ProvinceDTO provinceDTO = new ProvinceDTO();

        provinceDTO.setName( provinceDB.getName_province() );
        provinceDTO.setNumberTravels( provinceDB.getNumber_travels() );

        return provinceDTO;
    }

}
