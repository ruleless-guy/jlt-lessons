package com.jlt.operators;

public class Operator {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		
		int a = 2 + 3;
		int b = 5 - 1;
		int c = 3 * 5;
		int d = 6 / 4;
		int e = 5 % 2;
		
		System.out.println("Arithmetic Operators");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		
		
		//Shift Operators
		
		int f = 3 << 1;  // 0011 -> 0110
		int g = 5 >> 2;  // 0101 ->    1
		int h = 6 >>> 2; // 0110 -> 0001
		
		System.out.println("Shift Operators");
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println();
		
		
		//Bitwise Operators
		
		int i = 3 | 4; // 0011 OR 0100 -> 0111
		int j = 3 & 2; // 0011 AND 0010 -> 0010
		int k = 2 ^ 3; // 0010 XOR 0011 -> 0001
		int l = ~4; //
		
		System.out.println("Bitwise Operators");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println();
		
		
		//Relational Operators
		
		boolean m = 2 > 3;
		boolean n = 2 < 3;
		boolean o = 2 >= 1;
		boolean p = 5 <= 4;
		boolean q = 4 == 3;
		boolean r = 4 != 3;
		
		System.out.println("Relational Operators");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println();
		
		
		//Logical Operators
		
		System.out.println("Logical Operators");
		System.out.println( true && true);
		System.out.println( false && true);
		System.out.println( false && false);
		System.out.println( true || true);
		System.out.println( true || false);
		System.out.println( false|| true);
		System.out.println( false || false);
		System.out.println( !false );
		System.out.println();
		
		
		//Increment Decrement Operators
		
		System.out.println("Unary Operators");
		
		int s = 3;
		int t = 9;
		System.out.println(s++);
		System.out.println(s);
		System.out.println(++t);
		System.out.println(t++);
		System.out.println(++t);
		System.out.println(--s);
		System.out.println(t--);
		System.out.println(--t);
		System.out.println(t);
		System.out.println();
		
		
		//Assignment Operators
		
		System.out.println("Assignment Operators");
		
		int u = 3;
		int v = 7;
		u += v; // u = u + v
		System.out.println(u);
		
		u -= 5; // u = u - 5;
		System.out.println(u);
		
		v *= u; // v = v * u;
		System.out.println(v);
		
		v /= 3; // v = v / 3;
		System.out.println(v);
		
		v %= 2; // v = v %2;
		System.out.println(v);
		
		u |= v; // u = u | v;
		System.out.println(u);
		
		u &= v; // u = u & v;
		System.out.println(u);
		
		u ^= v; // u = u ^ v;
		System.out.println(u);
		
		v <<= 1; // v = v << 1;
		System.out.println(u);
		
		System.out.println();
		
		//Ternary Operator
		int age = 17;
		System.out.println("Ternary Operator");
		System.out.println( age >= 18 ? "Congratulation":"Sorry" );
		System.out.println();

	}
	
}
