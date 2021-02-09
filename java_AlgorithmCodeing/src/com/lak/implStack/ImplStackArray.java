package com.lak.implStack;

/* Stack Implementation using array in Java | Java program to implement stack
        push(E item)	    E	        The method pushes (insert) an element onto the top of the stack.
        pop()	            E	        The method removes an element from the top of the stack and returns the same element as the value of that function.
        peek()	            E	        The method looks at the top element of the stack without removing it. */

public class ImplStackArray {

        int arr[] = new int[10];
        int top = 0;


        private boolean push(int x){

            top++;
            arr[top] = x;
            System.out.println("Element pushed in to the stack= "+x);
            return true;
        }

        private int pop(){
            int x = arr[top--];
            System.out.println("Element popped from stack= "+x);
            return x;
        }

        private int peek(){
            return arr[top];
        }

    public static void main(String[] args) {

            ImplStackArray array = new ImplStackArray();
            array.push(30);
            array.push(40);
            array.push(50);
            array.push(60);
            array.pop();
            array.pop();
        System.out.println("Printing the top most value= "+array.peek());


    }

}
