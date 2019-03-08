package com.gau.test1;

public class Cube {
	public static void main(String args[]) {
	/*	Drawable d = new Rectangle();
		d.draw();
	*/	System.out.println(Drawable.cube(3));
	}

	class Rectangle implements Drawable {
		public void draw() {
			System.out.println("drawing rectangle");
		}

		@Override
		public void draw1() {
			// TODO Auto-generated method stub
			
		}

		
	}

	interface Drawable {
		void draw();
		void draw1();

		static int cube(int x) {
			return x * x * x;
		}
	}

}
