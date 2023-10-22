package org.example.Numbers;

import java.util.ArrayList;

public class Numbers
{
    public static boolean isPrime(int number)
    {
        ArrayList<Integer>listaDivisores = new ArrayList<>();
        for(int i = 1; i<=number + 1;i++)
        {
            if(number % i == 0 )
            {
                listaDivisores.add(i);
            }
        }
        for(int a : listaDivisores)
        {
            if (a != 1 && a != number)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        return false;
    }
    public static boolean isMultiple(int number, int divisor)
    {
        if(number % divisor == 0)
        {
            return true;
        }
        return false;
    }

}
