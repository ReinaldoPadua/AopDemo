package br.unisinos.edu.AopDemo.aop.business;

import org.springframework.stereotype.Service;

@Service
public class CreditScore {
	
	public Integer calculate() {
		return 999;
	}
	
}
