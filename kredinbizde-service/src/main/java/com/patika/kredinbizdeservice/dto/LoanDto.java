package com.patika.kredinbizdeservice.dto;

import java.math.BigDecimal;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.patika.kredinbizdeservice.model.Bank;


public class LoanDto {

	private BigDecimal amount;
    private Integer installment;
    private String bank;
    private Double interestRate;
    
    public LoanDto() {
    	
    }
	public LoanDto(BigDecimal amount, Integer installment, String bank, Double interestRate) {
		super();
		this.amount = amount;
		this.installment = installment;
		this.bank = bank;
		this.interestRate = interestRate;
	}
    
}
