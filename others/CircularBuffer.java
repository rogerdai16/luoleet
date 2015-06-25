/**
 * Created by Qinghao on 6/24/2015.
 */
public class CircularBuffer {

    private int[] buffer;
    private int last;
    private int count;

    public CircularBuffer(int capacity){
        buffer = new int[capacity];
        last = 0;
        count = 0;
    }

    public void printBuffer(){
        System.out.println("----------");
        for (int i = 0; i < count; i++)System.out.println(buffer[i]);
    }

    public void getNext(int i){
        if(count < buffer.length){
            buffer[count] = i;
            count++;
            return;
        }
        buffer[last] = i;
        last++;
        last %= buffer.length;
    }

    public static void main(String[] args){
        CircularBuffer cb = new CircularBuffer(3);
        cb.getNext(1);
        cb.printBuffer();
        cb.getNext(2);
        cb.printBuffer();
        cb.getNext(3);
        cb.getNext(4);
        cb.printBuffer();
        cb.getNext(5);
        cb.printBuffer();
        cb.getNext(6);
        cb.printBuffer();
        cb.getNext(7);
        cb.printBuffer();
    }


}
