import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Matches> match=new ArrayList<Matches>();
		ArrayList<Deliveries> delivery=new ArrayList<Deliveries>();
		//System.out.println("Read Input");
		String fileName = "src/Dataset/matches.csv";
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		scan.nextLine();
		
		while(scan.hasNextLine())
		{
			String data=scan.nextLine();
			match.add(new Matches(data));
		}
		
		fileName = "src/Dataset/deliveries.csv";
		file = new File(fileName);
		Scanner scan1 = new Scanner(file);
		scan1.nextLine();
		while(scan1.hasNextLine())
		{
			String data=scan1.nextLine();
			//System.out.println(data);
			delivery.add(new Deliveries(data));
			
		}
		scan.close();
		scan1.close();
		System.out.println("-----------------------------------------");
		System.out.println("| YEAR |"+"           TEAM           |"+"COUNT|");
		System.out.println("-----------------------------------------");
		// System.out.printf("|%5s |%25s |%5s|","YEAR","TEAM", "Count").println();
		Matches.selectField(match,2016,4);
		Matches.selectField(match,2017,4);
	}

}
