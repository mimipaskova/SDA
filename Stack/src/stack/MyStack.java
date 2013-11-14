package stack;

import java.util.Scanner;

public class MyStack {

    public static void main(String[] args) {


        //1,2 zadachi
//        Stack stack1= new Stack();
//        stack1.pop();
//        stack1.push(5);
//        stack1.push(10);
//        stack1.push(15);
//        stack1.push(20);
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());


        //3 zadacha
        Scanner input = new Scanner(System.in);

        System.out.print("Vuvedi n ");
        int n = input.nextInt();

        Stack stack2 = new Stack();

        if (n > 10 || n < 1) {
            System.out.println("Vuvedenoto 4islo ne e korektno");
        } else {
            int p = 1;
            for (int i = 1; i < n + 1; i++) {

                p = p * i;
                stack2.push(p);
            }

            System.out.println(stack2.peak());
        }

        //4 zadacha
        Stack stack3 = new Stack();


        Scanner input2 = new Scanner(System.in);
        System.out.print("Vuvedi n ");
        int ch = input2.nextInt();
        while (true) {
            int ost = ch % 2;
            stack3.push(ost);
            ch = ch / 2;

            if (ch == 0) {
                break;
            }

        }
        while (!stack3.isEmpty()) {
            System.out.print(stack3.pop());
        }




    }
    //stack1.pop();
    //System.out.println(stack1.pop()+stack1.pop());
}
