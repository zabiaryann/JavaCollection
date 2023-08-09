package cfPackage;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
     
    	LinkedList<String> animalList = new LinkedList<>();
    	animalList.add("Frog");
    	animalList.add("giraffe");
    	animalList.add("Buffalo");
    	animalList.add("Mongoose");
    	
    	System.out.println(animalList);
    	
    	animalList.addFirst("Camel");
    	System.out.println(animalList);
    	
    	animalList.addLast("Elephant");
    	System.out.println(animalList);
    	
    	animalList.add(2, "Snake");
    	System.out.println(animalList);
    	
    	animalList.remove(3); 
    	// Removes the element that is at the 3rd index of the LinkedList
    	animalList.remove("piranha"); 
    	// Removes the first instance of "piranha" in the LinkedList

    	animalList.removeFirst(); 
    	// Removes the first element of the LinkedList
    	animalList.removeLast(); 
    	// Removes the last elements of the LinkedList

    	animalList.contains("giraffe"); 
    	// Returns `true` if "giraffe" is present in the LinkedList

    	animalList.size(); 
    	// Returns an integer denoting the size of the LinkedList

    	animalList.get(3); 
    	// Returns the value located at the 3rd index of the LinkedList
    	animalList.set(3, "emu"); 
    	//Sets the value at index 4 to "emu"
    	System.out.println(animalList);
    	// => [frog, giraffe, buffalo, emu]
    }
}

