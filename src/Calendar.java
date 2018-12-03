
public class Calendar {

	public static final Calendar calendar = new Calendar();
	
	public enum WeekDays {
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday
	}
	
	public enum Months {
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	}
	
	WeekDays weekday = WeekDays.Sunday;
	
	Months month = Months.January;
	
	int day = 1;
	
	int year = 1;
	
	public Calendar () {
		
	}
	
	public void nextDay() {
		switch(weekday) {
		case Friday:
			weekday = WeekDays.Saturday;
			break;
		case Monday:
			weekday = WeekDays.Tuesday;
			break;
		case Saturday:
			weekday = WeekDays.Sunday;
			break;
		case Sunday:
			weekday = WeekDays.Monday;
			break;
		case Thursday:
			weekday = WeekDays.Friday;
			break;
		case Tuesday:
			weekday = WeekDays.Wednesday;
			break;
		case Wednesday:
			weekday = WeekDays.Thursday;
			break;
		default:
			break;
		}
		
		day++;
		
		switch(month){
		case April:
			if (day > 30) {
				month = Months.May;
				day = 1;
			}
			break;
		case August:
			if (day > 31) {
				month = Months.September;
				day = 1;
			}
			break;
		case December:
			if (day > 31) {
				month = Months.January;
				day = 1;
				year++;
			}
			break;
		case February:
			if (leapYear()) {
				if (day > 29) {
					month = Months.March;
					day = 1;
				}
			}
			if (day > 28) {
				month = Months.March;
				day = 1;
			}
			break;
		case January:
			if (day > 31) {
				month = Months.February;
				day = 1;
			}
			break;
		case July:
			if (day > 31) {
				month = Months.August;
				day = 1;
			}
			break;
		case June:
			if (day > 30) {
				month = Months.July;
				day = 1;
			}
			break;
		case March:
			if (day > 31) {
				month = Months.April;
				day = 1;
			}
			break;
		case May:
			if (day > 31) {
				month = Months.June;
				day = 1;
			}
			break;
		case November:
			if (day > 30) {
				month = Months.December;
				day = 1;
			}
			break;
		case October:
			if (day > 31) {
				month = Months.November;
				day = 1;
			}
			break;
		case September:
			if (day > 30) {
				month = Months.October;
				day = 1;
			}
			break;
		default:
			break;
		
		}
	}
	
	private boolean leapYear() {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	public String displayDate() {
		return weekday + ", " + month + " " + day + ", " + year;
	}
	
}
