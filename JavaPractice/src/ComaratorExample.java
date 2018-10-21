import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int empno;
	String empname;
	
	Employee(int empno,String empname){
		this.empno=empno;
		this.empname=empname;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String toString(){
		return "empno="+empno+"   empname="+empname;
	}
	public boolean equals(Object obj){
		if(obj==this) return true;
		if((null==obj)|| this.getClass()!=obj.getClass()) return false;
		Employee em=(Employee)obj;
		return ((em.empno==empno) ||
				(em.empname==empname)||(empname!=null && empname.equals(em.empname)));
					
		
			}
	public int hashCode(){
		int hash=9;
		hash=(31*hash)+empno;
		hash=(31*hash)+(null==empname?0:empname.hashCode());
		return hash;
	}
	
}

class EmpidComparator implements Comparator<Employee> , Serializable{
	public int compare(Employee o1,Employee o2){
		return o1.empno-o2.empno;
	}
}
class EmpNameComparator implements Comparator<Employee> , Serializable{
	public int compare(Employee o1,Employee o2){
		return o1.empname.compareTo(o2.empname);
	}
}

public class ComaratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(new Employee(100,"srinu"));
		ar.add(new Employee(1,"rao"));
		ar.add(new Employee(10,"vasu"));
		Collections.sort(ar,new EmpidComparator() );
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new EmpNameComparator() );
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
	}
	

}

