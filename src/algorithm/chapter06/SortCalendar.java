package algorithm.chapter06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SortCalendar {
	public static void main(String[] args) throws IOException {
		GregorianCalendar[] x = {
			new GregorianCalendar(2017, Calendar.NOVEMBER, 1),
			new GregorianCalendar(1963, Calendar.OCTOBER, 18),
			new GregorianCalendar(1985, Calendar.APRIL, 5),
		};

		Arrays.sort(x);

		for (GregorianCalendar gregorianCalendar : x) {
			System.out.printf("%04d년 %02d월 %02d일\n",
				gregorianCalendar.get(Calendar.YEAR),
				gregorianCalendar.get(Calendar.MONTH) + 1,
				gregorianCalendar.get(Calendar.DATE));
		}

	}
}
