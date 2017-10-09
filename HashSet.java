import java.util.Set;

//HashSet: not ordered 
//TreeSet: iterator list is ordered by comparator
//LinkedHashSet: Order in which they are added

public class Main {

	public static void main(Sting[] args) {
		Set<String> set = new HashSet<String>();
			
		set.add("Ryan");
		set.add("Allison");
		set.add("Allison"); //Allison will only show once. Showing that there are no duplicates
		set.add("Shane");
		set.add("Ben");
		set.add("Austin");
		set.remove("Austin");
		
		for (Iterator<String> iterator = set.iterator(); iterator.hashNext();){
			String name = iterator.next();
			System.out.println(name);
		}
	}
}