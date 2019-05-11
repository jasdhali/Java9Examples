package com.java.practice.nestedclasses;

public class MultiLevelInnerClass {
	private int x = 10;
	
	class B {
		private int x = 20;
		class C {
			private int x = 30;
			
			public void allTheX() {
				System.out.println( x );
				System.out.println( this.x );
				System.out.println( B.this.x );
				System.out.println( MultiLevelInnerClass.this.x );
			}
		}
	}
	
	public static void main(String[] args) {
		MultiLevelInnerClass multiLevelInnerClass = 
				new MultiLevelInnerClass();
		MultiLevelInnerClass.B b = multiLevelInnerClass.new B();
		MultiLevelInnerClass.B.C c = b.new C();
		c.allTheX();
	}
}