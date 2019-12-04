package Y2019.Day2.Puzzle2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
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
		sc.close();
		ArrayList<Integer> alchangable;

		//System.out.println(al.get(0) + " " + al.get(1) + " " + al.get(2) + " " + al.get(3));
		int instruction;
		int it;
		boolean halt;
		int stopCondition = 19690720;
		for(int i = 0; i <= 99; i++)
			for(int j = 0; j <= 99; j++)
			{
				halt = false;
				it = 0;
				alchangable = (ArrayList<Integer>) al.clone();
				alchangable.set(1, i);
				alchangable.set(2, j);
				//System.out.println(alchangable.get(0) + " " + alchangable.get(1) + " " + alchangable.get(2) + " " + alchangable.get(3));
				while (!halt)
				{
					if(stopCondition == alchangable.get(0))
					{
						System.out.println("100 * " + i + " + " + j + " = " + (100 * i + j));
						return alchangable.get(0);
					}
					instruction = alchangable.get(it);
				    switch (instruction) {
						case 1:			
							alchangable.set(alchangable.get(it+3), alchangable.get(al.get(it+2)) + alchangable.get(alchangable.get(it+1)));
							it = it + 4 ;
							break;
						case 2:
							alchangable.set(alchangable.get(it+3), alchangable.get(al.get(it+2)) * alchangable.get(alchangable.get(it+1)));
							it = it + 4 ;
							break;
						case 99:
							halt = true;
							//System.out.println("Halt!");
							break;
						default:
							System.out.println("ERROR: wrong opcode!!!");
							break;	
				    }

				}
			}
		return -1;
	}

}
