package com.huang.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: blog
 * @Package: com.huang.domain.vo
 * @ClassName: HotArticleVo
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 18:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo {
    private Long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}
