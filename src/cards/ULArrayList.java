//@author Julian Powell
package cards;
public class ULArrayList<E>
        implements Cloneable{

    private int size;
    private E[] items;

    public ULArrayList() {
        items = (E[]) new Object[16];
        size=0;
    }

    public ULArrayList(int initialCapacity) {
        items = (E[]) new Object[initialCapacity];
        size=0;
    }

    public ULArrayList<E> clone() {
        ULArrayList<E> clone = new ULArrayList<E>();
        try {
            clone = (ULArrayList<E>) super.clone();
            //this line below is necessary to ensure that when the
            // original array is altered, the clone remains the same
            clone.items = (E[]) items.clone();
        }
        catch (CloneNotSupportedException exception) {}
        return clone;
    }

    public void pushBack(E e){
        //doubles length if the size of the array is equal to the total allocated length
        if(items.length==size){
            E[] temp = (E[]) new Object[2*items.length];
            for(int i=0; i<size;++i){
                temp[i] = items[i];
            }
            items = temp;
        }
        size++;
        items[size-1]= e;
    }

    public void insertAt(E element, int index) throws ULIndexOutOfBoundsException{
        if (index>size || index < 0){
            throw new ULIndexOutOfBoundsException();
        }
        //doubles length if the size of the array is equal to the total allocated length
        if(items.length==size) {
            E[] temp = (E[]) new Object[2 * items.length];
            for (int i = 0; i < size; ++i) {
                temp[i] = items[i];
            }
            items = temp;
       }
        //pushes all items after the index to be inserted back one
        for(int i=size;i>index;--i){
            items[i] = items[i-1];
        }
        items[index] = element;
        ++size;
    }


    public void clear(){
        while (size>0){
           items[size-1] = null;
            --size;
        }
    }

    public E get(int index) throws ULIndexOutOfBoundsException{
        if (index >= size){
            throw new ULIndexOutOfBoundsException("Index out of bounds");
        }
        return items[index];
    }

    public E popBack() throws ULIndexOutOfBoundsException {
        if (size==0){
            throw new ULIndexOutOfBoundsException();
        }
        E temp = items[size-1];
        items[size-1]=null;
        --size;
        return temp;
    }

    public E removeAt(int index) throws ULIndexOutOfBoundsException{
        if (index>=size || index < 0){
            throw new ULIndexOutOfBoundsException();
        }
        //pulls all items to the right of the index being removed forward by one
        E temp = items[index];
        items[index]=null;
        for(int i=index;i<size;++i){
            items[i] = items[i+1];
        }
        --size;
        return temp;
    }

    public E set(int index, E element) throws ULIndexOutOfBoundsException{
        if (index>=size || index < 0){
            throw new ULIndexOutOfBoundsException();
        }
        items[index]=element;
        return items[index];
    }

    public int size(){
     return size;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        //iterates through the array and adds the string
        // form of the item into the builder as long as it is not null
        for (E item : items){
            if(item != null) {
                string.append(item.toString()).append("\n");
            }
        }
        return string.toString();
    }
}
