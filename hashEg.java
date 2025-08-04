import java.util.*;
public class hashEg {
    public static void main(String[] args) {
        HashMap<String,Integer> studInof = new HashMap<>();

        studInof.put("Alice",66);
        studInof.put("Bob",44);
        studInof.put("Levi",99);

        System.out.println("Marks of Levi :" + studInof.get("Levi"));

        if(studInof.containsKey("Krishna")){
            System.out.println("Alice is present");
        }
        else{
            System.out.println("Krishna is not present");
        }
            System.out.println(studInof);

    }
}
