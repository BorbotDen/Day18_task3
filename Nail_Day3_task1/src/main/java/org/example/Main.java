package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String city;
        do  {

            System.out.println("write city name");
            Scanner inp = new Scanner(System.in);

            city = inp.next();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манестер":
                case "Лондо":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "stop":
                    continue;
                default:
                    System.out.println("Неизвестный город");

            }
        } while (!city.equals("stop"));

    }
}