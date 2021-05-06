
public class Speaker {
	private int maxVolume;
	private int crtVolume;
	
	public Speaker(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = maxVolume * 25 /100;
	}
	
	public Speaker(int maxVolume, int crtVolume) {
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
			System.out.println("Volume: " + this.crtVolume);
			return true;
		}
		
		System.out.println("The Smartphone is set to Silence Mode!");
		return false;
		
	}
	
	public void setSilenceMode() {
		if(this.crtVolume != 0) {
			this.crtVolume = 0;
			System.out.println("The Smartphone is set to Silence Mode!");
		} else {
		
		System.out.println("The Smartphone is already set to Silence Mode!");
		}
	}
}
