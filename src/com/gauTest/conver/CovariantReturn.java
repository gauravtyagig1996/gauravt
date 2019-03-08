package com.gauTest.conver;

class b {

	b get() {

		return this;
	}
}

public class CovariantReturn extends b {

	CovariantReturn get() {

		return this;
	}

	void message() {
		System.out.println("welcome");
	}

	public static void main(String args[]){
			
			new CovariantReturn().get().message();
		}
}
