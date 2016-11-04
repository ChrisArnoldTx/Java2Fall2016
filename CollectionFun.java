package collectionFun;

import java.util.*;

public class CollectionFun {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Map<String,Object> person = new HashMap();
		person.put("Name", "Bob");
		person.put("Age", 47);
		person.put("Shoe Size", 10);
		person.put("Fav Color", "Blue");
		person.put("Alive", true);
		person.put("Height", 57.5);
		//person.put("Student", new Student());
		
		Set<String> keys = person.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + person.get(key));
		}
		
		
		String[] pets = {"Fluffy", "Bill", "Rex", "Fluffy", "Spot", "Bill", "Fluffy"};
		List<String> petList = new ArrayList();
		Set<String> petSet = new HashSet();
		
		for (String s : pets) {
			petList.add(s);
			petSet.add(s);
		}
		
		for(int i=0; i<petList.size(); i++) {
			System.out.println(petList.get(i));
		}
		
		System.out.println("List...");
		for(String s : petList) {
			System.out.println(s);
		}
		
		System.out.println("Set...");
		for(String s : petSet) {
			System.out.println(s);
		}
		
		System.out.println("The list has " 
				+ (petList.size() - petSet.size()) 
				+ " more items in it...");
		
		
//		int[] intArray = new int[10];
//		List list = new ArrayList();
//		List grades = new ArrayList();
//		Map map = new HashMap();
//		map.put("name", "Bob");
//		map.put("grades", grades);
//		map.put("name", "Blah");
//		map.get("name");
//		List l = (List) map.get("grades");
//		l.add(92);
//		map.put("grades", l);
//		
//		Set set = new HashSet();
//		
//		List students = new ArrayList();
//		students.add(new Student());
//		int numStudents = students.size();
	}
}
