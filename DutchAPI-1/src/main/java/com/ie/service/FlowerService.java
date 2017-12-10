package com.ie.service;

import com.ie.bean.Flower;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlowerService implements IFlowerService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<Flower> findAll() {

        String sql = "SELECT * FROM Flowers";

        List<Flower> flowers = jtm.query(sql, new BeanPropertyRowMapper(Flower.class));

        return flowers;
    }

    @Override
    public Flower findByName(String name) {

        String sql = "SELECT * FROM FLOWERS WHERE Name=?";

        Flower flower = (Flower) jtm.queryForObject(sql, new Object[]{name},
                new BeanPropertyRowMapper(Flower.class));

        return flower;
    }
}