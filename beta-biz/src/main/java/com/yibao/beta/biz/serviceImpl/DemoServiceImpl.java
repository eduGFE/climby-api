package com.yibao.beta.biz.serviceImpl;


import com.yibao.beta.biz.service.DemoService;
import es.climby.dao.entity.ProvinceDB;
import es.climby.dao.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<ProvinceDB> findAll() {
        List<ProvinceDB> p = provinceMapper.findAll();
        return p;

    }
}
