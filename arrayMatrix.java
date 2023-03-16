import java.util.Scanner;

public class arrayMatrix
{
    public static void main(String[] args)
    {
        int n=2, sumrow=0, sumcol=0;
        Scanner sc= new Scanner(System.in);
        int arr[][]= new int[n][n];
        for(int i=0; i < n; i++)
        {
            for(int j=0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i < n; i++)
        {
            for(int j=0; j < n; j++)

                sumrow+= arr[i][j];
                System.out.println("Sum of row" +i+" = "+sumrow);


            sumrow=0;
        }
        for(int j=0; j < n ; j++)
        {
            for(int i=0; i < n ; i++) {
                sumcol += arr[i][j];
            }
            System.out.println("Sum of coloumn "+j+" = "+sumcol);
            sumcol=0;
        }


        }
    }

