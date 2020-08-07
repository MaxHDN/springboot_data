package com.lagou.mapper;

import com.lagou.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper  // 可以在启动类上，加上@MapperScan("basePackage")替代在每一个Mapper类上用@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM t_comment where id=#{id}")
    public Comment findById(Integer id);
}
