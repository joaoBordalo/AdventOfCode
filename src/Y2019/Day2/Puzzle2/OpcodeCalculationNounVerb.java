package Y2019.Day2.Puzzle2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcodeCalculationNounVerb {
	
	public int calculateOpcodeOnZeroPosition()
	{
		
		File file = new File("src/Y2019/Day2/Puzzle1/opcode.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner sc = new Scanner(br).useDelimiter(",");
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (sc.hasNextInt()) {
		    al.add(sc.nextInt());
		}
		
		//puzzle indication "before running the program, replace position 1 with the value 12 and replace position 2 with the value 2"
		al.set(1, -1);
		al.set(2, -1);
		ArrayList<Integer> alchangable = al;
		int instruction;
		int it = 0;
		int stopCondition = 19690720;
		while(al.get)
		while (true)
		{
			if(stopCondition == 100 *al.get(1) + al.get(2))
			{
				System.out.println(al.get(1) + " + " + al.get(2));
				return al.get(0);
			}
			instruction = al.get(it);
		    switch (instruction) {
				case 1:			
					al.set(1, 0);
					al.set(2, 0);
					al.set(al.get(it+3), al.get(al.get(it+2)) + al.get(al.get(it+1)));
					it = it + 4 ;
					break;
				case 2:
					al.set(1, 0);
					al.set(2, 0);
					al.set(al.get(it+3), al.get(al.get(it+2)) * al.get(al.get(it+1)));
					it = it + 4 ;
					break;
				case 99:
					return al.get(0);
				default:
					System.out.println("ERROR: wrong opcode!!!");
					break;	
		    }

		}
	}

}
