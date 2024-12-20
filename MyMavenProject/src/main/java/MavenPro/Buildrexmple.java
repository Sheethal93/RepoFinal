package MavenPro;

public class Buildrexmple {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		
		// append- add the new string at last
		sb.append("java");
		System.out.println(sb);
		
		//insert
		sb.insert(5, "selenium class");
		System.out.println(sb);
		
		//replace
		sb.replace(0, 5, "hai ");
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		//delete
		sb.delete(1, 5);
		System.out.println(sb);

	}

}
