package com.speily.ootb_manager;


import com.speily.ootb_entity.News;
import com.speily.ootb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: SPL
 * @Date: 2019-03-21 14:06
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class MyController {

    @Autowired
    private MyService myService;

    /**
     * 测试
     * @return
     */
    @GetMapping("/")
    @ResponseBody
    public Object test(){
        News test = myService.getTest();
        return test;
    }

}
