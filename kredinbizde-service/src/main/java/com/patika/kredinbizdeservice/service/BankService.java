package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.dto.*;
import com.patika.kredinbizdeservice.model.*;
import com.patika.kredinbizdeservice.repository.BankRepository;
import com.patika.kredinbizdeservice.repository.UserRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    private BankRepository bankRepository = new BankRepository();

    public Bank save(Bank bank) {
    	bankRepository.save(bank);

        return bank;
    }

    public List<Bank> getAll() {
        return bankRepository.getAll();
    }
    public List<CreditCardDto> getCards(String name) {
    	 List<CreditCard> list = bankRepository.getCards(name);
         List<CreditCardDto> cardList = new ArrayList();
         for (CreditCard c : list) {
        	 CreditCardDto cardDto = new CreditCardDto(c.getFee(), c.getCampaignList(), c.getBank().getName()); 
         	cardList.add(cardDto);
         }
         return cardList;
     }
}

