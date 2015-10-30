package modeling_classroom;

public class MainClass {
	public static final int AMOUNT_OF_PEOPLE = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human[] humans = new Human[AMOUNT_OF_PEOPLE];
		String[] fios = {"vitalii", "misha b", "misha", "evgenii", "pavel", "jana", "artur", "marija"};
		for (int i = 0; i < humans.length; i++) {
			humans[i] = new Human(fios[i]);
		}
		ClassRoom room = new ClassRoom();
		for (Human h : humans) {
			h.setDestination(room);
		}
		for (int i = 0; i < humans.length; i++) {
			humans[i].setComputer(room.getComps()[i]);
			humans[i].sit();
		}
		// lesson
		for (Human h : humans) {
			h.finish();
		}
	}

}
