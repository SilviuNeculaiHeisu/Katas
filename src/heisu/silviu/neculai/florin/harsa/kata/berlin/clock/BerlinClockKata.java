package heisu.silviu.neculai.florin.harsa.kata.berlin.clock;

import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

public class BerlinClockKata {
	private int hour;
	private int minute;
	private int seconds;

	public static String SingleMinutesRow(String time) {

		return "";
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > 23)
			throw new InvalidParameterException();
		else
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute > 23)
			throw new InvalidParameterException();
		else
			this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > 23)
			throw new InvalidParameterException();
		else
			this.seconds = seconds;
	}

	public BerlinClockKata(int hour, int minute, int seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	public String getMinutesRow() {
		String result = "";
		int lightBulbOn = this.minute % 5;
		int lightBulbOff = 4 - this.minute % 5;
		if (lightBulbOn != 0)
			for (int i = 0; i < lightBulbOn; i++) {

				result += "Y";
			}
		if (lightBulbOff != 0)
			for (int i = 0; i < lightBulbOff; i++) {
				result += "O";
			}
		return result;
	}

	public String getFiveMinutesRow() {
		String result = "";

		for (int i = 1; i <= 11; i += 1) {
			if (this.minute - 5 >= 0) {
				if (i % 3 == 0) {
					result += "R";
				} else
					result += "Y";
				this.minute -= 5;
			} else
				result += "O";

		}
		return result;

	}

	public String getSingleHoursRow() {
		String result = "";
		int singleHours = this.hour % 5;
		for (int i = 1; i <= 4; i += 1) {
			if (singleHours > 0) {

				result += "R";
				singleHours--;

			} else
				result += "O";

		}
		return result;

	}

	public String getFiveHoursRow() {
		String result = "";

		for (int i = 1; i <= 4; i += 1) {
			if (this.hour - 5 > 0) {
				
					result += "R";
				
				this.hour -= 5;
			} else
				result += "O";

		}
		return result;

	}
	public String getSecondsLamp() {
		if(this.seconds%2==0) {
			return "Y";
		}
		return "O";
		
	}
	public String getBerlinClock() {
		String result=this.getSecondsLamp()+this.getFiveHoursRow()+this.getSingleHoursRow()+this.getFiveMinutesRow()+this.getMinutesRow();
		return result;
	}
	
	public String convertBackToDigitalTime(String berlinTime) {
		this.minute=0;
		this.hour=0;
		this.seconds=0;
		if(berlinTime.charAt(0)=='Y')
			this.seconds=00;
		else
			this.seconds=59;
		for(int i=1;i<berlinTime.length();i++) {
			if(i<=4 && berlinTime.charAt(i)=='R') {
				this.hour+=5;
				
			}
			if(i>4 && i<=8 && berlinTime.charAt(i)=='R') {
				this.hour++;
			}
			if(i>8 && i<=19 && (berlinTime.charAt(i)=='R' || berlinTime.charAt(i)=='Y') ) {
				this.minute+=5;
			}
			if(i>19 && i<berlinTime.length() && ( berlinTime.charAt(i)=='Y') ) {
				this.minute+=1;
			}
			
			
			
			
		}
		return this.hour+":"+this.minute+":"+this.seconds;
		
		
	}

	}


