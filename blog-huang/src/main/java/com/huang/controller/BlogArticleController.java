package com.huang.controller;

import com.huang.domain.ResponseResult;
import com.huang.domain.entity.BlogArticle;
import com.huang.service.BlogArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: blog
 * @Package: com.huang.controller
 * @ClassName: BlogArticleController
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 16:14
 */
@RestController
@RequestMapping("/article")
public class BlogArticleController {

    @Autowired
    private BlogArticleService blogArticleService;

//    @GetMapping("/list")
//    public List<BlogArticle> test(){
//        return blogArticleService.list();
//    }

    @GetMapping("hotArticleList")
    public ResponseResult hotArticleList(){
        //查询热门文章，封装成ResponseResult返回
        ResponseResult result = blogArticleService.hotArticleList();
        return result;
    }

}
