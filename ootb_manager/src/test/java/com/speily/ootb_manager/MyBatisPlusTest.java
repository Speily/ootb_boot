package com.speily.ootb_manager;

import com.speily.ootb.dao.mapper.NewsMapper;
import com.speily.ootb_entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: SPL
 * @Date: 2019-03-22 9:58
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    public void testSql(){
        News news = newsMapper.selectById(7);
        System.out.println(news.toString());
    }

}
