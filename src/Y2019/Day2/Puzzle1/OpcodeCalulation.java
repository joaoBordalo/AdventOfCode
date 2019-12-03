package Y2019.Day2.Puzzle1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcodeCalulation {

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
		al.set(1, 12);
		al.set(2, 2);
		int instruction;
		int it = 0;
		while (true)
		{
			instruction = al.get(it);
		    switch (instruction) {
				case 1:
					
					al.set(al.get(it+3), al.get(al.get(it+2)) + al.get(al.get(it+1)));
					break;
				case 2:
					al.set(al.get(it+3), al.get(al.get(it+2)) * al.get(al.get(it+1)));
					break;
				case 99:
					return al.get(0);
				default:
					System.out.println("ERROR: wrong opcode!!!");
					break;	

		    }
		    it = it + 4 ;
		}
	}
	
}
