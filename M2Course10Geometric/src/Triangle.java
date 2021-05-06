
public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(String text, String material, int base, int height) {
		super(text, material);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getSize() {
		double area = this.base * this.height/2;
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangle height is: " + height + ", base is: " + base + ", " + super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Triangle other = (Triangle) obj;
		if(super.equals(other) && this.height == other.height && this.base == other.base) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + base;
		result = prime * result + height;
		return result;
		
	}
}
