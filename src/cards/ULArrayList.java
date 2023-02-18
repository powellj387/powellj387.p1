package cards;

import java.util.ArrayList;

public class ULArrayList<E>{
    private int size;
    private ArrayList<Card> cardArray;

    public ULArrayList() {
        cardArray = new ArrayList<Card>(16);
        size=0;
    }

    public ULArrayList(int initialCapacity) {
        cardArray = new ArrayList<Card>(initialCapacity);
        size=0;
    }

    public ULArrayList<E> clone() {

    }

    public void pushBack(E e){

    }

    public void clear(){

    }

    public E get(int index) throws ULIndexOutOfBoundsException{

    }

    public E popBack() throws ULIndexOutOfBoundsException {

    }

    public E removeAt(int index) throws ULIndexOutOfBoundsException{

    }

    public E set(int index, E element) throws ULIndexOutOfBoundsException{

    }

    public int size(){
     return size;
    }

    public String toString(){

    }
}
