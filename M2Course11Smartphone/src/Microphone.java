
public class Microphone {
	private int maxVolume;
	private int crtVolume;
	
	public Microphone(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = maxVolume * 25 /100;
	}
	
	public Microphone(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}
	
	public boolean increaseVolume() {
		if (this.crtVolume != maxVolume) {
			this.crtVolume += 1;
			System.out.println("Volume: " + this.crtVolume);
			return true;
		}
		
		System.out.println("The Volume reached its maximum capacity!");
		return false;
		
	}
	
	public boolean decreaseVolume() {
		if (this.crtVolume != 0) {
			this.crtVolume -= 1;
			System.out.println("Microphone Volume: " + this.crtVolume);
			return true;
		}
		
		System.out.println("The Smartphone is set to Silence Mode!");
		return false;
		
	}
	
	public void muteMicrophone() {
		if(this.crtVolume != 0) {
			this.crtVolume = 0;
			System.out.println("The Microphone is muted!");
		} else {
		
			System.out.println("The Microphone is already muted!");
		}
	}
}
