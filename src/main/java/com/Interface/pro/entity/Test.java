package com.Interface.pro.entity;

class Test
{
int x =100;
int y =100;

public static void main (String[] args)
{
	
//Test test = new Test();
//System.out.println(test.x==test.y);
//test.x=300;
//
//System.out.println(test.x);
//System.out.println(test.x==test.y);
//System.out.println(test.y);

Integer s = new Integer(10);
Integer s2 = s;

System.out.println("s = "+s);
System.out.println("s2 = "+s2);

s =  new Integer(20);

//System.out.println(s.hashCode());
//System.out.println(s2.hashCode());

System.out.println("s = "+s);
System.out.println("s2 = "+s2);

System.out.println(s==s2);

}
}