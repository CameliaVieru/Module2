import java.util.ArrayList;

public class Aquarium<E extends AquaticAnimal> {
	private String description;
	private ArrayList<E> fishes = new ArrayList<>(); // notice the diamond
																 // <> notation! (starting Java 8)

	public Aquarium(String description) {
		this.description = description;
	}

	public boolean addFish(E fish) {
		if (fishes.contains(fish)) {

			System.out.println("Error: Fish " + fish.getName() + " is already in aquarium.");
			return false;
		}

		fishes.add(fish);

		System.out.println("Fish " + fish.getName() + " added in aquarium.");
		return true;
	}

	public E removeFish() {
		return fishes.remove(fishes.size() - 1);
	}

	public int numberOfFishes() {
		return fishes.size();
	}

	public boolean isEmpty() {
		return fishes.isEmpty();
	}

	public void mergeAquarium(Aquarium<E> other) {
		while(!other.isEmpty()) {
			this.addFish(other.removeFish());
		}
	}
}
