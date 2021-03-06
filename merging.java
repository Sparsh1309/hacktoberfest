// Java program to demonstrate 
// merging of two sets in Java 
// using Double brace Initialization 
import java.util.stream.*; 
import java.util.*; 
import java.io.*; 

public class GfG { 

	// Function merging two sets using DoubleBrace Initialisation 
	public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) 
	{ 
		return new HashSet<T>() {{ 
					addAll(a); 
					addAll(b); 
		} }; 
	} 

	public static void main(String[] args) 
	{ 

		// Creating the sets to be merged 
		// First set 
		Set<Integer> a = new HashSet<Integer>(); 
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 })); 

		// Second set 
		Set<Integer> b = new HashSet<Integer>(); 
		b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 })); 

		// Printing the sets 
		System.out.println("Set a: " + a); 
		System.out.println("Set b: " + b); 

		// calling mergeSets() 
		System.out.println("Merged Set: " + mergeSet(a, b)); 
	} 
} 
