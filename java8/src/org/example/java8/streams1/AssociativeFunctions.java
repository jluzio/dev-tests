package org.example.java8.streams1;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.BinaryOperator;

public class AssociativeFunctions {
	
	public static void main(String[] args) {
		Collection<String> texts = Arrays.asList("a", "b", "c", "d", "e", "f");
		BinaryOperator<String> nonAssociativeAccumulator = (acc,t) -> {
			String joinedText = acc+t;
			return joinedText + joinedText.length();
		};
		BinaryOperator<String> associativeAccumulator = (acc,t) -> acc+t;
		
		String joinTexts = texts
			.stream()
			.reduce("", nonAssociativeAccumulator);
		System.out.println(joinTexts);
		
		String joinTexts2 = texts
				.stream()
				.parallel()
				.reduce("", nonAssociativeAccumulator);
		System.out.println(joinTexts2);

		String joinTexts3 = texts
			.stream()
			.reduce("", associativeAccumulator);
		System.out.println(joinTexts3);
				
		String joinTexts4 = texts
			.stream()
			.parallel()
			.reduce("", associativeAccumulator);
		System.out.println(joinTexts4);
			
	}

}
