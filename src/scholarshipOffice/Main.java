package scholarshipOffice;

public class Main {
	
	public static void main(String []args){
		try {
			new UI();
		}
		catch(Exception e) {
			System.out.println("Issues launching the frame");
			System.out.println(e);
		}
	}
}
