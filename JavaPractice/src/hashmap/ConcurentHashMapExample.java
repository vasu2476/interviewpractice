package hashmap;


import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;


public class ConcurentHashMapExample
{
    
    
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            System.out.println(premiumPhone.put("Sony", "Xperia Z"));
        }
        System.out.println(premiumPhone.size());
        
        
    }
    
}
