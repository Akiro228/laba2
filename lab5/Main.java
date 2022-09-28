package lab5;

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

        int [][]matr;
        matr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println("Введите ["+i+"] ["+j+"] елемент: ");
                matr[i][j]=sc.nextInt();
                if (matr[i][j]%2==0)
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

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }

        int max = matr[0][0];
        int j = n-1;
        for (int i =0;i<n;i++)
        {
            if (matr[i][j] > max && matr[i][j]%2==0)
            {
                max = matr[i][j];
            }
            j--;
        }

        System.out.println("Максимальный елемент на побочной диагонали: ");
        System.out.println(max);



    }

}
