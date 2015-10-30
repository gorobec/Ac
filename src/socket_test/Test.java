package socket_test;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Vorobiei on 23.07.2015.
 */
public class Test {
    public static void main(String[] args) {

        //PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<Integer>();
        MyQueue mq = new MyQueue();

        Thread prod = new Thread(new ProducerTread(mq));
        Thread cons = new Thread(new ConsumerThread(mq));
        prod.start();
        cons.start();






    }

    public static class ProducerTread implements Runnable {

        private MyQueue q;


        public ProducerTread(MyQueue q) {
            this.q = q;

        }

        @Override
        public synchronized void run() {
            for (int i = 0; i < 50 ; i++) {
                q.put(i);
            }

        }
    }

    public static class ConsumerThread implements Runnable{

        private MyQueue q;


        public ConsumerThread(MyQueue q) {
            this.q = q;
        }


        @Override
        public synchronized void run() {
            q.pull();

        }
    }

}
class MyQueue {
    private SynchronousQueue<Integer> q = new  SynchronousQueue<Integer> ();

    public MyQueue() {

    }
    public synchronized void put(int i) {
        q.add(i);
        System.out.println("Done put " + i);

    }
    public synchronized void pull () {
        while((q.peek()) != null) {
            System.out.println("Done pull " + q.poll());
        }
    }
}