
public class Pantheon {

	public static final Pantheon pantheon = new Pantheon();
	
	ElderBeing[] weekdays = new ElderBeing[7];
	
	ElderBeing[] monthStart = new ElderBeing[12];
	
	//summer = 0; winter = 1;
	ElderBeing[] solstices = new ElderBeing[2];
	
	//spring = 0; fall = 1;
	ElderBeing[] equinoxes = new ElderBeing[2];
	
	int multiplier = 1;
	
	int devotion = 0;
	
	public Pantheon () {
		InitializeBeingList (weekdays);
		InitializeBeingList (monthStart);
		InitializeBeingList (solstices);
	}
	
	private void InitializeBeingList (ElderBeing[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = new ElderBeing(ElderBeing.names.remove(Randomization.RandomInt(0, ElderBeing.names.size())));
		}
	}
	
	public ElderBeing getTodaysBeing(){
		switch (Calendar.calendar.month) {
		case March:
			if (Calendar.calendar.day == 20) {
				multiplier = 5;
				return equinoxes[0];
			}
			break;
		case June:
			if (Calendar.calendar.day == 21) {
				multiplier = 5;
				return solstices[0];
			}
			break;
		case September:
			if (Calendar.calendar.day == 22) {
				multiplier = 5;
				return equinoxes[1];
			}
			break;
		case December:
			if (Calendar.calendar.day == 21) {
				multiplier = 5;
				return solstices[1];
			}
			break;
		default:
			break;
		}
		
		if (Calendar.calendar.day == 1) {
			multiplier = 2;
			switch (Calendar.calendar.month) {
			case April:
				return monthStart[3];
			case August:
				return monthStart[7];
			case December:
				return monthStart[11];
			case February:
				return monthStart[1];
			case January:
				return monthStart[0];
			case July:
				return monthStart[6];
			case June:
				return monthStart[5];
			case March:
				return monthStart[2];
			case May:
				return monthStart[4];
			case November:
				return monthStart[10];
			case October:
				return monthStart[9];
			case September:
				return monthStart[8];
			default:
				break;
			
			}
		}
		
		multiplier = 1;
		switch (Calendar.calendar.weekday) {
		case Friday:
			return weekdays[5];
		case Monday:
			return weekdays[1];
		case Saturday:
			return weekdays[6];
		case Sunday:
			return weekdays[0];
		case Thursday:
			return weekdays[4];
		case Tuesday:
			return weekdays[2];
		case Wednesday:
			return weekdays[3];
		default:
			break;
		
		}
		
		return null;
		
	}
	
}
