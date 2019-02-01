package com.cg_vip.lab3;

public class Person 
{
		private String FirstName;
		private String LastName;
		private char gender;
		Person()
		{
			this.setFirstName(null);
			this.setLastName(null);
			this.setGender('-');
					
		}
		
		Person(String a,String b,char g)
		{
			this.setFirstName(a);
			this.setLastName(b);
			this.setGender(g);
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
		
		@Override
		public String toString() {
			return "PersonDetails"+"\n-------------"+"\nFirstName:" + FirstName + "\nLastName:" + LastName + "\ngender:" + gender;
		}
		
}
