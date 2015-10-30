package lesson15;

public class Wife {
	
	private String fio;
	private Child child;

	public Wife(String fio) {
		
		this.fio = fio;
	}
	

	public Wife(String fio, Child child) {
		
		this.fio = fio;
		this.child = child;
	}


	public Child getChild() {
		return child;
	}


	public String getFio() {
		return fio;
	}
	public boolean equals(Object o) {

		if (this == o)
			return true;
		
		if (o == null)
			return false;
		
		if (getClass() != o.getClass())
			return false;
			
		Wife wife = (Wife) o;
		
		if (fio == null)
			throw new NullPointerException();
		if (!fio.equals(wife.fio))
			return false;
		
		if (child != wife.getChild())
			return false;
		
		return true;
		
	}
		
	public String toString(){
		return " Wife - " + fio + child;
	}
}
