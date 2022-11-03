package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public int getNumber() {
		int getNumber = (int)((Math.random() * n) + 1);
		return getNumber;
	}
}
