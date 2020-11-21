package hospital;

import javax.swing.JOptionPane;

public class Doctor
{
 String name,cnic,phoneNo,gender,department,specialization;
 Doctor()
 {
 	name="ayan";
 	cnic="123456-099898";
     phoneNo="2000";
     gender="female";
     department="pharmacy";
    specialization="Dentist";
 }
 Doctor(String name,String cnic,String phoneNo,String gender,String department,String specialization){
	 this.name=name;
	 this.cnic=cnic;
	 this.phoneNo=phoneNo;
	 this.gender=gender;
	 this.department=department;
	 this.specialization=specialization;
 }
 void input()
 {
 	name=JOptionPane.showInputDialog("Enter Doctor Name: ");
 	//cnic=JOptionPane.showInputDialog("\nEnter Doctor Cnic: ");
 	//phoneNo=JOptionPane.showInputDialog("\nEnter Doctor ContactNo: ");
	//gender=JOptionPane.showInputDialog("\nEnter Doctor Gender: ");
	//department=JOptionPane.showInputDialog("\nEnter Doctor Department: ");
	//specialization=JOptionPane.showInputDialog("\nEnter Doctor  Specialization: ");
 	
 }
 void setname(String name)
 {
 	 this.name=name;
 }
 String getName() 
 {
	 return name;
 }
 void setCnic(String cnic)
 {
	 this.cnic=cnic;
 }
 void setPhoneNo(String phoneNo)
 {
 	 this.phoneNo=phoneNo;
 }
 void setGender(String gender)
 {
 	 this.gender=gender;
 }
 void setDepartment(String department)
 {
 	 this.department=department;
 }
 String getDepartment() 
 {return department;}
 void setSpecialization(String specialization)
 {
 	 this.specialization=specialization;
 }
 
 
 public String toString()
 {
 	return "Doctor Name is: "+name+"\nDoctor Cnic is:"+cnic+"\nDoctor PhoneNo is: "+phoneNo+"\nDoctor Gender is: "
 +gender+"\nDoctor DepartmentIs: "+department+"\nDoctor Specialization is:"+specialization;
 }
 }


