package com.ssmlearn.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * @author fatcat
 * @date 2018年7月27日上午11:21:22
 */
public class DateFormatter implements Formatter<Date> {
	private String datePattern;
	private SimpleDateFormat dateFormat;

	public DateFormatter(String datePattern) {
		this.datePattern = datePattern;
		this.dateFormat = new SimpleDateFormat(datePattern);
	}

	@Override
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	}

	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		try {
			return dateFormat.parse(source);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}

}
