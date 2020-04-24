import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class testClient {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(113);
//		System.out.println(lst.size());
		
		 
		 LinkedList<Integer> link = new LinkedList<>();
		 
		 link.addAll(lst);
		 
		 Iterator it = link.iterator();
		 System.out.println("Size is  : "+ link.size());
		 while(it.hasNext()) {
		System.out.println(it.next());
		 }
		 link.add(5, 55);
		 System.out.println("Size is  : "+ link.size());
		 
		 Collections.sort(link);
		 it = link.iterator();
		 while(it.hasNext()) {
				System.out.println(it.next());
				 }
		 
//		System.out.println(abc.substring(6, 12)+abc.substring(12, 6));
		
		/*try{
				throw new RuntimeException();
		}
		finally{
		
		}*/
		
		
	}

	public static Boolean isWeekend(Date inputDateToCheck){
		Calendar cal = Calendar. getInstance();
		cal.setTime(inputDateToCheck);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		return (Calendar.SUNDAY == dayOfWeek || Calendar.SATURDAY == dayOfWeek);

	}
	public static Boolean isHoliday(Date inputDateToCheck){
		Boolean returnFlag = Boolean.FALSE;
		Date yesterday = yesterday();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			if(simpleDateFormat.format(inputDateToCheck).equals(simpleDateFormat.format(yesterday))){
				returnFlag= Boolean.TRUE;
			}else{
				returnFlag=Boolean.FALSE;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return returnFlag;

	}
	private static Date yesterday() {
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
}
