package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date toDate(String date) {
		Date result = null;
		// to do
		SimpleDateFormat dateparse = new SimpleDateFormat("yyyy-MM-dd");

		try {
			result = dateparse.parse(date);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return new java.sql.Date(result.getTime());
	}

}
