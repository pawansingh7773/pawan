import java.util.*;
public class map1 {
    public static void hashmapm(){
        HashMap<String , Integer> mp = new HashMap<>();
        mp.put("aakash", 21);
        mp.put("yash" , 16);
        mp.put("luve", 17);
        System.out.println(mp.containsKey("yash"));
        System.out.println(mp.remove("yash"));
        mp.putIfAbsent("yashika", 19);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp);
        System.out.println(mp.entrySet());
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d ", e.getKey() , e.getValue());
            System.out.println();


        }
        System.out.println();

    }
    public static void main(String[] args) {
        hashmapm();
        
    }
    
}
