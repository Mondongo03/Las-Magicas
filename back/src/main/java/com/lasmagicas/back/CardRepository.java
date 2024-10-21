package com.lasmagicas.back;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface CardRepository extends MongoRepository<Card,String>{
}
