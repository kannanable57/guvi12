package task12;

	import java.util.ArrayList; 
	  
	public class remove {
	  
	    // main method 
	    public static void main(String[] args) 
	    { 
	        // create empty ArrayList 
	        ArrayList<String> list = new ArrayList<>(); 
	  
	        // Adding elements of list 
	        list.add("Geeks"); 
	        list.add("for"); 
	        list.add("Geeks"); 
	        list.add("Gaurav"); 
	  
	        // printing initial value ArrayList 
	        System.out.println("ArrayList: " + list); 
	  
	        // print size of ArrayList 
	        System.out.println("Size of ArrayList = "
	                           + list.size()); 
	  
	        // remove all elements using clear() method 
	        list.clear(); 
	  
	        // printing ArrayList 
	        System.out.println("\nAfter clear\n\n"
	                         + "ArrayList: " + list); 
	  
	        // print size of ArrayList after clear list 
	        System.out.println("Size of ArrayList = "
	                           + list.size()); 
	    } 
	} 

	

	


