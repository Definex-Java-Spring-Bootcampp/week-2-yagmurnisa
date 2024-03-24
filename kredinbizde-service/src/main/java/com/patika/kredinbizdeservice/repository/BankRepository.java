package com.patika.kredinbizdeservice.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.patika.kredinbizdeservice.dto.CreditCardDto;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;

public class BankRepository {
	
	 private List<Bank> bankList = new ArrayList<>();
	 
	 //for testing
	 private void createBanks() {
		 Bank bank1 = new Bank();
		 Bank bank2 = new Bank();
		 bank1.setName("Akbank");
		 bank2.setName("ING");
		 Campaign camp1 = new Campaign();
		 camp1.setTitle("campaign 1");
		 Campaign camp2 = new Campaign();
		 camp2.setTitle("campaign 2");
		 CreditCard card1 = new CreditCard(new BigDecimal(10000), Arrays.asList(camp1));
		 CreditCard card2 = new CreditCard(new BigDecimal(20000), Arrays.asList(camp1, camp2));
		 bank1.setCreditCards(Arrays.asList(card1));
		 bank2.setCreditCards(Arrays.asList(card2));
		 bankList.add(bank2);
		 bankList.add(bank1);
	 }
	 
	    public void save(Bank bank) {
	    	bankList.add(bank);
	    }

	    public List<Bank> getAll() {
	        return bankList;
	    }

	    public List<CreditCard> getCards(String name) {
	    	createBanks();
	    	return bankList.stream().filter(b -> b.getName().toLowerCase()
	    			.equals(name))
	    			.flatMap(b -> b.getCreditCards().stream())
	    			.toList();
	    }

	    public void delete(Bank bank) {
	    	bankList.remove(bank);
	    }
	}
