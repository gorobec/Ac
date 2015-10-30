package modeling_classroom;

public class Human {
	private String fio;
	private ClassRoom destination;
	private Computer comp;

	public Human(String fio) {
		this.fio = fio;
	}

	public Human(String fio, ClassRoom destination) {
		this.fio = fio;
		this.destination = destination;
	}

	public void goToRoom(ClassRoom classRoom) {
		System.out.println(fio + "go to classroom");
	}

	public void setComputer(Computer comp) {
		this.comp = comp;
	}

	public void setDestination(ClassRoom destination) {
		this.destination = destination;
	}

	public void sit() {
		System.out.println("I'm sitting to computer � " + comp.number
				+ " and work with him");
	}
	
	public void finish() {
		System.out.println(fio + " finishes class comp � " + comp.number + " Bye...");
	}
}
