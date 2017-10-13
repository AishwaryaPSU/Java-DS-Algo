package easy;
//This program shows how stringBuffer will manipulate the existing string while the String does not
//in case of stringBuffer the same string object gets modified

//There is no difference in the functionality between stringbuffer and string builder
//Difference in characteristic: StringBuilder=not thread safe
//But stringBuffer is thread safe
//Multiple threads trying to manipulate a stringBuffer object , only one thread is allowed in it()only
//one thread is allowed to manipulate it at a time
//All methods of stringBuffer are synchronized any thread that acquires the lock is the only one permitter to 
//to modify the string inside the other threads have to wait in the q
//but wrt to stringbuilder all the methods that are allowed to modify the string are not synchronized
//multiple thread are allowed to modify the string and the result could be different, that dosent mean the string buikder is not goot and buffer is not  good....J2e appl
//StrBuilder is faster thatn buffer because there is no concept of acquiring the lock and then modufiying the content
//str builder does not insist the threads to get the lock of the objects...in string buffer because all the methods are synchronised every thread 
//every thread that is going to modify the content has to acquire the lock and then modify it 

public class StrBufferNBuilder {

	public static void main(String[] args) {
		
		String input1="Aishwarya";
		//hashcode is like a memory object location
		System.out.println(input1.hashCode());
		input1+="Govindappa";
		System.out.println(input1.hashCode());
		///////////////////////////////////////
		StringBuffer input2 = new StringBuffer("Aishwarya");
		System.out.println(input2.hashCode());
		//append will append new string contents to the end of the string
		input2.append(" Mahadev");
		System.out.println(input2);
		System.out.println(input2.hashCode());
		//insert will add the given new contents in the specified location of the existing string
		input2.insert(10, "Govindappa ");
		System.out.println("After using insert\t"+input2);
		///////////////////////////////////////
		
	}

}
