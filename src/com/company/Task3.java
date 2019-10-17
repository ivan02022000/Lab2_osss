package com.company;
import java.lang.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
регулярные выражения
Pattern и Matcher

Определите, что строка является корректным email-ом.

Дан текст. Сформировать список всех электронных адресов,
содержащихся в этом тексте.
 */
//oss20@mail.ru
public class Task3 {
    static String string = "";
    static Pattern pattern = Pattern.compile("[a-zA-Z\\d]+?@[a-zA-Z]+?\\.[a-zA-Z]+");// [a-zA-Z]+?\\.[a-zA-Z]+?"

    public static void input()
    {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        string = in.nextLine();
    }

    public static void isCorrect()
    {
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches())
        {
            System.out.println("Это корректный email!");
        }
        else
        {
            System.out.println("Это не корректный email!");
        }
    }

    public static void list()
    {
        System.out.println("Список электронных адресов:");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(string.substring(matcher.start(), matcher.end()));
        }
    }
}
