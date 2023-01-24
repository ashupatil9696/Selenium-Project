 //Convert Java Array to List
 import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

//class ArrayToList {
//  public static void main(String[] args) {
//
//    // create an array
//    String[] array = {"Java", "Python", "C"};
//    System.out.println("Array: " + Arrays.toString(array));
//
//    // convert array to list
//    List languages= new ArrayList<>(Arrays.asList(array));
//
//    System.out.println("List: " + languages);
//
//  }
//}
 
 //Convert the Java List into Array
 import java.util.ArrayList;

class ArrayToList {
  public static void main(String[] args) {
    ArrayList languages = new ArrayList<>();

    // Add elements in the list
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    // Create a new array of String type
    String[] arr = new String[languages.size()];

    // Convert ArrayList into the string array
    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
      
      String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));

    // convert array to list
    List language= new ArrayList<>(Arrays.asList(array));

    System.out.println("List: " + language);
    }
  }
}