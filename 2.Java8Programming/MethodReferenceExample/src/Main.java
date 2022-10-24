import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]){

        //provide implementation of WorkInter

        WorkInter workInter=()->{
            System.out.println("This is do task new method");
        };
        workInter.doTask();


        // we can give method reference of doStuff rather than writing new implementation of doTask
        //here we are doing static method reference
        // number of parameter should be same for method we need to reference
        WorkInter workInter1=Stuff::doStuff;
        workInter1.doTask();


        //here we are doing non-static method reference
        Stuff stuff=new Stuff();
        WorkInter workInter2=stuff::printNumber;
        workInter2.doTask();


        //Below is normal implementation without constructor reference
        Provider provider=()->{
            return new Student();
        };
        Student student=provider.getStudent();
        student.display();

        // below is for constructor reference
        Provider provider1=Student::new;
        Student student1=provider1.getStudent();
        student1.display();

        //method reference in stream api
        List<Integer> integers= Arrays.asList(22,33,11,78);
        System.out.println(integers);
        integers.stream().forEach(e->System.out.println(e));
        System.out.println("****------------********--------------");

        integers.stream().forEach(System.out::println);


    }
}
