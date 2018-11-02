import java.util.HashMap;


class EmployeeMap {
    
    private String name;
    
    public EmployeeMap(String name) { // constructor
           this.name = name;
    }
 
 
    //no hashCode() method
    
    //no equals() method
    
    @Override
    public String toString() {
           return "Employee[ name=" + name + "] ";
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeMap other = (EmployeeMap) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
 
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class Program1 {
    public static void main(String...a){
           
           HashMap<EmployeeMap, String> hm=new HashMap<EmployeeMap, String>();
           hm.put(new EmployeeMap("a"), "emp1");
           hm.put(new EmployeeMap("b"), "emp2");
           hm.put(new EmployeeMap("a"), "emp1 OVERRIDDEN");
           
           System.out.println("HashMap's data> "+hm);
           System.out.println("HashMap's size> "+hm.size());
           System.out.println(hm.get(new EmployeeMap("a")));
           
    }
}