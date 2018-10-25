package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.service.BlogProperties;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@RestController
public class HelloController {
	@Autowired
	private BlogProperties blogProperties;

    @RequestMapping("/hello")
    public String index() {
    	System.out.println(blogProperties.getName());
        return "Hello World";
    }

}