package br.unisinos.edu.AopDemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import br.unisinos.edu.AopDemo.aop.business.CreditScore;



@RestController
public class CreditScoreController {
	
	@Autowired
	private CreditScore creditScore;
	
	@GetMapping("/credit_score/total")
	public Integer retrieveTotalCreditScore() {
		return creditScore.calculate();
	}
	

}
