package com.sandokas;

public class HelloWorld {

	public static void main(String[] args) {
		// Print whatever we received as arguments
		for (int i = 0; i < args.length; i++ )
		{
			System.out.print(args[i]);
			if (i < args.length -1)
				System.out.print(" ");
		}
		/*
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
		*/
	}

}
