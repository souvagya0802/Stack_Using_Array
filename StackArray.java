import java.util.Scanner;
import java.util.Stack;

public class StackArray {
    static int max = 10, i, top, items, count; // Count is used in Switch statement
    static int[] a = new int[10];

    Stack Array() {
        top = -1;
        return null;
    }

    static void push() {
        if (top == max) {
            System.out.println("Stack is full.");
        } else {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter elements: ");
                items = sc.nextInt();
                a[++top] = items;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            top--;
            System.out.println("Item " + a[top+1] + " pop");
        }
    }

    static void display() {
        for (i = top; i > 0; i--) {
            System.out.println("Items present in stack are/is: " + a[i]);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter 1.Push, 2.Pop, 3.Display, 4.Exit");
            try {
                Scanner sc2 = new Scanner(System.in);
                count = sc2.nextInt();
            } catch (Exception e) {
                System.out.println(e);
            }
            if (count == 4) {
                break;
            } else {
                switch (count) {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                }
            }
        }
    }
}
