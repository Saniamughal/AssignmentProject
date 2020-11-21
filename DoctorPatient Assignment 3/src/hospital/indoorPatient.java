package hospital;

import javax.swing.JOptionPane;

import P1.Date;

public class indoorPatient extends Patient {
   String wardNo, roomNo, bedNo,fee;
Doctor D1=new Doctor();
Date D=new Date();
indoorPatient()
{
	wardNo="003";
	roomNo="09";
	bedNo="6";
	fee="100";
 }
indoorPatient(String name,String cnic,String address,String phoneNo,String gender,String age,String wardNo,String roomNo,String bedNo,String fee)
{
	super(name,cnic,address,phoneNo,gender,age);
	this.wardNo=wardNo;
	this.roomNo=roomNo;
	this.bedNo=bedNo;
	this.fee=fee;
	}
void input()
{
	super.input();
	wardNo=JOptionPane.showInputDialog("Enter WardNo: ");
 	roomNo=JOptionPane.showInputDialog("\nEnter RoomNO: ");
 	bedNo=JOptionPane.showInputDialog("\nEnter BedNo: ");
 	fee=JOptionPane.showInputDialog("\nEnter fee Of indoor Patint : ");
 	D.input();
 	D1.input();
 	
 	
	}

public String toString()
{
	return "\n\t****INDOOR PATIENT DATA****\n"+super.toString()+"\nWardNO: "+wardNo+"\nRoomNo: "+roomNo+"\nbedNo: "+bedNo+
			"\nINDOOR patient Fee: "+fee+"\n Date: "+D.toString()+"\nDoctor Name:"+D1.getName();
}
 

}

