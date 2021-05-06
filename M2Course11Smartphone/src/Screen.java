import java.util.ArrayList;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimension;
	
	public Screen(int pixelsNr, int width, int length, int depth) {
		this.pixels = new ArrayList<>();
		
		for(int i = 0; i < pixelsNr; i++) {
			Pixel pixel = new Pixel();
			pixels.add(pixel);
		}
		this.dimension = new Dimensions(width, length, depth);
			
		}
	
	public void setPixel(int number, String color) {
		this.pixels.get(number).setPixel(color);		
	}
	
	public void colorScreen(String color) {
		for(int i = 0; i < this.pixels.size(); i++) {
			setPixel(i, color);
		}
		System.out.println("Screen is: " + color);
	}
}
