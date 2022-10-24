import java.util.ArrayList;

public class Main {

    public static void main(String args[]){
        Runnable runnable=new MyThread();
        Thread t1=new Thread(runnable);
        t1.start();

        //below is with lambda expression ..
        Thread t2=new Thread(()->System.out.println(Thread.currentThread().getName()));
        t2.start();

        ArrayList arrayList=new ArrayList();
        arrayList.add(11);
        arrayList.add(21);
        arrayList.add(41);
        arrayList.add(91);


        arrayList.forEach((x)->System.out.println(x));




    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("show");
        System.out.println(Thread.currentThread().getName());
    }
}
