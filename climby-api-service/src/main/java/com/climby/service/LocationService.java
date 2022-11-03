package com.climby.service;


import com.climby.vo.locations.ProvinceDTO;

import java.util.List;

public interface LocationService {

    List<ProvinceDTO> findAll();
}
