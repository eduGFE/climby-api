package com.climby.service.impl;


import com.climby.dao.data.entity.ProvinceDTO;
import com.climby.dao.data.mapper.ProvinceMapper;
import com.climby.service.LocationService;
import com.climby.service.mapstruct.LocationMapStruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Autowired
    private LocationMapStruct locationMapStruct;

    @Override
    public List<ProvinceDTO> findAll() {

        return locationMapStruct.dbToDTO(provinceMapper.findAll());

    }
}
