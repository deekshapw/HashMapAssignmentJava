import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assgn5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransomnote string :");
        String r = sc.nextLine();
        System.out.println("Enter the magazine string");
        String m = sc.nextLine();
        HashMap<Character , Integer> map1 = new HashMap<>();
        // make entery of ransomnote strings char in hashmap.
        for(int i = 0 ; i<r.length(); i++)
        {
           char c = r.charAt(i);
           if(map1.containsKey(c))
           {
            map1.put(c,map1.get(c)+1);//if key already present in hashmap then increase its count

           }
           else
           {
            map1.put(c, 1);//simply put char
           }
        }
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(int i = 0 ; i<m.length(); i++)
        {
           char c = m.charAt(i);
           if(map2.containsKey(c))
           {
            map2.put(c,map2.get(c)+1);//if key already present in hashmap then increase its count

           }
           else
           {
            map2.put(c, 1);//simply put char
           }
        }
        boolean ans = true;
        for(Map.Entry<Character ,  Integer> e :map1.entrySet())//traversing the char of map1 & entery set is the method returning key value pair
        {
          if(!map2.containsKey(e.getKey()) || e.getValue()>map2.get(e.getKey()))
            //map2 me key presnt nii h        no. of keys in r > m
          {
            ans = false;
            break;
          }
        }
        System.out.println(ans);
    }
    
}
