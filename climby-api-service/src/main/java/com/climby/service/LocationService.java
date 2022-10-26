package com.climby.service;



import java.util.List;

public interface LocationService {

    List<com.climby.dao.entity.ProvinceDTO> findAll();
}
