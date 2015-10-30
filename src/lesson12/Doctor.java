package lesson12;

public class Doctor extends Human {
	
	protected boolean liciencse;
	
	public Doctor(boolean ex, boolean dna, String fio, boolean lic) {
		super(ex, dna, fio);
		liciencse = lic;
	}
	public void cure () {
		System.out.println(fio + " is curing people");
	}
}
