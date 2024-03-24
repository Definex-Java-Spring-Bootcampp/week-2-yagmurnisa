package com.patika.kredinbizdeservice.dto;

import java.math.BigDecimal;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;

public class CreditCardDto {

	private BigDecimal fee;
    private List<Campaign> campaignList;
    private String bank;
    
    public CreditCardDto() {
    	
    }
    
	public CreditCardDto(BigDecimal fee, List<Campaign> campaignList, String bank) {
		super();
		this.fee = fee;
		this.campaignList = campaignList;
		this.bank = bank;
	}
    
}
