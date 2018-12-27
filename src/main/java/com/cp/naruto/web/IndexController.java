package com.cp.naruto.web;

import com.alibaba.fastjson.JSON;
import com.cp.naruto.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: chenpeng
 */
@Controller
@RequestMapping("/naruto")
@CrossOrigin
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index")
    @ResponseBody
    public String test() {
        return JSON.toJSONString(userRepository.findAll());
    }

    @RequestMapping("/go")
    @ResponseBody
    public String go() {
        return "index";
    }
}
