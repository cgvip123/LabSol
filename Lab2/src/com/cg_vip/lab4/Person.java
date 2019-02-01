package com.cg_vip.lab4;

public class Person 
{
		private String FirstName;
		private String LastName;
		private char gender;
		private String phoneNo;
		Person()
		{
			this.setFirstName(null);
			this.setLastName(null);
			this.setGender('-');
			this.setPhoneNo(null);
		}
		
		Person(String a,String b,char g,String d)
		{
			this.setFirstName(a);
			this.setLastName(b);
			this.setGender(g);
			this.setPhoneNo(d);
		}
		
	
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "PersonDetails"+"\n-------------"+"\nFirstName:" + FirstName + "\nLastName:" + LastName + "\ngender:" + gender+"\nPhoneNo:" + phoneNo;
		}

		
			
}


