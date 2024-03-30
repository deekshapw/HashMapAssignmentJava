import java.util.HashMap;
import java.util.Scanner;

public class Assgn3
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
      HashMap<Integer , Integer> h = new HashMap<>();
      boolean duplicate = true;
      for(int i = 0 ; i<n ; i++)
      {
        if(h.containsKey(arr[i]))
        {
            System.out.println("Yes");
            duplicate = true;
            break;
        }
        h.put(arr[i], 1);
      }
      if(duplicate == false)
      {
        System.out.println("No");
      }

    }
    
}
