import java.util.*;
public class sumofnaturalnos {public static void main(String[] args)
{
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter n value:");
    int n=obj.nextInt();
    int sum=0;
    for(int i=0;i<=n;i++)
    {
        sum=sum+i;

    }
    System.out.print(sum);
}

}

