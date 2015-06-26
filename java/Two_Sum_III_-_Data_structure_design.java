// import java.util.Map.Entry;
public class TwoSum {

    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public void add(int number) {
	    map.put(number, map.containsKey(number)? map.get(number) + 1 : 1);
	}

	public boolean find(int value) {
	    for(Map.Entry<Integer, Integer> e : map.entrySet())if( (((value - e.getKey()) == e.getKey() && e.getValue() > 1)) || ((value - e.getKey()) != e.getKey() && map.containsKey(value - e.getKey()))) return true;
	    return false;
	}
}