package es.climby.service.impl;


import es.climby.dao.entity.ProvinceDB;
import es.climby.dao.mapper.ProvinceMapper;
import es.climby.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceDB> findAll() {
        return provinceMapper.findAll();

    }
}
