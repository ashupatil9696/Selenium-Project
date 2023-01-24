//character to string

// public class CharString
//{
//  
// 
//public static void main (String[]args)
//  {
//    
//char ch = 'c';
//    
//String st = Character.toString (ch);
//    
// 
// 
//System.out.println ("The string is: " + st);
//
//} 
//} 
 

//String to char
  
import java.util.Arrays;

 
public class CharToString
{
  
 
public static void main (String[]args)
  {
    
String st = "This is great";
    
 
char[] chars = st.toCharArray ();
    
System.out.println (Arrays.toString (chars));

 
char ch = 'c';
  
String s = Character.toString (ch);
  


System.out.println ("The string is: " + s);

} 
}
