
class StackQueueDemo {

    static class Stack {
        int max = 5;
        int top = -1;
        int[] stack = new int[max];

        void push(int value) {
            if (top == max - 1) {
                System.out.println("Stack Overflow");
            } else {
                stack[++top] = value;
                System.out.println(value + " pushed into stack");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println(stack[top--] + " popped from stack");
            }
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Stack elements:");
                for (int i = top; i >= 0; i--) {
                    System.out.println(stack[i]);
                }
            }
        }
    }

    static class Queue {
        int max = 5;
        int front = -1, rear = -1;
        int[] queue = new int[max];

        void enqueue(int value) {
            if (rear == max - 1) {
                System.out.println("Queue Overflow");
            } else {
                if (front == -1)
                    front = 0;
                queue[++rear] = value;
                System.out.println(value + " inserted into queue");
            }
        }

        void dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println(queue[front++] + " removed from queue");
            }
        }

        void display() {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
            } else {
                System.out.println("Queue elements:");
                for (int i = front; i <= rear; i++) {
                    System.out.println(queue[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        Queue q = new Queue();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();

        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.display();
        q.dequeue();
    }
}