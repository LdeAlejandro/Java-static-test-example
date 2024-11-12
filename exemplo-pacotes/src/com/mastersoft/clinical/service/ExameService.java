package com.mastersoft.clinical.service;

import com.mastersoft.clinical.model.Exame;

public class ExameService {
	
	public static void main (String[] args) {
		
		//se ó metodo salvarExame() não for static como o main então deve ser instanciado um objeto para conseguir chamar o metodo;
		ExameService service = new ExameService();
		service.salvarExame();
	}
	
	
	
	void salvarExame() {
		Exame.test();
		String classVariableValue = Exame.variable;
		
		System.out.println(classVariableValue);
		
		Exame.variable = "new String";
		
		System.out.println(Exame.variable);
	}

}
