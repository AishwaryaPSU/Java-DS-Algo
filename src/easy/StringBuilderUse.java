package easy;

public class StringBuilderUse {

	public static void main(String[] args) {
		//Strings are immutable 
		//using String as follows may slow down the program and result in wastage of memory space.
		String name="Aishwarya";
		name += "Govindappa";
		name += "Mahadev";
		System.out.println(name);
		
		//Efficient way
		StringBuilder str = new StringBuilder();
		str.append("Aishwarya").append("Govindappa").append("Mahadev");
		System.out.println(str);
		

	}

}
