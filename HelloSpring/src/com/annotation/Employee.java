package com.annotation;

public class Employee {
int empno;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empno;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
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
	Employee other = (Employee) obj;
	if (empno != other.empno)
		return false;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	return true;
}
String ename;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + "]";
}


}
