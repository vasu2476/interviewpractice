package hashmap;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetInternals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		//System.out.println(set.add(null));
		//System.out.println(set.add(null));
		
System.out.println(set.size());
		/*for(Object o: set){
			
			System.out.println((String)o);
			set.add("test");
		}*/
	Iterator it=set.iterator();
	 while(it.hasNext()){
		 System.out.println(it.next());
		 it.remove();
	 }
	}

}

class mySet<E> extends AbstractSet<E> implements Set<E>,Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private transient HashMap<E,Object> map;
	
	private static final Object PRESENT=new Object();
	
	public mySet(){
		map=new HashMap<>();
	}
	
	public boolean add(E e){
		return map.put(e,PRESENT)==null;
		
	}
	
	
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}