package lesson11;

public class Student {
	
	private String name;
	private Cabinet destination;
	private Computer comp;

    public Cabinet getDestination () {
        return destination;
    }
	
	public void setName(String name){
		this.name = name;
		
	}
	
	public String getName() {
		return name;
		
	}
	public Student(String name) {
		this.name = name;
		
	}
	public Student(String name, Cabinet destination) {
        this.name = name;
        this.destination = destination;
		
	}
	public void goToRoom (Cabinet cab) {
		System.out.println(name + " go to classroom");
		
	}
	public void setComputer (Computer comp) {
		
		this.comp = comp;
	}

    public void setDestination(Cabinet destination) {
        this.destination = destination;
    }

    public void work () {
		
		System.out.println(name + " is working on the computer number " + comp.number);
	}
	public void finish () {
        System.out.println(name + " finished class comp " + comp.number + " Bye...");
    }



}
