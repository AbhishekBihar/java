import java.util.ArrayList;

public class Mainarraylist {
    public static void main(String[] args) {
        ArrayList <String> obj =new ArrayList<>();
        obj.add("Abhishek");
        obj.add("Peoples first");
        obj.add("Mission Always");

        System.out.println(obj);


        for(String s:obj)
            System.out.println(s);

       // obj.add(index: 1, element: Girls first);
       // System.out.println(obj);
    }
}
