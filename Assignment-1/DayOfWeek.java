import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
		//String str_date = "16-06-07";
		Scanner reader=new Scanner(System.in);
		 System.out.print("Enter a Date in the Format like dd-MM-yy");
		 String str_date=reader.next();
		DateFormat formatter;
		Date date;
		Calendar c = Calendar.getInstance();
		formatter = new SimpleDateFormat("dd-MM-yy");
		try
		{
			date = formatter.parse(str_date);
			c.setTime(date);
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
			switch(dayOfWeek)
			{
			case 1:
				System.out.print("SUNDAY");
				break;
			case 2:
				System.out.print("MONDAY");
				break;
			case 3:
				System.out.print("TUESDAY");
				break;
			case 4:
				System.out.print("WEDNESDAY");
				break;
			case 5:
				System.out.print("THURSDAY");
				break;
			case 6:
				System.out.print("FRIDAY");
				break;
			case 7:
				System.out.print("SATURDAY");
				break;
			default:
				System.out.print("Invalid Day");
				break;
			}
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.print("Invalid Date Format");
			
		}
		
	}
}
