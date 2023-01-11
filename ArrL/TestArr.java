package ArrL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {

        ArrList<Integer> arrList1 = new ArrList<>();
        arrList1.add(3);
        arrList1.add(4);

        if (arrList1.size() == 3) {
            System.out.println("Все ок");           //проверяем размер после заполнения
        } else {
            System.out.println("Натупил");
        }
        if ( arrList1.get(1)==3) {                 //проверяем метод гет
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }
        arrList1.remove(1);
        if (arrList1.size() == 2) {                         //проверяем размер после удаления
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }
        if (arrList1.get(1)==4) {                 //проверяем после смещения
            System.out.println("Все ок");
        } else {
            System.out.println("Натупил");
        }
        arrList1.set(1, 0);
        if (arrList1.get(1)==0) {
            System.out.println("Все ок");                    //проверяем после замены
        } else {
            System.out.println("Натупил");
        }

    }
}
