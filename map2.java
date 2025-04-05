import java.util.*;
public class map2 {
    public static void main(String[] args) {

    int [] arr = {1,2,1,2,1,2,1,2};
    HashMap<Integer , Integer> mp = new HashMap<>();
    for(var r : arr){
        if(mp.containsKey(r)){
            mp.put(r, mp.get(r)+1);
        }else mp.put(r, 1);
    }
    System.out.println(mp);
    int max = 0;
    int ansk = -1;
    for(var e : mp.keySet()){
        if(mp.get(e)> max){
            max = mp.get(e);
            ansk = e;
        }

    }
    System.out.println(ansk);
    }
    
}
