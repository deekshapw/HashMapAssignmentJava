
import java.util.Scanner;
import java.util.TreeMap;

public class Assgn4
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements of array");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the elements in array");
      for(int i = 0 ; i<n ; i++)
      {
         arr[i] = sc.nextInt();
      }
      TreeMap<Integer , Integer> t = new TreeMap();
      
      for(int i = 0 ; i<n ; i++)
      {
         t.put(arr[i], 1);
      }
      System.out.println("Largest element is : " + t.lastEntry().getKey()); 
    }
    
}
