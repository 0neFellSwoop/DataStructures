import java.util.*;
public class setUnion {

	public static void main(String[] args) {
		
		Set s1 = new HashSet( ); //Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		
		Set s2 = new HashSet( ); //Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
		

		
		
		
		
		s2.addAll(s1);
		

		 //Print the intersection set
		 //Create iter3, an Iterator for s3
		Iterator iter2 = s2.iterator();
		while(iter2.hasNext()){
		//Use iter3 to cycle through all objects in s3 and then print them.
			 System.out.println(iter2.next());
		}
		
		
	}

}
