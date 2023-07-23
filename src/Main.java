import java.util.Arrays;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        Arrays.sort(A);
        int countofsmall=0;
        int countofnoble=0;
        if(A[0]==0)
        {
            countofnoble++;
        }
        for(int i=1;i<n;i++)
        {
            if(A[i]!=A[i-1])
            {
                countofsmall=i;
            }
            if(countofsmall==A[i])
            {
                countofnoble++;
            }
        }
        System.out.println(countofnoble);





    }
}