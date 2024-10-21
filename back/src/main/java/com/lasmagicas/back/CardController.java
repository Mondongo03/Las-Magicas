package com.lasmagicas.back;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;



    @GetMapping("/getAllCard")
    public Page<Card> getAllUser(){
        return cardRepository.findAll(Pageable.ofSize(25));
    }


    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }
}
