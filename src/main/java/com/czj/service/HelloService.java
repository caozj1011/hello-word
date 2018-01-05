package com.czj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by caozhiia on 2018/1/5.
 */
@Service
public class HelloService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Map<String,Object>> toQuery(String sql){
        return jdbcTemplate.queryForList(sql);
    }

    public int toInsert(String s, String name, int i, int i1, int i2, int i3) {
        int update = jdbcTemplate.update(s, name, i, i1, i2);
        return update;
    }


}
