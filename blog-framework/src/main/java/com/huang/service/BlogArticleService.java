package com.huang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huang.domain.ResponseResult;
import com.huang.domain.entity.BlogArticle;

/**
 * @Progect: blog
 * @InterfaceName: BlogAriticleService
 * @description: TODO
 * @Author: huang zhiwei
 * @Version: TODO
 * @Create: 2022/02/26 16:07
 */
public interface BlogArticleService extends IService<BlogArticle> {

    ResponseResult hotArticleList();
}
