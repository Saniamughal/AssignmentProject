package P1;

import javax.swing.JOptionPane;

public class Time {
private String hours,min,amPm;

public Time()
{
	hours="1";
	min="60";
    amPm="am";
}
public void input()
{
	hours=JOptionPane.showInputDialog("\nEnter hours: ");
	min=JOptionPane.showInputDialog("\nEnter Minutes: ");
	amPm=JOptionPane.showInputDialog("\nEnter Am/Pm: ");
}
void sethours(String hours)
{
	 this.hours=hours;
}
void setmin(String min)
{
	 this.min=min;
}
void setamPm(String amPm)
{
	 this.amPm=amPm;
}
public String toString()
{
	return hours+":"+min+":"+amPm;
}
}

