package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task №1");
        task1(" Приглашение на запланированную конференцию отправленное по конференцию почте. Получив конференцию письмо, у вас автоматически будет создано собы");
        System.out.println("Task №2");
        TelephoneBook exampleTelephoneBook = new TelephoneBook();
        exampleTelephoneBook.add("Иванов","+790258361258");
        exampleTelephoneBook.add("Петров","+79025");
        exampleTelephoneBook.add("Иванов","+79");
        exampleTelephoneBook.add("Петров2","+790258");
        System.out.println("Поиск по фамилии Иванов: " + exampleTelephoneBook.get("Иванов"));
        System.out.println("Поиск по фамилии Петров: " + exampleTelephoneBook.get("Петров"));
        System.out.println("Поиск по фамилии Петров2: " + exampleTelephoneBook.get("Петров2"));
    }
    private static void task1(String str1) {
        String [] arrayWords = normalizationString(str1).split("\s");
        System.out.println("Массив слов:");
        System.out.println(Arrays.toString(arrayWords));
        System.out.println();
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayWords.length; i++) {
            if (map.containsKey(arrayWords[i])) map.put(arrayWords[i],map.get(arrayWords[i])+1);
            else map.put(arrayWords[i],1);
        }
        System.out.println("Перечень уникальных слов и их кол-во вхождений в массиве:");
        for (Map.Entry<String,Integer> el:map.entrySet()) {
            System.out.print(el.getKey() + " - " + el.getValue());
            System.out.println();
        }
    }

    private static String normalizationString(String str1) {
        StringBuilder str = new StringBuilder(str1);
        while (str.indexOf(".") >= 0) {
            str.replace(str.indexOf("."), str.indexOf(".") + 1, "");
        }
        while (str.indexOf(",") >= 0) {
            str.replace(str.indexOf(","), str.indexOf(",") + 1, "");
        }
        while(str.indexOf(" ") == 0)str.replace(0, 1, "");

        return str.toString();
    }
}

