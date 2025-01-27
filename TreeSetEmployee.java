package pack1;

import java.util.Objects;

class TreeSetEmployee implements Comparable<TreeSetEmployee> {
	

	private String name;
	private int id;
	private double salary;
	
	@Override
	public int compareTo(TreeSetEmployee o) {
		// TODO Auto-generated method stub
		
		TreeSetEmployee e = (TreeSetEmployee)o;
		
		if(this.getSalary()<e.getSalary()) {
			return -234535;
		}
		else if (this.getSalary()==e.getSalary()) {
			return 0;
		}
		return 1;
	}

	public TreeSetEmployee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "TreeSetEmployee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}
