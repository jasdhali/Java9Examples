package com.java.practice.nestedclasses;

/**
 * 
 * @author jaspal
 *
 */
public class MemberInnerClassDemoOuter {
	private String greeting = "hi";

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++)
				System.out.println(greeting);
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		MemberInnerClassDemoOuter demoOuter = new MemberInnerClassDemoOuter();
		demoOuter.callInner();
		
		Inner innerIns = (new MemberInnerClassDemoOuter()).new Inner();
		innerIns.go();
	}
}
