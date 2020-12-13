import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
//		Date d = new Date();
//		System.out.println(d.getYear());
//		System.out.println(d.getMonth()+1);//month:0~11
//		System.out.println(d.getDate());
//		System.out.println(d.getDay());//day:0(일) 1 2 3 4 5 6(토)
//		System.out.println(d.getTime());
//		System.out.println(d.getMinutes());
//		System.out.println(d.getSeconds());
	}

}
