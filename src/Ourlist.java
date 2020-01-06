import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;

public class Ourlist<E> implements Ourlisti<E> {
    private int size=0;
    private static int default_size=5;
    E[] data;


    public Ourlist(){
        data = (E[])new Object[default_size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add (E element) {
        data[size]= element;
        size++;
        grow();
    }


    @Override
    public E get(int getIndex) {
        return data[getIndex];
    }

    @Override
    public int find(Object searchFor) throws Exception {
        for (int i=0; i<size; i++){
            System.out.println(searchFor+" "+ data[i]);
            if (data[i]==searchFor){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int checkCapasity() {
        return data.length-size;
    }

    @Override
    public void grow() {
        if (data.length==size) {
            data = Arrays.copyOf(data, data.length+1);
        }
    }
}
