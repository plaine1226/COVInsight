import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Analysis {
	private static String current = new File("Main.java").getAbsolutePath();
	private static String path = current.substring(0,current.length()-9);
	
	public static ArrayList<String> possiblePangos() {
		String line = "";
		ArrayList<String> pangoLineages = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			ArrayList<Strain> strainList = new ArrayList<Strain>();
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Strain currentStrain = new Strain(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11]);
				strainList.add(currentStrain);
			}
			pangoLineages.add(strainList.get(0).getPangoLineage());
			for (int i = 1; i < strainList.size(); i++) {
				if (!(pangoLineages.contains(strainList.get(i).getPangoLineage()))) {
					pangoLineages.add(strainList.get(i).getPangoLineage());
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pangoLineages;
	}
	
	public static ArrayList<String> mostFrequentCountries() {
		String line = "";
		ArrayList<String> pangoLineages = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			ArrayList<Strain> strainList = new ArrayList<Strain>();
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Strain currentStrain = new Strain(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11]);
				strainList.add(currentStrain);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pangoLineages;
	}
}
