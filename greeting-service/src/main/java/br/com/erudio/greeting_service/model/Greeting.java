package br.com.erudio.greeting_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {
	
	private final long id;
	private final String content;
}
