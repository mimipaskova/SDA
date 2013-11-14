package stack;

public class Stack {

    private int maxSize = 100;
    private int top;
    private int[] data;

    public Stack() {
        top = -1;
        data = new int[maxSize];
    }

    public void push(int x) {
        top++;
        if (isFull()) {
// 1 zada4a      
//           if(top>maxSize-1){
            System.out.println("Prepulnen e steka");
            top--;
        } else {
            data[top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {


            //1 zada4a
//        if(top<0){
            System.out.println("Prazen e steka");
            return 0;
        } else {
            int value = data[top];
            top--;
            return value;
        }
    }

    public int peak() {
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        top = -1;
    }
    //2 zadacha

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top > maxSize - 1) {
            return true;
        }
        return false;
    }
}
