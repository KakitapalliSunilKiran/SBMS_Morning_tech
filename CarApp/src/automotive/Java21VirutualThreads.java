package automotive;

import java.util.ArrayList;
import java.util.List;

public class Java21VirutualThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Thread> threads = new ArrayList<>();

        Runnable r = () -> {
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 1000000; i++) 
        {

            Thread t = new Thread(r); // platform thread
        	//Thread t = Thread.ofVirtual().start(r);
            t.start();
            t.setName("thread- "+i);
            //System.out.println("I am in Thread");
            threads.add(t);
        }

        for (Thread t : threads) 
        {
            try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
