package com.lagou.repository;

import com.lagou.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,String> {

    public List<Person> findByAddress_city(String city);
}
