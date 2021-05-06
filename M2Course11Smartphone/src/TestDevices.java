
public class TestDevices {
	public static void main(String[] args) {
		Screen aScreen = new Screen(100, 4, 10, 8);
	    Case aCase = new Case();
	    Speaker aSpeaker = new Speaker(30, 20);
	    Microphone aMicrophone = new Microphone(50, 25);
	    Smartphone smartphone = new Smartphone(aScreen, aCase, aSpeaker, aMicrophone);
	    
	    smartphone.decreaseMicrophoneVolume();
	    smartphone.colorScreen("red");
	    smartphone.setPixel(6, "green");
	    smartphone.increaseMicrophoneVolume();
	    smartphone.muteMicrophone();
	    smartphone.pressVolumeDown();
	    smartphone.pressVolumeUp();
	    smartphone.setSilenceMode();
	    System.out.println();
	    
	    Smartphone aSecondSmartphone = new Smartphone(100, 7, 9, 11, 60, 80);
	    aSecondSmartphone.decreaseMicrophoneVolume();
	    aSecondSmartphone.increaseMicrophoneVolume();
	    aSecondSmartphone.muteMicrophone();
	    aSecondSmartphone.pressVolumeDown();
	    aSecondSmartphone.pressVolumeUp();
	    aSecondSmartphone.setSilenceMode();
	    aSecondSmartphone.colorScreen("green");

	}
}
