import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.io.*;
public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("data2.txt"));
		int maxIndex = -1;
		String text[] = new String[1000];
		while(sc.hasNext()) {
			maxIndex++;
			text[maxIndex] = sc.nextLine();
		}
		sc.close();
		String words[] = text[0].split(", ");
		
		Map<String, Integer> histo = new TreeMap<String, Integer>();
		for(String i: words ) {
			if(histo.containsKey(i)) {
				histo.put(i, histo.get(i)+1);
			}
			else {
				histo.put(i,  1);
			}
		}
		
		Set<String> keys = histo.keySet();
		Iterator<String> itr = keys.iterator();
		System.out.printf("%s%15s%n", "Words", "Frequency");
		while(itr.hasNext()) {
			String key = itr.next();
			String asterix = "*";
			for(int i = 1; i < histo.get(key); i++) {
				asterix += "*";
			}
			System.out.printf("%s%15s%n", key, asterix);
		}
	}

}
