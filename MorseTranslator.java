package com.qa.hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseTranslator {
	
	private final Map<String, String> morseTranslator;
	
	public MorseTranslator(){
		
		this.morseTranslator = new HashMap<>();
		
		this.morseTranslator.put(".-","A");
		this.morseTranslator.put("-...","B");
		this.morseTranslator.put("-.-.","C");
		this.morseTranslator.put("-..","D");
		this.morseTranslator.put(".","E");
		this.morseTranslator.put("..-.","F");
		this.morseTranslator.put("--.","G");
		this.morseTranslator.put("....","H");
		this.morseTranslator.put("..","I");
		this.morseTranslator.put(".---","J");
		this.morseTranslator.put("-.-","K");
		this.morseTranslator.put(".-..","L");
		this.morseTranslator.put("--","M");
		this.morseTranslator.put("-.","N");
		this.morseTranslator.put("---","O");
		this.morseTranslator.put(".--.","P");
		this.morseTranslator.put("--.-","Q");
		this.morseTranslator.put(".-.","R");
		this.morseTranslator.put("...","S");
		this.morseTranslator.put("-","T");
		this.morseTranslator.put("..-","U");
		this.morseTranslator.put("...-","V");
		this.morseTranslator.put(".--","W");
		this.morseTranslator.put("-..-","X");
		this.morseTranslator.put("-.--","Y");
		this.morseTranslator.put("--..","Z");
		
		
		this.morseTranslator.put("/", " ");
		
	}

	public String translate(String input) {
		return Arrays.stream(input.split(" "))
	            .map(n -> this.morseTranslator.get(n))
	            .collect(Collectors.joining(""));
    }
}
