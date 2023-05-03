import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatativeWords {
	public static void main(String[] args) {
		String s="Welcome to the java and to and to";
		String[] split=s.split(" ");
		LinkedHashMap<String,Integer>list= new LinkedHashMap<String, Integer>();
		for (String words : split) {
			if (list.containsKey(words)) {
				Integer integer = list.get(words);
				list.put(words, integer+1);
			}
			else {
				list.put(words, 1);
			}
		}
		Set<Entry<String, Integer>> entrySet = list.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key=entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+value);
		}
	
		
	}

}
