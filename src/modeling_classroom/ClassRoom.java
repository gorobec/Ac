package modeling_classroom;

public class ClassRoom {
	public static final int AMOUNT_OF_COMPUTERS = 13;
	private Computer[] comps;
	public Computer[] getComps() {
		return comps;
	}
	public ClassRoom() {
		comps = new Computer[AMOUNT_OF_COMPUTERS];
		for (int i = 0; i < comps.length; i++) {
			comps[i] = new Computer(i + 1);
		}
	}
	
}
