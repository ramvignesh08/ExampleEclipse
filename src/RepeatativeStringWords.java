import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatativeStringWords {
	public static void main(String[] args) {
		String s=" Welcome to and to the and to am";
		String[] split = s.split(" ");
		LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();
		for(String c: split)
		{
			if(words.containsKey(c))
			{
				Integer integer = words.get(c);
				words.put(c, integer+1);
			}
			
			else {
				words.put(c, 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = words.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + value);
			
		}
	}

}
