package com.company;
import java.lang.*;
import java.util.Scanner;

/*
String.
Дан художественный текст. По количеству используемых в тексте слов
можно с некоторой вероятностью определить автора. Равными словами
считать слова, содержащие строчные и прописные буквы (например,
сЛоВо и СЛОВО и слово).

Преобразовать все слова к одному формату: либо строчные буквы,
либо прописные.

Сформировать массив из слов.

Сформировать массив вхождений каждого найденного слова в
текст.

Определить, сколько слов начинаются с заданного префикса.
 */

public class Task1 {
    static String string = "";

    public static void input()
    {
        System.out.println("Чтобы закончить ввод текста введите слово \"конец\" или слово \"end\", длина текста ограничена 10 строками.");
        String line = "";
        string = "";
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
                string = string + line + "\n";
            }
        }
        System.out.println("\nВы ввели: \n" + string);
    }

    public static void convert()
    {
        System.out.println("Чтобы преобразовать все символы к строчным введите 1, чтобы преобразовать к прописным - 2");
        Scanner in = new Scanner(System.in);
        int command = in.nextByte();
        if (command == 1)
        {
            string = string.toLowerCase();
        }
        else
        {
            string = string.toUpperCase();
        }
        System.out.println("\nРезультат преобразования: \n" + string);
    }

    private static String[] make_array()
    {
        String[] arr = string.split("[,;:.!?\\s]+");
        if (arr[0].compareTo("") == 0)
        {
            if (arr.length == 0)
            {
                return null;
            }
            String[] new_arr = new String[arr.length - 1];
            for (int i = 0; i<arr.length - 1; i++)
            {
                new_arr[i] = arr[i+1];
            }
            arr = new_arr;
        }
        return arr;
    }

    public static void array()
    {
        String[] arr = make_array();
        System.out.println("Массив:");
        for (String word: arr)
        {
            System.out.print(word + ", ");
        }
        System.out.println();
    }

    public static void entrys()
    {
        String[] arr = make_array();
        System.out.println("Массив индексов:");
        int last_index = 0;
        for (String word: arr)
        {
            last_index = string.indexOf(word, last_index);
            System.out.print(word + " - " + last_index + ", ");
            last_index = last_index + word.length() + 1;
        }
        System.out.println();
    }

    public static void perfix()
    {
        System.out.println("Введите перфикс:");
        Scanner in = new Scanner(System.in);
        String perfix = in.nextLine();
        String[] arr = make_array();
        int number = 0;
        for (String word: arr)
        {
            if (word.startsWith(perfix))
            {
                ++number;
            }
        }
        System.out.println("Количество начинающихся с перфикса слов:" + number);
    }
}
