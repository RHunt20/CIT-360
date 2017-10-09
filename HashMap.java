import java.util.HashMap;


public class Main {
	public static void main(String[] args) {
		//Create the HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
		//Put data
		hm.put("Ryan", 28);
		hm.put("Allison", 24);
		hm.put("Shane", 24);
		hm.put("Ben", 23);

		int ageOFRyan = map.get("Ryan");
		System.out.println("Ryan is " + ageOFRyan);
		
		map.remove("Ben");
		
		if(map.containsKey("Ben")){
			System.out.println("Ben is in HashMap");
		}else{
			System.out.println("Ben is not old enough");
		}
	}
}