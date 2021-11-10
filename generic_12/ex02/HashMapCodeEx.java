package generic_12.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCodeEx {

	public static void main(String[] args) {
		
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("È²±ÙÃâ", 100);
		javaScore.put("Ã¶±âÅÂ", 89);
		javaScore.put("¿ÀÅÃ±Ã", 90);
		javaScore.put("±âÃ¶µæ", 87);
		javaScore.put("°ûµæÈï", 92);
		
		System.out.println("HashMap¿¡ ÀúÀåµÈ ¿ä¼Ò °¹¼ö : "+javaScore.size());
		
		Set<String> keys = javaScore.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+" "+score);}
		
		
	}//main
}////class
