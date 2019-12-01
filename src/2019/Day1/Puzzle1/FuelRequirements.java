package Day1.Puzzle1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FuelRequirements {

	public int fuelRequired(int mass) {
		return (mass / 3) - 2;
	}

	public int calculateFuelRequirement() {

		int totalRequiredFuel = 0;
		// read from file
		File file = new File("src/Day1/Puzzle1/massOfEachModule.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String st;
		try {
			while ((st = br.readLine()) != null) {
				totalRequiredFuel += fuelRequired(Integer.parseInt(st));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return totalRequiredFuel;
	}

}
