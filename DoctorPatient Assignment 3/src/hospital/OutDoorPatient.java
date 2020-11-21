package hospital;
import javax.swing.JOptionPane;

import P1.Date;
import P1.Time;
public class OutDoorPatient extends Patient
{
String  appointmentDate,appointmentTime;
String fee;
Time T=new Time();
Date D=new Date();
Doctor D1=new Doctor();
void input()
{ 
	super.input();
	D.input();
	appointmentDate=D.toString();
	T.input();
	appointmentTime=T.toString();
	D1.input();
	fee=JOptionPane.showInputDialog("Enter fee of OutDoorPatient : ");
}

String get()
{
	return appointmentDate;
}
public String toString()
{
	return "\n\t****OUTDOOR PATIENT DATA****"+super.toString()+"\nDate Of Appointment: "+appointmentDate+"\nTime of Appointment: "+appointmentTime+
			"\nOUTDOOR patient Fee: "+fee+"\nDoctor Name:"+D1.getName();
}
String getDetail()
{return D1.getName();
}
void getChange(String option)
{
	if(option.equalsIgnoreCase("A")) {
	 T.input();
appointmentTime=T.toString();}
	else if(option.equalsIgnoreCase("B")) {
		D.input();
		appointmentDate=D.toString();}
	else
		JOptionPane.showMessageDialog(null,"----INVALID INPUT----","CHNAGE TIME OR DATE",JOptionPane.WARNING_MESSAGE);
}
	

}
