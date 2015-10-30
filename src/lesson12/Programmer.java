package lesson12;

public class Programmer extends Human {
	
	protected int expirience;
	
	public Programmer(boolean ex, boolean dna, String fio, int exp) {
		super(ex, dna, fio);
		expirience = exp;
	}
	public void codding() {
		System.out.println(fio + " is codding programms");
	}
}
