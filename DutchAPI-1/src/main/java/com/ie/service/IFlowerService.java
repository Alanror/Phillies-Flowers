package com.ie.service;

import com.ie.bean.Flower;
import java.util.List;

public interface IFlowerService {

    public List<Flower> findAll();
    public Flower findByName(String name);
}