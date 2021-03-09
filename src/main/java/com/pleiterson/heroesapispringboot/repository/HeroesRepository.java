package com.pleiterson.heroesapispringboot.repository;

import com.pleiterson.heroesapispringboot.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public class HeroesRepository extends CrudRepository<Heroes, String> {
    
}
