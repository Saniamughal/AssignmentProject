package P1;
import javax.swing.JOptionPane;
public class Date {
private String month, year,day;

public Date()
{
	day="1";
	month="1";
    year="2000";
}
public void input()
{
	day=JOptionPane.showInputDialog("Enter Day: ");
	month=JOptionPane.showInputDialog("\nEnter Month: ");
	year=JOptionPane.showInputDialog("\nEnter Year: ");
}
void setMonth(String month)
{
	 this.month=month;
}
void setDay(String day)
{
	 this.day=day;
}
void setYear(String year)
{
	 this.year=year;
}
public String toString()
{
	return day+"/"+month+"/"+year;
}
}
