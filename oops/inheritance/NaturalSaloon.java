package com.vignesh.INHERITANCE;

public class NaturalSaloon extends Saloon {

	 String name="PRABHAS";
	 String name1="ACTOR";
	
	public NaturalSaloon()

	{
		super();

		System.out.println("invoking no arguements constructor");
	}

	public NaturalSaloon(String name, String name1) {
		
		System.out.println("invoking arguents constuctors");
		
	}
	
	
}
