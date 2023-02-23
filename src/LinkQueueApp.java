

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pialogue
 */
public class LinkQueueApp {
    public static void main(String[] args) {
         Queue q = new Queue();
         q.insert(1665100, "Dee");
         q.insert(1665200, "Deaja");
         
         q.displayQueue();
         
         q.insert(1665300, "Ami");
         q.insert(1665400, "Maya");
         q.insert(1665500, "Yati");
         
         q.displayQueue();
         
         q.remove();
         q.remove();
         
         q.displayQueue();
    }
}
