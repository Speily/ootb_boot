package com.speily.ootb.service_impl;

import com.speily.ootb.dao.mapper.NewsMapper;
import com.speily.ootb.service.MyService;
import com.speily.ootb_entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: SPL
 * @Date: 2019-03-21 14:21
 * @Description:
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News getTest() {

        return newsMapper.selectById(7);
    }
}
