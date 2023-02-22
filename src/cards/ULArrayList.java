package cards;

import java.util.Arrays;

public class ULArrayList<E>
        extends Object
        implements Cloneable{

    private int size;
    private E[] cards;

    public ULArrayList() {
        cards = (E[]) new Object[16];
        size=0;
    }

    public ULArrayList(int initialCapacity) {
        cards = (E[]) new Object[initialCapacity];
        size=0;
    }

    public ULArrayList<E> clone() throws CloneNotSupportedException {
        return (ULArrayList<E>) super.clone();
    }

    public void pushBack(E e){
        size++;
        cards[size-1]= e;
    }

    public void insertAt(E element, int index) throws ULIndexOutOfBoundsException{
        if (index >= cards.length){
            throw new ULIndexOutOfBoundsException();
        }
        for(int i=size;i>0;--i){
            cards[i] = cards[i-1];
        }
        cards[index] = element;
        ++size;
    }


    public void clear(){
        while (size>0){
           cards[size-1] = null;
            --size;
        }
    }

    public E get(int index) throws ULIndexOutOfBoundsException{
        if (index >= size){
            throw new ULIndexOutOfBoundsException();
        }
        return cards[index];
    }

    public E popBack() throws ULIndexOutOfBoundsException {
        if (size==0){
            throw new ULIndexOutOfBoundsException();
        }
        E temp = cards[size-1];
        cards[size-1]=null;
        return temp;
    }

    public E removeAt(int index) throws ULIndexOutOfBoundsException{
        if (index >= cards.length){
            throw new ULIndexOutOfBoundsException();
        }
        E temp = cards[index];
        cards[index]=null;
        for(int i=index;i<size;++i){
            cards[i] = cards[i+1];
        }
        --size;
        return temp;
    }

    public E set(int index, E element) throws ULIndexOutOfBoundsException{
        if (index >= size){
            throw new ULIndexOutOfBoundsException();
        }
        E temp = cards[index];
        cards[index]=element;
        return temp;
    }

    public int size(){
     return size;
    }

    public String toString() {
        StringBuilder string = new StringBuilder(Arrays.toString(cards));
        return string.toString();
    }
}
