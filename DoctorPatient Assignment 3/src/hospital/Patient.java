package hospital;

import javax.swing.JOptionPane;

public  class Patient {

	 String name,cnic,address,phoneNo,gender,age;
	 Patient()
	 {
	 	name="sania";
	 	cnic="1187738-39";
	 	address="street 9 falt 10 islmabad";
	     phoneNo="0312789898";
	     gender="female";
	    age="18";
	    
	 }
	 Patient(String name,String cnic,String address,String phoneNo,String gender,String age)
	 {
		 this.name=name;
		 this.cnic=cnic;
		 this.address=address;
		 this.phoneNo=phoneNo;
		 this.gender=gender;
		 this.age=age;
	 }
	 
	 void input()
	 {
	 	name=JOptionPane.showInputDialog("Enter Patient Name: ");
	 	cnic=JOptionPane.showInputDialog("\nEnter Patient Cnic: ");
	 	address=JOptionPane.showInputDialog("\nEnter Patient Address: ");
	 	phoneNo=JOptionPane.showInputDialog("\nEnter Patient ContactNo: ");
		gender=JOptionPane.showInputDialog("\nEnter Patient  Gender: ");
		age=JOptionPane.showInputDialog("\nEnter Patient Age: ");
		
	 	
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
	 void setAge(String age)
	 {
	 	 this.age=age;
	 }
	 void setAddress(String address)
	 {
	 	 this.address=address;
	 }
	 
	 public String toString()
	 {
	 	return "\nPatient Name is: "+name+"\nPatient Cnic is:"+cnic+"\nPatient PhoneNo is: "+phoneNo+"\nPatient Gender is: "
	 +gender+"\nPatient Age is: "+age+"\nPatient Address is:"+address;
	 }
	String get() {
		return null;
	}
	String getDetail()
	{
		return null;
	}
	void getChange(String option)
	{
		
	}
}




