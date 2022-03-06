package com.huang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.constants.SystemConstants;
import com.huang.domain.ResponseResult;
import com.huang.domain.entity.BlogArticle;
import com.huang.domain.vo.HotArticleVo;
import com.huang.mapper.BlogArticleMapper;
import com.huang.service.BlogArticleService;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: blog
 * @Package: com.huang.service.impl
 * @ClassName: BlogArticleServiceImpl
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 16:09
 */
@Service
@Log4j2
public class BlogArticleServiceImpl extends ServiceImpl<BlogArticleMapper, BlogArticle> implements BlogArticleService {

    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章，封装成ResponseResult返回
        LambdaQueryWrapper<BlogArticle> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(BlogArticle::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        //按照热度进行排序
        queryWrapper.orderByDesc(BlogArticle::getViewCount);
        //最多只查询10条
        Page<BlogArticle> page = new Page(1,10);
        page(page,queryWrapper);

        List<BlogArticle> articles = page.getRecords();

        //bean拷贝
        List<HotArticleVo> articleVos = new ArrayList<>();

        for (BlogArticle article : articles) {
            HotArticleVo vo = new HotArticleVo();
            BeanUtils.copyProperties(article, vo);
            articleVos.add(vo);
        }

        return ResponseResult.okResult(articleVos);
    }
}
