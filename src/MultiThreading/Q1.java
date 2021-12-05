package MultiThreading;

/*Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.*/

public class Q1 implements Runnable{
    @Override
    public void run(){

    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        Thread obj2 = new Thread(obj,"Scooby"); //Assigning name to the first thread
        Thread obj3 = new Thread(obj,"Shaggy");
        System.out.println("Name of first thread is "+ obj2.getName());
        System.out.println("Name of secon thread is "+ obj3.getName());
    }
}
