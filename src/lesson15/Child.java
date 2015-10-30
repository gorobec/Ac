package lesson15;

public class Child {
	private String fio;

	public Child(String fio) {
		
		this.fio = fio;
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
			
		Child child = (Child) o;
		
		if (fio == null)
			throw new NullPointerException();
		if (!fio.equals(child.fio))
			return false;
		
		return true;
		
	}
	public String toString(){
		return " Child - " + fio;
	}
	
	

}
