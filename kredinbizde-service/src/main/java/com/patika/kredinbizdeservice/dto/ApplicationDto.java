package com.patika.kredinbizdeservice.dto;

import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.patika.kredinbizdeservice.enums.ApplicationStatus;
import com.patika.kredinbizdeservice.model.Loan;
import com.patika.kredinbizdeservice.model.Product;
import com.patika.kredinbizdeservice.model.User;

public class ApplicationDto {
	
	private LoanDto loan;
    private LocalDateTime localDateTime;
    private ApplicationStatus applicationStatus;
    
    public ApplicationDto() {
    }
	public ApplicationDto(LoanDto loan, LocalDateTime localDateTime, ApplicationStatus applicationStatus) {
		super();
		this.loan = loan;
		this.localDateTime = localDateTime;
		this.applicationStatus = applicationStatus;
	}
	
}
