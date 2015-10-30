package lesson15;


public class Husband implements Cloneable{
	private String fio;
	private int age;
	private Wife wife;
	
	public Husband(String fio, int age, Wife wife) {
		
		this.fio = fio;
		this.age = age;
		this.wife = wife;
	}
	

	public void setWife(Wife wife) {
		this.wife = wife;
	}


	public String getFio() {
		return fio;
	}

	public int getAge() {
		return age;
	}

	public Wife getWife() {
		return wife;
	}
	public boolean equals(Object o) {

		if (this == o)
			return true;
		
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
			
		Husband husband = (Husband) o;
		
		if (age != husband.getAge())
			return false;
		
		if (fio == null)
			throw new NullPointerException();
		if (!fio.equals(husband.fio))
			return false;
		
		if (wife != husband.getWife())
			return false;
		
		return true;
		
	}
	public String toString(){
		return "Husband fio - " + fio + " age - " + age + wife;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
