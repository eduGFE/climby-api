package es.climby.service;


import es.climby.dao.entity.ProvinceDB;

import java.util.List;

public interface LocationService {


    List<ProvinceDB> findAll();
}
