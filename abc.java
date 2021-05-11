import java.util.*;

public class abc
{
    public static void main(String[] args)
    {
        Number obj1=new Number();
        obj1.read();
        obj1.swap();
        obj1.display();
    }
}
class Number
{
    int n_1905464;
    int arr_1905464[];
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n_1905464=sc.nextInt();
        arr_1905464=new int[n_1905464];
        System.out.println("Enter "+n_1905464+" integers");
        for(int i=0;i<n_1905464;i++)
            arr_1905464[i]=sc.nextInt();
        sc.close();
    }
    void swap()
    {
        int t1_1905464=arr_1905464[0],t2_1905464=arr_1905464[0],ind1_1905464=0,ind2_1905464=0;
        for(int i_1905464=1;i_1905464<n_1905464;i_1905464++)
        {
            if(arr_1905464[i_1905464]>t1_1905464)
            {
                t1_1905464=arr_1905464[i_1905464];
                ind1_1905464=i_1905464;
            }
            if(arr_1905464[i_1905464]<t2_1905464)
            {
                t2_1905464=arr_1905464[i_1905464];
                ind2_1905464=i_1905464;
            }
        }
        int t_1905464=arr_1905464[ind1_1905464];
        arr_1905464[ind1_1905464]=arr_1905464[ind2_1905464];
        arr_1905464[ind2_1905464]=t_1905464;
        System.out.println("The biggest and smallest element is swapped");
        System.out.println("Dibbyansh Verma ,1905464");
    }
    void display()
    {
        for(int i_1905464=0;i_1905464<n_1905464;i_1905464++)
            System.out.print(arr_1905464[i_1905464]+" ");
        System.out.println();
    }
}
