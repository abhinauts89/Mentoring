public class Main {

    public static void main(String args[]){
        Inr t=new InrImpl();
        t.show();

        // We can override method of Interface without implementing it using anonymous abstract class

        Inr t1=new Inr() {
            @Override
            public void show() {
                System.out.println("Anonymous");
            }
        };
        t1.show();

        //Below won't create memory for new class whereas other impl will create memory
        /*Won't be helpful performance wise but will reduce code and need to create ImplInterface*/
        Inr t2=()->System.out.println("Lambda");
        t2.show();

    }
}

//we have created below class to override method and implement Inr Interface
class InrImpl implements Inr{

    @Override
    public void show() {
        System.out.println("show");
    }
}