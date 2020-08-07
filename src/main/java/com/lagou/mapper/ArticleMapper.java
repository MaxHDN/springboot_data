package com.lagou.mapper;

import com.lagou.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

//@Mapper //  可以在启动类上，加上@MapperScan("basePackage")替代在每一个Mapper类上用@Mapper
public interface ArticleMapper {

    public Article findById(Integer id);
}
