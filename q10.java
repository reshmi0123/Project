import java.util.*;

import java.util.Scanner;
import java.util.Set;
public class q10 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        Set<Integer> s =new HashSet<>();
        int sum=0;
        while (n > 0)
        {
            s.add(n%10);
            n /=10;
        }
        System.out.println(s.size());
    }
    
}