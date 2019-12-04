package Y2019.Day3.Puzzle1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NearestCrossedWires {
	
	public int calculateNearestCross()
	{
		File file = new File("src/Y2019/Day3/Puzzle1/wires.txt");
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
		
		return 0;
	}
	

}
