import model.AlfaRomeo;
import model.Example;

public class VehicleNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		AlfaRomeo alfa = new AlfaRomeo();
		System.out.println(alfa.makeNoise());
	}

}
