package com.xz.crudopeations;

public class chocolates {

	private static final String[] chocolates = null;
	private String flavour = new String();
	private String[] chocolate = new String[5];
	private int counter = 0;

	public chocolates() {
		this("FLAVOUR");
		System.out.println("calling BeachNames no.of argument constant");
	}

	public chocolates(String flavour) {
		this.flavour = flavour;
		System.out.println("invoked BeachNames String constant");
	}

	public String getFlavour() {
		return flavour;
	}

	public void chocolates(String name) {
		System.out.println("invoked addchocolates");
		System.out.println("Name args:".concat(name));
		if (this.counter < 5) {
			this.chocolates[this.counter] = name;
			this.counter++;
		} else {
			System.out.println("array  is full ,cannot add");
		}
	}

	public void displaychocolates() {
		System.out.println("invoked displaychocolates");
		for (int chakli = 0; chakli < this.chocolates.length; chakli++) {
			String name1 = this.chocolates[chakli];
			System.out.println(name1);

		}

	}

}
