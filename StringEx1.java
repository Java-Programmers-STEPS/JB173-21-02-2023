package stringexamples;

public class StringEx1 {

	public static void main(String[] args) {
String name="Sreelakshmi";
System.out.println(name);
System.out.println(name);
name="Sajeevan";
System.out.println(name);
System.out.println(name);

String msg=" Good Morning ";//

System.out.println(msg.charAt(5));// to get character of an index
System.out.println(msg.indexOf('M'));// to get index of character
System.out.println(msg.length());// total characters in a string
System.out.println(msg.replace("Morning","Evening"));// old string to new string
System.out.println(msg.replace('G', 'g'));// old character to new character

System.out.println(msg);// still immutable

System.out.println(msg.toUpperCase());
System.out.println(msg.toLowerCase());
System.out.println(msg.trim());// to remove spaces
System.out.println(msg+",Have a nice day");//+ operator join
String msg2="Have a good day";
System.out.println(msg.concat(msg2));// concat for join
System.out.println(msg);

msg=msg.concat(msg2);
System.out.println(msg);
System.out.println(msg);
System.out.println("Substring");

System.out.println(msg.substring(6,13));
System.out.println(msg);
System.out.println(msg.substring(6));

String a="ABC";
String b="ACD";
// A=1,B=2,C=3,D=4

System.out.println(msg.compareTo(msg2));
System.out.println(a==b);//false
System.out.println(a.compareTo(b));//lexicographically each character checking
String c="ABC";
System.out.println(a.compareTo(c));//-1
System.out.println(b.compareTo(a));//1

String a1="Hello";
String a2="ibmno";
System.out.println(a1.compareTo(a2));



	}

}
