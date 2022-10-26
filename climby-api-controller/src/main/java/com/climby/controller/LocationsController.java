package com.climby.controller;


import com.climby.controller.util.ControllerMapper;
import com.climby.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locations")
public class LocationsController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private ControllerMapper controllerMapper;


    @GetMapping("/provinces")
    public ResponseEntity<List<com.climby.dao.entity.ProvinceDTO>> findAllProvinces() {
        return ResponseEntity.ok(locationService.findAll().stream().map(item -> controllerMapper.map(item)).collect(Collectors.toList()));
    }
}