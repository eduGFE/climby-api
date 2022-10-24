package com.yibao.beta.web.controller;

import com.yibao.beta.biz.mapstruct.LocationMapStructImpl;
import com.yibao.beta.biz.service.DemoService;
import es.climby.dao.entity.ProvinceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
    @Autowired
    private LocationMapStructImpl locationMapStruct;

    @GetMapping("test")
    public List<ProvinceDTO> test() {
        return locationMapStruct.dbToDTO(demoService.findAll());
    }
}
