import java.util.*;

public class setIntersection {
	public static void main(String[] args) {
		Set s1 = new HashSet(); // Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		Set s2 = new HashSet(); // Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
		// Build the intersection set, s3
				Set s3 = new HashSet();
				Iterator iter1 = s1.iterator();
				while (iter1.hasNext()) {
					Object thing = iter1.next();
					/// Use iter1 to cycle through all objects in s1.
					// Use s2.contains(obj) to see if a particular object from s1 is in s2
					// If it is, then add this object to s3
					if (s2.contains(thing)) {
						s3.add(thing);
					}
				}
				// Print the intersection set
				Iterator iter3 = s3.iterator();
				while (iter3.hasNext()) {
					// Use iter3 to cycle through all objects in s3 and then print them.
					Object thingy = iter3.next();
					System.out.println(thingy);
				}

	}
}
