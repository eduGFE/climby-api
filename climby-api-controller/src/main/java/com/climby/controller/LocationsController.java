package com.climby.controller;


import com.yibao.beta.biz.mapstruct.LocationMapStructImpl;
import com.yibao.beta.biz.service.DemoService;
import es.climby.dao.entity.ProvinceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationsController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private LocationMapStructImpl locationMapStruct;

    @GetMapping("/provinces")
    public List<ProvinceDTO> test() {
        return locationMapStruct.dbToDTO(demoService.findAll());
    }
}