package lesson12;

public class Human extends Alive{
	
	protected String fio;
	
	public Human (boolean ex, boolean dna, String fio) {
		super(ex, dna);
		this.fio = fio;
	}
	
}
