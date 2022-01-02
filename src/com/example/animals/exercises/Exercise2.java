package com.example.animals.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.animals.domain.Animal;
import com.example.animals.domain.Cat;
import com.example.animals.domain.Fish;
import com.example.animals.domain.Pet;
import com.example.animals.domain.Spider;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise2 {
	public static void main(String[] args) {
		// Take a list of pets
		
		List<Animal> animals = Arrays.asList(new Cat(), new Spider(), new Cat("Tekir"), new Fish("Free Willy"),
				new Spider(), new Fish("Jaws"));
		
		var result = animals.stream().filter(animal -> Pet.class.isInstance(animal)).collect(Collectors.toSet());
		result.stream().map(animal -> animal.getClass().getSimpleName()).forEach(System.out::println);
		
		;
		
}
}
