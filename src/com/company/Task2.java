package com.company;
import com.sun.jdi.IntegerValue;

import java.lang.*;
import java.util.Scanner;

/*2
StringBuffer.
Дан текст, состоящий из предложений, заканчивающиеся символами
конца предложений. Предложение состоит из слов. Словами могут быть
числа.

Найти в тексте двузначные числа и заменить их строкой из
символов длиной равной двузначному числу.

Добавить в самое короткое предложение текста одно слово
КОНЕЦ.

Найти трехзначные числа и заменить из обратными числами,
т.е.число 123 заменить на 321
 */

public class Task2 {
    static StringBuffer str_buf = new StringBuffer("");

    public static void input()
    {
        System.out.println("Чтобы закончить ввод текста введите слово \"конец\" или слово \"end\", длина текста ограничена 10 строками.");
        String line = "";
        str_buf = new StringBuffer("");
        for (int i = 0; i < 11 ; ++i)
        {
            Scanner in = new Scanner(System.in);
            line = in.nextLine();
            if (line.compareToIgnoreCase("end") == 0 || line.compareToIgnoreCase("конец") == 0 )
            {
                break;
            }
            else
            {
                str_buf.append(line + "\n");
            }
        }
        System.out.println("\nВы ввели: \n" + str_buf.toString());
    }

    public static Integer tryParse(Character obj) {
        Integer retVal;
        try {
            retVal = Integer.parseInt("" + obj);
        } catch (NumberFormatException nfe) {
            retVal = null;
        }
        return retVal;
    }

    public static void find2Numbers()
    {
        StringBuffer str = new StringBuffer(str_buf);
        str.append("_");
        str.insert(0,"_");
        for (int i = 0; i < str.length() - 3; ++i)
        {
            if ( (tryParse(str.charAt(i)) == null) && (tryParse(str.charAt(i+3)) == null) )
            {
                if ( (tryParse(str.charAt(i+1)) != null) && (tryParse(str.charAt(i+2)) != null) )
                {
                    str_buf.setCharAt(i, 'A');
                    str_buf.setCharAt(i+1, 'A');
                }
            }
        }
        System.out.println("\nРезультат  изменений: \n" + str_buf.toString());
    }

    public static void add()
    {
        int last_index = 0;
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < str_buf.length() ; ++i)
        {
            if (str_buf.charAt(i) == '.' || str_buf.charAt(i) == '!' ||  str_buf.charAt(i) == '?')
            {
                if (str_buf.substring(last_index, i).length() < min)
                {
                    min = str_buf.substring(last_index, i).length();
                    min_index = i;
                }
                last_index = i;
            }
        }
        str_buf.insert(min_index, "КОНЕЦ");
        System.out.println("\nРезультат  изменений: \n" + str_buf.toString());
    }

    public static void find3Numbers()
    {
        StringBuffer str = new StringBuffer(str_buf);
        str.append("_");
        str.insert(0,"_");
        for (int i = 0; i < str.length() - 4; ++i)
        {
            if ( (tryParse(str.charAt(i)) == null) && (tryParse(str.charAt(i+4)) == null) )
            {
                if ( (tryParse(str.charAt(i+1)) != null) && (tryParse(str.charAt(i+2)) != null) && (tryParse(str.charAt(i+3)) != null) )
                {
                    str_buf.setCharAt(i, str.charAt(i+3));
                    str_buf.setCharAt(i+2, str.charAt(i+1));
                }
            }
        }
        System.out.println("\nРезультат  изменений: \n" + str_buf.toString());
    }
}
