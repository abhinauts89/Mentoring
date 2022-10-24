import java.util.Optional;

public class Main {

    public static Optional<String> getName(){
        String name="Abhi";
        return Optional.ofNullable(name);
    }


    public static void main(String args[]){

        String str=null;

        if(str==null){
            System.out.println("value is null");
        }else{
            System.out.println(str.length());
        }

        String str1="java rocks";

        Optional<String> optional=Optional.ofNullable(str1);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("no value in object"));

        //further we can perform streams operations as well


        //Mostly Optional use in return type of methods since two possibility there either method returns value or not and
        //further perform operation based on that

        Optional<String> nameOptional=getName();
        System.out.println(nameOptional.orElse("null return"));


    }
}
