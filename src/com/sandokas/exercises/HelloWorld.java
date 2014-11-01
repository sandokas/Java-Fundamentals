package com.sandokas.exercises;

import java.util.ArrayList;

import com.sandokas.exercises.inheritance.ElectronicDevice;
import com.sandokas.exercises.inheritance.Employee;
import com.sandokas.exercises.inheritance.Manager;
import com.sandokas.exercises.inheritance.Television;

/*
interface Side { String getSide(); }
class Head implements Side {
 public String getSide() { return "Head "; }
}
class Tail implements Side {
	 public String getSide() { return "Tail "; }
}
*/
public class HelloWorld {
	
	public static void main(String ... args) {
		
		ElectronicDevice e = new Television("Samsung");
		//Television t = (Television) e;
		//t._manufacturer = "Pioneer";
		System.out.println("ElectronicDevice manufacturer: " + e.getManufacturer());
		
		
		//System.out.println("First line");
		//Employee e = new Manager();
		
		//e.lixo(new Manager());
	}
	/*
	void probe(Integer x) { System.out.println("In Integer"); } //2 
	void probe(Object x) { System.out.println("In Object"); } //3 
	void probe(Long x) { System.out.println("In Long"); } //4 
	 public static void foo(Integer i) { System.out.println("foo(Integer)"); }
	 public static void foo(short i) { System.out.println("foo(short)"); }
	 public static void foo(long i) { System.out.println("foo(long)"); }
	 public static void foo(int ... i) { System.out.println("foo(int ...)"); }/*
	public static void main(String[] args)
		foo(10);
		 {
		Integer i = 10;
		Integer j = 11;
		Integer k = ++i;
		System.out.println((k==j));
		System.out.println(k.equals(j));
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.equals(arr1, arr2));
		
		String str = null;
		if (str instanceof Object)
			System.out.println(true);
		else
			System.out.println(false);
		
	}*/
/*
	 public static void overload(Head side) { System.out.print(side.getSide()); }
	 public static void overload(Tail side) { System.out.print(side.getSide()); }
	 public static void overload(Side side) { System.out.print("Side "); }
	 public static void overload(Object side) { System.out.print("Object "); }
	 
	 public static void main(String []args) {
	 Side firstAttempt = new Head();
	 Tail secondAttempt = new Tail();
	 overload(firstAttempt);
	 overload((Object)firstAttempt);
	 overload(secondAttempt);
	 overload((Side)secondAttempt);
	}
*/	
	public static void backup2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		System.out.println(list.size());
		list.add("li");
		System.out.println(list.size());
		list.add(null);
		System.out.println(list.size());
		list.add(null);
		System.out.println(list.size());
		list.add("la");
		System.out.println(list.size());
		list.add(null);
		System.out.println(list.size());
		list.add("la");
		System.out.println(list.size());
		
		for (String s : list) {
			if ("la".equals(s)){
				System.out.println("Encontrei la");
			}
			/*
			if (s != null) {
				System.out.println(s);
			}
			*/
		}/*
		ArrayList<String> listLa = new ArrayList<String>();
		listLa.add("la");
		System.out.println(list.contains(null));
		System.out.println(list.contains("la"));
		list.removeAll(listLa);
		for (String s : list) {
			if (s != null) {
				System.out.println(s);
			}
		}*/
	}
	public static void backup() {
	int k = 0; 
	int m = 0; 
	for ( int i = 0; i <= 3; i++){ 
		k++; 
		if ( i == 2){ 
			i = 4;
		} 
		m++; 
	} 
	System.out.println( k + ", " + m ); 
}
	public static int transformNumber(int n){ 
		int radix = 2; 
		int output = 0; 
		output += radix*n; 
		radix = output/radix; 
		if(output<14){ 
			return output; 
		} 
		else{ 
			output = output*radix/2; 
			return output; 
		} 
	}
	public static void old() {



		// Print whatever we received as arguments

		int[] arr = new int[8];
		try {
			System.out.println(arr[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(System.out);
		}




		// float a = Integer.MAX_VALUE + 1;
		//int[] ages;
		//Array contants can only be used in initializers
		//ages = {19,42,92,33,46};
		//ages = new int[5];
		//ages = new int[6];
		//ages = new int [] {19,42,92,33,46};

		int [][] ages = new int[4][];
		ages[0] = new int[] {1};
		ages[1] = new int[] {2,3};
		ages[2] = new int[] {4,5,6};
		ages[3] = new int[] {7,8};

		for (int i = 0; i < ages.length; i++)
		{
			for (int f = 0; f < ages[i].length; f++) 
			{
				System.out.println(ages[i][f]);
			}
		}

		for (int[] age : ages) {
			for(int val : age) {
				System.out.println(val);
			}
		}
		int x = 0;
		int y = 0;
		while (x < ages.length) {
			while (y < ages[x].length) {
				System.out.println(ages[x][y]);
				y++;
			}
			x++;
			y = 0;
		}

		ArrayList myList = new ArrayList();
		System.out.println((myList instanceof Object));
		myList.add(1);
		myList.add(30);

		int i = (Integer) myList.get(0);

		//double d = (double)myList.get(0);

		//System.out.println(d);


		myList = new ArrayList();
		myList.add(new String("Mary"));
		myList.add("1");
		myList.add("Mary");
		myList.add("2");
		myList.add("Mary");
		myList.remove((Object) "Mary");
		System.out.println(myList);


	}
	public static void test() {
		float a = Integer.MAX_VALUE + 1;
		System.out.println(a);

		//reference
		/*
		Test t = new Test();
		t.getTest();
		*/
       
		String s = new String("");
		boolean sInstanceofString = s instanceof String;
		
		String p = new String("Pedro");
		s = new String("Pedro");

		System.out.println((p==s));

		StringBuilder b = new StringBuilder(p);
		StringBuilder b2 = b;
		b.append(" Reis");

		System.out.println(b);
		System.out.println(b2);

		int i = 2;
		if (i<1 & (i++>3)){}
		System.out.println(i);
		if (i>1 || (i++>3)){}
		System.out.println(i);
		System.out.println((true | false));
		i = 10;
		int f = i & 2;
		System.out.println(f);
		if (true) {} else if(true) {} else {}

		String ss = null;
		switch (ss) {
		default:
			break;
		}
	}
	public static void testOperator() {
		int i = 15;
		System.out.println(i+++i);

		int age = 10;
		int yourAge;
		yourAge = 1 + age++;
		System.out.println(yourAge);
		age = 10;
		yourAge = 1 + ++age;
		System.out.println(yourAge);

		for ( i = 0; i < 5; i++) {
			System.out.println(i);
		}
		for ( i = 0; i < 5; ++i) {
			System.out.println(i);
		}
	}
	public static void testPrimitive() {
		double d = 0.3;
		System.out.println("d:" + d);
		long l = (long) d;
		d = (double) l;
		System.out.println("d:" + d);
	}
	public static void testString() {

		String a = "teste";
		String b = new String("teste");
		String c = "teste";

		if (a == b)
			System.out.println("a = b");
		if (a == c)
			System.out.println("a = c");
		if (b == c)
			System.out.println("b = c");
		if (a.equals(b))
			System.out.println("a equals b");
		if (a.equals(c))
			System.out.println("a equals c");
		if (b.equals(c))
			System.out.println("b equals c");

	}
	public static void printArgs(String[] args)
	{
		for (int i = 0; i < args.length; i++ )
		{
			System.out.print(args[i]);
			if (i < args.length -1)
				System.out.print(" ");
		}
	}

}
