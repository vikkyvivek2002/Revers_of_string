import java.util.*;
public class Revers_of_string
 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a String :");
		String a = s.next();
		char c[] = a.toCharArray();
		String rev = "";
		s.close();
		for(int i = c.length -1; i>= 0; i--)
		{
			rev =rev+c[i];
			
		}
		
		System.out.println("reverse string = "  +rev);

	}

}
