

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pialogue
 */
public class Queue {

    private LinkQueue front;
    private LinkQueue rear;

    public Queue() {
        this.front = this.rear = null;

    }

    public void insert(int priority  , String nama) {
        LinkQueue l = new LinkQueue(priority , nama);

        if (this.rear == null) {
            this.front = this.rear = l;
            return;
        }
        this.rear.next = l;
        this.rear = l;
    }

    public LinkQueue remove() {
        if (this.front == null) {
            return null;
        }
        LinkQueue l = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return l;
    }

    public void displayQueue() {
        System.out.println("Queue (front --> rear)");
        LinkQueue current = front;
        while (current != null) {
            System.out.println(current.priority + " " + current.name);
            current = current.next;
        }
        System.out.println("");
    }

}
