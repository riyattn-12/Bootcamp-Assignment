//3) Design a Data Structure SpecialStack that
// supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack.

import java.util.Stack;
class MyStack
{
    Stack<Integer> s;
    Integer min;

    // Constructor
    MyStack()
    {
        s = new Stack<Integer>();
    }

    // Prints minimum element of MyStack
    void getMin() {
        // Get the minimum number in the entire stack
        if (s.isEmpty())
            System.out.println("Stack is empty");

            // variable minEle stores the minimum element
            // in the stack.
        else
            System.out.println("Minimum Element in the "
                    + " stack is: " + min);
    }

    //push
    void push(Integer x) {
        if (s.isEmpty()) {
            min = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original min
        if (x < min) {
            s.push(2 * x - min);
            min = x;
        } else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }

    //pop
    // Removes the top element from MyStack
    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < min) {
            System.out.println(min);
            min = 2 * min - t;
        } else
            System.out.println(t);
    }

    //peek
    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = s.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        // If t < min means minEle stores
        // value of t.
        if (t < min)
            System.out.println(min);
        else
            System.out.println(t);
    }

};

