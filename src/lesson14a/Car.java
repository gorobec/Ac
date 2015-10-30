package lesson14a;



public class Car implements Cloneable{
	
	private int age;
	private int count;
	private String vendor;
	
	
	public Car(int age, int count, String vendor) {
		this.age = age;
		this.count = count;
		this.vendor = vendor;
	}
	public int getAge() {
		return age;
	}
	public int getCount() {
		return count;
	}
	public String getVendor() {
		return vendor;
	}
	@Override
	public boolean equals (Object o) {
		
		if (this == o)
			return true;
		
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
			
		Car car = (Car) o;
		
		if (age != car.getAge())
			return false;
		
		if (count != car.getCount())
			return false;
		if (vendor == null)
			throw new NullPointerException();
		if (!vendor.equals(car.vendor))
			return false;
		
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
