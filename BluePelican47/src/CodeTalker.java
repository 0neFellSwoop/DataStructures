import java.util.*;
import java.io.*;
public class CodeTalker {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner sf = new Scanner(new File("data.txt"));
		int maxIndex = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndex++;
			text[maxIndex] = sf.nextLine();
		}
		sf.close();
		for(int i = 0; i < maxIndex; i++) {
			System.out.println(text[i]);
		}
		
		
		Map<String, String> m1 = new HashMap<String, String>();
		int numPairs = Integer.parseInt(text[0]);
		for(int j = 1; j < numPairs; j++) {
			Scanner sc = new Scanner(text[j]);
			sc.useDelimiter("=");
			m1.put(sc.next(), sc.next());
			sc.close();
		}
		
		//m1.put("beaver", "swim");
		//m1.put("hello", "fierce");
		//m1.put("spank", "like");
		//m1.put("freedom", "wrench");
		//m1.put("yellow", "can't");
		//m1.put("whale", "for");
		//m1.put("ketchup", "pickles");
		//m1.put("yes", "me");
		//m1.put("meter", "I");
		//m1.put("foreign", "state");
		//m1.put("staple", "but");
		//m1.put("wood", "sandwich");
		//m1.put("hand", "could");
		String code = text[maxIndex];
		System.out.println(code);
		Set<String> keys = m1.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			code = code.replaceAll(key, (String) m1.get(key));
		}
		System.out.println(code);
		
	}

}
