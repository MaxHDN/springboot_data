package com.lagou.springboot_data;

import com.lagou.domain.Address;
import com.lagou.domain.Person;
import com.lagou.mapper.ArticleMapper;
import com.lagou.mapper.CommentMapper;
import com.lagou.pojo.Article;
import com.lagou.pojo.Comment;
import com.lagou.repository.ArticleRepository;
import com.lagou.repository.CommentRepository;
import com.lagou.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDataApplicationTests {

    // 测试springboot整合mybatis
    @Autowired
    CommentMapper commentMapper;

    @Test
    void testCommentMapper() {
        Comment comment = commentMapper.findById(4);
        System.out.println(comment);
    }

    // 测试springboot整合mybatis
    @Autowired
    ArticleMapper articleMapper;

    @Test
    void testArticleMapper() {
        Article article = articleMapper.findById(1);
        System.out.println(article);
    }

    // 测试springboot整合spring data jpa
    @Autowired
    CommentRepository commentRepository;

    @Test
    void testCommentRepository() {
        Optional<com.lagou.entity.Comment> comment = commentRepository.findById(1);
        System.out.println(comment);
    }

    // 测试springboot整合spring data jpa
    @Autowired
    ArticleRepository articleRepository;

    @Test
    void testArticleRepository() {
        Optional<com.lagou.entity.Article> article = articleRepository.findById(1);
        System.out.println(article);
    }


    // 测试springboot整合redis
    @Autowired
    PersonRepository personRepository;

    @Test
    void testSavePersonToRedis(){
        Person person = new Person();
        person.setFirstname("zhang");
        person.setLastname("san");

        Address address = new Address();
        address.setCity("广州");
        address.setCountry("中国");
        person.setAddress(address);
        personRepository.save(person);
    }

    @Test
    void testPersonRepository(){
        List<Person> persons = personRepository.findByAddress_city("广州");
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
