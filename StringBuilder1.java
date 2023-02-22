package stringexamples;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder();
		System.out.println(builder);
		builder.append("Hello");// methods used for updating or initializing values
		System.out.println(builder);
		builder.insert(1, "L");
		System.out.println(builder);

		
		
		StringBuffer buffer=new StringBuffer();
		System.out.println(buffer);
		buffer.append("World");
		System.out.println(buffer);

		
		
		String string="";
		System.out.println(string);
		string="Hello";//equal to operator for assigning value to an empty string
		System.out.println(string);


		

	}

}
