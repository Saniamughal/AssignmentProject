package hospital;

import javax.swing.JOptionPane;

public class Demo {
	public static void main(String args[])
	{
		String choice;
		int i=0,j,ch;
	
Patient P[]=new Patient[10];
Doctor D[]=new Doctor[10];
D[0]=new Doctor("shumaila","878-284380-824","0312-4758834","female","ICU","Orthopedic surgeons");
D[1]=new Doctor("faraz","314526-278892-2","0131478786","male","Opd","Cardiologists.");
D[2]=new Doctor("saima","42839-278892-2","035678980900","Female","Emergency","Dentist");
do
{
	JOptionPane.showMessageDialog(null," \t\t*******MENU*******\n\t1:Add an indoor patient"
			+ "\n2:Add an outdoor patient"
			+ "\n3:see the list of all doctor Data"
			+ "\n4:Search a Doctor by name or department"
			+ "\n5:See the list of all indoor patient Data"
			+ "\n6:List of Appointment Day"
			+ "\n7:List of appointment Doctor"
			+ "\n8:change the appointment time or Date:"
			+"\n9: to exit Program","HospitalRecord",JOptionPane.WARNING_MESSAGE);
			
			
    
choice=JOptionPane.showInputDialog("Tell your Choice:");
ch=Integer.parseInt(choice);

switch(ch)
{

case 1:
{
	
		i++;
	P[i]=new indoorPatient();
   P[i].input();
	break;
}
case 2:
{
	i++; 
	P[i]=new OutDoorPatient();
	P[i].input();
	break;
 }
case 3:
{
	for(j=0;j<=2;j++)
	{
	JOptionPane.showMessageDialog(null,D[j].toString(),"DoctorData",JOptionPane.WARNING_MESSAGE);
	}
	break;
}


case 4:
{
	String option,name;
	option=JOptionPane.showInputDialog(null,"A:SERACH BY NAME\nB:SERACH BY DEPARTMENT","DoctorINFO",JOptionPane.WARNING_MESSAGE);
	switch(option)
	{
	case "A":
	
	{
		name=JOptionPane.showInputDialog("Enter Doctor name");
	
	for(j=0;j<=2;j++) 
	{
		if(D[j].getName().equalsIgnoreCase(name)) 
		{
			
			JOptionPane.showMessageDialog(null,D[j].toString(),"DoctorData",JOptionPane.WARNING_MESSAGE);
			
			
		}
		
	}break;
	}
	case "B":
	{
	 
	
	name=JOptionPane.showInputDialog("Enter Department name:");
	for(j=0;j<=2;j++) 
	{
		if(D[j].getDepartment().equalsIgnoreCase(name)) 
		{
			JOptionPane.showMessageDialog(null,D[j].toString(),"DoctorData",JOptionPane.WARNING_MESSAGE);
			
		}
	}
	break;
	}
	}
	break;
	}
case 5:
{
	//indoorPatient indoorobj=new indoorPatient();
	for(j=1;j<=i;j++) {
	if(P[j] instanceof indoorPatient) 
	{
		
		
		JOptionPane.showMessageDialog(null,P[j].toString(),"INDOORttPatientData",JOptionPane.WARNING_MESSAGE);
		
	}
	}
	break;
}


case 6:
	{
		for(j=1;j<=i;j++) 
		{
			 
				if(P[j] instanceof OutDoorPatient) 
				{
					
					String s[]=(P[j].get()).split("/");
					JOptionPane.showMessageDialog(null,"List of Appointment Day:"+s[0],"OUTDOORPatientData",JOptionPane.WARNING_MESSAGE);
					
				
				}
		}
		break;
	}
case 7:
{
	for(j=1;j<=i;j++) 
	{
		 
			if(P[j] instanceof OutDoorPatient) 
			{
				JOptionPane.showMessageDialog(null,"List of Appointment Doctor\n:"+P[j].getDetail(),"INDOORttPatientData",JOptionPane.WARNING_MESSAGE);
			}
    }
	break;
}
case 8:
{
	
	String option=JOptionPane.showInputDialog("A:Time of Appointment \nBchange the Date:\nEnter choice:");
	
	String name=JOptionPane.showInputDialog("To change the Date OR time of Appointment:\nEnter Patient name:");
	for(j=1;j<=i;j++) 
	{
		
		if(P[j] instanceof OutDoorPatient)
		{
		
	      if(P[j].getName().equalsIgnoreCase(name))
	       {
	    	 
	    	  P[j].getChange(option);
		      JOptionPane.showMessageDialog(null,"\n\t--------Appointment Record has changed--------","Change Patient Appointmnt Record",JOptionPane.WARNING_MESSAGE);
	        break;
	       }
	     
		}
	}
		
	break;
}
}
}
while(ch!=9);
JOptionPane.showMessageDialog(null,"____________PROGRAM ENDED____________");
}

	
	
}

	
	