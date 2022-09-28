package laba5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in,"cp1251");
        System.out.println("Введите n");
        int n=0;
        try{
            n = sc.nextInt();
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Нужен аргумент типа int!");
        }

        Matrix matrix = new Matrix();
        int [][]matr;
        matr = matrix.Vvod(n,sc);
        matrix.Vivod(matr,n);


    }

    public static class Matrix
    {
        public int Even(int[][] matrix, int n)
        {

            int max = matrix[0][0];
            int j = n-1;
            for (int i =0;i<n;i++)
            {
                if (matrix[i][j] > max && matrix[i][j]%2==0)
                {
                    max = matrix[i][j];
                }
                j--;
            }
            return max;
        }

        public int [][] Vvod(int n,Scanner sc)
        {

            int[][]test;
            test = new int[n][n];
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.println("Введите ["+j+"] ["+i+"] елемент: ");
                    test[i][j]=sc.nextInt();
                    if (test[i][j]%2==0)
                    {
                        count++;
                    }
                }
                System.out.println();
            }
            if (count==0)
            {
                throw new IllegalArgumentException("В масиве нет четных чисел!");
            }
            return test;
        }

        public void Vivod(int matrix[][],int n)
        {
            Matrix matr = new Matrix();
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("Максимальный елемент на побочной диагонали: "+ matr.Even(matrix,n));
        }

    }

}
