package ArrL;

import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {

        LinkList<String> list = new LinkList<>();

        list.add("5");
        list.add("22");
        list.add("99", 0);

        list.print();
        if (list.size() == 3) {
            System.out.println("Все ок");           //проверяем размер после заполнения
        } else {
            System.out.println("Натупил");
        }
        if (list.get(1).equals("5")) {                 //проверяем метод гет
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }

        list.remove(0);

        if (list.size() == 2) {                         //проверяем размер после удаления
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }
        if (list.get(1).equals("22")) {                 //проверяем после смещения
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }
        list.set(1, "0");
        if (list.get(1).equals("0")) {
            System.out.println("Все ок");                    //проверяем после замены
        } else {
            System.out.println("Натупил");
        }
    }
}
