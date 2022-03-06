package com.huang.Utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ProjectName: blog
 * @Package: com.huang.Utils
 * @ClassName: BeanCopyUtils
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 18:41
 */
public class BeanCopyUtils {

    private BeanCopyUtils() {
    }

    public static <T> T copyBean(Object source, Class<T> clazz) {
        //创建目标对象
        T result = null;
        try {
            result = clazz.newInstance();
            //实现属性copy
            BeanUtils.copyProperties(source, result);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //返回结果
        return result;
    }

    public static <T> List<T> copyBeanList(List<T> list, Class<T> clazz) {
        return list.stream()
                .map(o -> copyBean(o, clazz))
                .collect(Collectors.toList());
    }

}