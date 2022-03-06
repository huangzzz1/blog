package com.huang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huang.domain.entity.BlogArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: blog
 * @Package: com.huang.mapper
 * @ClassName: BlogArticleMapple
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 16:04
 */
@Mapper
public interface BlogArticleMapper extends BaseMapper<BlogArticle> {

}
