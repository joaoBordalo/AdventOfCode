package Y2019.Day1.Puzzle2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AdditionalFuelRequirement {
	
	public int fuelRequired(int mass) {
		return (mass / 3) - 2;
	}

	public int calculateFuelRequirement() {

		int totalRequiredFuel = 0;
		// read from file
		File file = new File("src/Y2019/Day1/Puzzle1/massOfEachModule.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String st;
		int fuel = 0;
		try {
			while ((st = br.readLine()) != null) {
				fuel = Integer.parseInt(st);
				while(fuel > 0)
				{
					fuel = fuelRequired(fuel);
					if(fuel <= 0)
						break;
					totalRequiredFuel += fuel;
				}
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
