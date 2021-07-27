package theory;

public class StringBuilderJava {

	public static void main(String[] args) {
		String location = "Florida";
		int flightNo = 175;
		StringBuilder sb = new StringBuilder(40); //creates a buffer
		sb.append("I flew to ");
		sb.append(location);
		sb.append(" on Flight #");
		sb.append(flightNo);
		
		String message = sb.toString(); //extracts I flew to Florida on Flight #175
		System.out.println(message);
		
		//find locaion and put a val in middle
		String time = "9:00";
		int pos = sb.indexOf(" on"); 
		sb.insert(pos, " at ");
		sb.insert(pos + 4, time);
		
		message = sb.toString();
		
		System.out.println(message);
	}

}
