package string;

public class Example {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" Santhosh");
		
		System.out.println(sb);
		System.out.println(sb.getClass().getName());
		
		
		String str = " Santhu ";
		
		//StringBuffer methods
		sb.insert(5, " Thouda");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(7));
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb.compareTo(sb));
		
		System.out.println(sb.getClass().getName());
		
		System.out.println(sb.replace(5, 10, str));
		
		sb.setLength(20);
		
		System.out.println(sb.length());
		
		System.out.println(sb.indexOf(str));
		System.out.println(sb.lastIndexOf(str));
		
		System.out.println(sb.delete(3, 8));
		
		System.out.println(sb.reverse());
		
		
	} 
} 
