package stringexamples;

public class TimeChecking {

	public static void main(String[] args) {
		
		
		long startingTime=System.currentTimeMillis();
		System.out.println(startingTime+"ms");
		
		StringBuffer buffer=new StringBuffer();
		buffer.append("Hello");
		
		for(int i=1;i<=1000;i++)
		{
			buffer.append("World");
		}
		System.out.println(buffer);
		System.out.println("Time taken"+(System.currentTimeMillis()-startingTime)+"ms");
		
		
		System.out.println("***********************************************");
		
		StringBuilder builder=new StringBuilder();
		builder.append("Hello");
		
		for(int i=1;i<=1000;i++)
		{
			builder.append("World");
		}
		System.out.println(builder);
		System.out.println("Time taken"+(System.currentTimeMillis()-startingTime)+"ms");
	}

}
