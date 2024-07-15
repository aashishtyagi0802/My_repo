
/*
import java.util.Scanner;

class Main
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Row: ");
    int r=sc.nextInt();
    System.out.println("Enter the number of Column:");
    int c=sc.nextInt();
    System.out.println("Now enter the Row and Column elements: ");
    int [][] number=new int [r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
        number[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.print(number[i][j]+" ");
        }
        System.out.println();
    }

}
}

*/
//**********************************************************************************************************************
//Take a matrix as input from the user. Search for a given number X and print the indices at which it occurs.



import java.util.*;
class Main
{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int r=sc.nextInt();

        System.out.println("Enter the column number: ");
        int c=sc.nextInt();
        int [][] number = new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                number[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the value of X which need to found: ");
        int x=sc.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c; j++)
            {
                if(number[i][j]==x)
                {
                    System.out.println("The location of X is ("+ i+" , "+ j +" )");
                }

            }
        }


    }
}