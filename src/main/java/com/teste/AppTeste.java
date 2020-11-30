package com.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AppTeste {
	
	
	@GetMapping("/ola")
	public String olaMundo(String nome)
	{
		
		return "V2: Ola " + nome;
	}

}
