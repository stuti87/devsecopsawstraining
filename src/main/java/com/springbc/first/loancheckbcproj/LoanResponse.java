package com.springbc.first.loancheckbcproj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {


	int status;
    public LoanResponse(int status, int approvedLoanAmount) {
		super();
		this.status = status;
		this.approvedLoanAmount = approvedLoanAmount;
	}
	int approvedLoanAmount;

}
