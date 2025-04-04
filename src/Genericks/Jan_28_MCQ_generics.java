
package Genericks;
//import java.util.*;
//1st-
//class NareshIT<T>
//{
//	private T test;
//	
//	public void set(T test)
//	{
//		this.test = test;
//	}
//	public T get()
//	 {
//		 return test;
//	 }
//}
//public class Jan_28_MCQ_generics {

import java.util.Arrays;
import java.util.List;

//	public static void main(String[] args) 
//	  {
//	     NareshIT<Integer> nit = new NareshIT();
//			nit.set(10);
//			System.out.println(nit.get());
//	   }
	
	//2nd
//	 public static void main(String[] args) 
//	  {	
//		ArrayList al = new ArrayList<>();
//			  
//		al.add("Naresh"); 
//		al.add("I");
//		al.add("Technologies");
//		String name = al.get(1);
//		System.out.println(name);
//	   }
//	
	
	//3rd
//	public static void main(String[] args) {				
//		  ArrayList<String> al = new ArrayList<String>();		  
//		  al.add("Naresh"); 
//		  al.add("I");
//		  al.add("Technologies");
//		  String name = al.get(1);
//		  System.out.println(name);	
//	}
//}
	//4th
//class Test<R,A>
//{
//	private R r;
//	public void set(A a) 
//	{
//		r =  a; //Type Casting are Reqired r=(R)a 
//	}
//	
//	public R get() 
//	{
//		return r;
//	}
//}
//public class Jan_28_MCQ_generics 
//{
//   public static void main(String[] args) 
//   {
//      Test<String,String> test = new Test(); 
//      test.set("Info");
//      System.out.println(test.get());
//   }
//}
	//5th
//class NareshIT<R,A>
//{
//	private R r;
//	public void set(A a) 
//	{
//		r = (R)a; // casting A to R 
//	}
//	
//	public R get() 
//	{
//		return r;
//	}
//}
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {		
//		
//		  NareshIT<String,String> test = new NareshIT(); 
//		  test.set("NareshIT");
//		  System.out.println(test.get()); 
//	}
//}
	//6th
//class Test<R,A>
//{
//	private R r;
//	private A a;
//	public void set(A a, R r) //method 
//	{
//		this.a = a;
//		this.r = r;
//	}
//	
//	public String get() 
//	{
//		String str = a.toString()+r.toString();
//		return str;
//	}
//}
//
//public class Jan_28_MCQ_generics 
//{
//  public static void main(String[] args) 
//  {
//
//		  Test<String,String> test = new Test(); 
//		  test.set("Naresh I ","Technologies");
//		  System.out.println(test.get()); 
//  }
//}
	//7th
//class Test<R,A>
//{
//	private R r;
//	private A a;
//	
//	public void set(A a, R r) //method 
//	{
//		this.a = a;
//		this.r = r;
//	}
//	
//	public R get() 
//	{
//		r = a+r; 
//		return r;
//	}
//}
//
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {
//		
//		  Test<String,String> test = new Test(); 
//		  test.set("Naresh I ","Technologies");
//		  System.out.println(test.get());
//	}
//}
	//8th
//class NareshIT<K,V>
//{
//	private K key;
//	private V value;
//	//constructor
//	public NareshIT(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}
//	
//	public K getKey() {
//		return key;
//	}
//	public V getValue() {
//		return value;
//	}
//}
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {
//		NareshIT<String,String> nit = new NareshIT("Naresh","IT");
//		System.out.println(nit.getKey()+nit.getValue());
//		NareshIT<Integer,String> integer = new NareshIT(1003, "Naresh"); 
//		System.out.println(integer.getKey());	
//	}
//}
	//9th
//class NareshIT<T>
//{
//	private T test;
//	
//	public void set(T test)
//	{
//		this.test = test;
//	}
//	public T get()
//	 {
//		 return test;
//	 }
//}
//
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {
//		NareshIT<String> nit = new NareshIT();
//		nit.set(new String("Naresh I Technologies"));
//		String str = nit.get();
//		System.out.println(str);
//	}
//}
	//10th
//class NareshIT<K extends Number ,V extends String>
//{
//	private K key;
//	private V value;
//		
//	public void set(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}
//	
//	public K getKey() {
//		return key;
//	}
//	public V getValue() {
//		return value;
//	}
//}
//
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {
//		NareshIT<Integer, String> nit = new NareshIT();
//		nit.set(9999, new String("Naresh I Technologies"));
//		System.out.println(nit.getKey()+" "+nit.getValue());	
//	}
//}
	//11th
//class NareshIT<T extends Float>
//{
//	private T test;
//	
//	public void set(T test)
//	{
//		this.test = test;
//	}
//	
//	public T get()
//	 {
//		 return test;
//	 }
//}
//public class Jan_28_MCQ_generics {
//	public static void main(String[] args) {
//		NareshIT<Float> nit1 = new NareshIT();
//		nit1.set(999.00f);
//		System.out.println(nit1.get());
//	}
//}
	//12th
//interface NareshIT<T>
//{
//	void nit(T type);
//}
//
//class Test implements NareshIT
//{
//	public void nit(Object type) 
//	{
//		System.out.println(type);
//	};
//}
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {
//		Test test = new Test();
//		test.nit("Naresh I technologies");
//		test.nit(1.66);	
//	}
//}
	//13th
//class NareshIt
//{
//	public void nit(List<?> list)
//	{
//		for (Object li : list) {
//			System.out.print(li+" ");
//		}
//		System.out.println();
//	}
//}
//
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {
//				
//		NareshIt str = new NareshIt();
//		List<Integer> listInt = Arrays.asList(1001,252,36);
//		List<String> liststr = Arrays.asList("Naresh","I","Technologies");
//		
//		str.nit(listInt);
//		str.nit(liststr);
//	}
//}
	//14th-Error

//class StringTest implements NareshIT45<T>
//{
//
//	@Override
//	public void nit(T d) {
//		System.out.println(d);
//	}
//	
//}
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {
//		StringTest test = new StringTest();
//		test.nit("Naresh I technologies");
//		test.nit(1.66);
//	}
//}
	//15th
//class NareshIt<T>
//{
//	public void nit(String string)
//	{
//		System.out.println(string);
//	}
//
//	
//}
//
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {		
//		NareshIt<?> str = new NareshIt();
//		str.nit("Naresh I Technologies");
//	}
//}
    //16th
//class NareshIT<T>
//{
//	
//}
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {	
//		NareshIT<String> str = new NareshIT();
//		NareshIT<Float> flo = new NareshIT();
//		System.out.println(str.equals(flo));
//	}
//}
	//17
//class NareshIT<T>
//{
//	
//}
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {	
//		NareshIT<String> str = new NareshIT();
//		NareshIT<Float> flo = new NareshIT();
//		System.out.println(str.getClass().equals(flo.getClass()));
//	}
//}
	//18
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {
//		System.out.println(display(1));
//		System.out.println(display("NareshIT"));
//		System.out.println(display(3.25f));
//		
//	}
//	public static<E> E display(E element)
//	{
//		E e = element;
//		return e;
//	}
//}
	//19
//public class Jan_28_MCQ_generics{
//	public static void main(String[] args) {
//		System.out.println(display(1).getClass());
//		System.out.println(display("NareshIT").getClass());
//		System.out.println(display(3.25f).getClass());
//	}
//	public static<E> E display(E element)
//	{
//		E e = element;
//		return e;
//	}
//}
	//20

class Fruit    
{
}
class Apple extends Fruit   
{
	@Override
	public String toString()
	{
		return "Apple";
	}
}

class Basket<E>      
{
	private E element;  	
	public void setElement(E element) 
	{
		this.element = element;
	}	

	public E getElement() 
	{
		return this.element;		
	}
}

public class Jan_28_MCQ_generics
{
	public static void main(String[] args) 
	{
		Basket<Fruit> b = new Basket<>();
		b.setElement(new Apple());

		Apple x = (Apple)b.getElement();	
		System.out.println(x);
      		
	}
}









	

