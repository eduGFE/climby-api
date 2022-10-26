package com.climby.service;



import com.climby.dao.data.entity.ProvinceDTO;

import java.util.List;

public interface LocationService {

    List<ProvinceDTO> findAll();
}
