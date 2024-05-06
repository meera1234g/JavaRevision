package Revision;

import java.util.ArrayList;
import java.util.List;

public class Fruitslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	List<String> s = Fruitslist.fruitlist();// data type is list String

	System.out.println("List of fruits: " +s);
		


	}
 public static List<String> fruitlist() {// list of String is the data type to be returned
	 
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Lemon");
		fruitList.add("Plum");
		fruitList.add(" Papaya");
		//System.out.println("List of fruits: " +fruitList);
		return fruitList;
}}
