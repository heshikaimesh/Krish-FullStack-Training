package test;

import java.util.ArrayList;

interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();

}

class A {

    ArrayList<String> list = new ArrayList<>();

    public A() {
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");

    }

    public void addItem(String name) {
        list.add(name);
    }

    //public ArrayList<String> getItems() {
    //return list;
    //}
    public Iterator getItems() {
        return new AIterator(list);
    }
}

// A kiyana Iterator eken wennw list eka iterator ekata convert wena eka
//B iterator eken wenne array eka iterator ekakata convert wena eka
class AIterator implements Iterator {

    ArrayList<String> list;
    int index = 0;

    public AIterator(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Object next() {
        return list.get(index++);
    }

}

class B {

    String[] array = new String[4];
    int i = 0;

    public B() {
        array[i] = "Apple";
        i++;
        array[i] = "Orange";
        i++;
        array[i] = "Mango";
        i++;
    }

    public void addItem(String name) {
        if (i < array.length) {
            array[i] = name;
            i++;
        } else {
            System.out.println("Storage full");
        }
    }

//    public String[] getItems() {
//        return array;
//    }
    public Iterator getItems() {
        return new BIterator(array);
    }

}

class BIterator implements Iterator {

    String[] array;
    int index = 0;

    public BIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (index < array.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return array[index++];
    }

}

public class test {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.addItem("Banana");
        b.addItem("Banana");

//        ArrayList<String> item1 = a.getItems();
//        String[] item2 = b.getItems();
//
//        for (int i = 0; i < item1.size(); i++) {
//            System.out.println(item1.get(i));
//        }
//
//        for (int i = 0; i < item2.length; i++) {
//            System.out.println(item2[i]);
//        }
        Iterator item1 = a.getItems();
        Iterator item2 = b.getItems();

        while (item1.hasNext()) {
            String name = item1.next().toString();
            System.out.println(name);
        }

        while (item2.hasNext()) {
            String name = item2.next().toString();
            System.out.println(name);
        }

    }

}
