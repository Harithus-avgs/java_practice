
import java.util.*;
public class Main
{
	public static void main(String[] args) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            hm.put(2,3);
            hm.put(1,4);
            hm.put(3,5);
            System.out.println(hm.size());
            
            for(Integer key : hm.keySet()){
                System.out.println(key + " "+ hm.get(key));
            }
	}
}
