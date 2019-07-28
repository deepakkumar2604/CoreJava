import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		
		Hashtable h = new Hashtable();
		
		h.put('A', 100);
		h.put(10, "Deepak");
		h.put("Sure Name", "Kumar");
		h.put("Location","Pune")			;
		h.put("Zipcode", 411057);
		
		System.out.println(h.size());
		
		System.out.println(h.get("Zipcode"));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(100, 10);
		
		System.out.println(h1.get(100));
		
	}

}
