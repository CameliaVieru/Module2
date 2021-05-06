
public class Dimensions {
	private int width;
	private int height;
	private int length;
	
	public Dimensions(int width, int height, int length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public Dimensions(int oneNumber) {
		this(oneNumber, oneNumber, oneNumber);
	}
	
}
