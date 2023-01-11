package ArrL;


public class ArrList<T> implements List<T> {
    Object[] arr = new Object[2];
    int size = 0;


    private void proverka() {

        if (arr.length == size) {
            Object[] newarray = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newarray[i] = arr[i];
            }
            arr = newarray;
        }
    }

    @Override
    public void add(T elem) {
        proverka();

        arr[size] = elem;
        size++;
    }

    @Override
    public void add(T elem, int ind) {

    }


//    @Override
//    public void add(int ind, LinkList<T>.Node<T> elem) {
//
//    }

//    @Override
//    public void add(int ind, T elem) {
//
//        proverka();
//
//        Object b = null;
//        //  elem = (T) b;
//
//        Object[] newarray = new Object[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            if (i < ind) {
//                newarray[i] = arr[i];
//            }
//            if (i > ind) {
//                newarray[i] = arr[i - 1];
//            }
//            if (i == ind) {
//                newarray[i] = elem;
//            }
//        }
//        for (int i = 0; i < newarray.length; i++) {
//            arr[i] = newarray[i];
//        }
//        size++;
//    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int ind) {

        if (ind >= size || ind < 0) {
            throw new IndexOutOfBoundsException("Чувак это далеко");
        }
        Object[] newarray = new Object[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {

            if (i == ind) {
                newarray[i] = arr[i + 1];
            }
            if (i < ind) {
                newarray[i] = arr[i];
            }
            if (i > ind) {
                newarray[i] = arr[i + 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarray[i];
        }
        size--;

    }

    @Override
    public void remove() {

    }

    @Override
    public T set(int ind, T elem) {

        if (ind >= size || ind < 0) {
            throw new IndexOutOfBoundsException("Чувак это далеко");
        }
        arr[ind]=elem;

return null;
    }

    @Override
    public void print() {






    }

    @Override
    public T get(int ind) {

              return  (T) arr[ind];
    }

//    @Override
//    public void remove(T elem) {
//
//    }


}
