import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Search {
	
	private int type;
	private String keywords;
	
	String current = new File("Main.java").getAbsolutePath();
	String path = current.substring(0,current.length()-9);
	
	public Search(int inType, String inKeywords) {
		type = inType;
		keywords = inKeywords;
	}
	
	
	public Strain[] findResults() {
		String line = "";
		ArrayList<Strain> results = new ArrayList<Strain>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Strain currentStrain = new Strain(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11]);
				if (type == 0)
				{
					if (currentStrain.getStrainName().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 1)
				{
					if (currentStrain.getGsaidClade().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 2)
				{
					if (currentStrain.getNumS1Muations().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 3)
				{
					if (currentStrain.getClade().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 4)
				{
					if (currentStrain.getCountry().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 11)
				{
					String date = currentStrain.getDate().toUpperCase();
					int first = date.indexOf("/");
					int second = date.indexOf("/", first + 1);
					String checkString = date.substring(0,first)+date.substring(second+1);
					if (checkString.contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Strain[] array = results.toArray(new Strain[0]);
		return array;
	}
	
	public int numElements() {
		String line = "";
		ArrayList<Strain> results = new ArrayList<Strain>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				Strain currentStrain = new Strain(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11]);
				if (type == 0)
				{
					if (currentStrain.getStrainName().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 1)
				{
					if (currentStrain.getGsaidClade().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 2)
				{
					if (currentStrain.getNumS1Muations().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 3)
				{
					if (currentStrain.getClade().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 4)
				{
					if (currentStrain.getCountry().toUpperCase().contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
				if (type == 11)
				{
					String date = currentStrain.getDate().toUpperCase();
					int first = date.indexOf("/");
					int second = date.indexOf("/", first + 1);
					String checkString = date.substring(0,first)+date.substring(second+1);
					if (checkString.contains(keywords.toUpperCase()))
						results.add(currentStrain);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return results.size();
	}
	
	public int totalNumElements() {
		int count = 0;
		try {
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
	public ArrayList<Strain> getAllResults() {
		ArrayList<Strain> strains = new ArrayList<Strain>();
		try {
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader(path + "data.csv"));
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				strains.add(new Strain(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],values[10],values[11]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return strains;
	}
}