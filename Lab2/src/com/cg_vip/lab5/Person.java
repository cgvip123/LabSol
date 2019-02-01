package com.cg_vip.lab5;

public class Person 
	{
			private String FirstName;
			private String LastName;
			private Gender gender;
			private String phoneNo;
			Person()
			{
				this.setFirstName(null);
				this.setLastName(null);
				this.setGender(Gender.M);
				this.setPhoneNo(null);
			}
			
			Person(String a,String b,Gender g,String d)
			{
				this.setFirstName(a);
				this.setLastName(b);
				this.setPhoneNo(d);
				this.setGender(g);
			}
			
			public String getFirstName() {
				return FirstName;
			}
			public void setFirstName(String firstName) {
				FirstName = firstName;
			}
			public Gender getGender()
			{
				return gender;
			}
			public void setGender(Gender gender) {
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
				return "PersonDetails"+"\n-------------"+"\nFirstName:" + FirstName + "\nLastName:" + LastName +"\nGender:"+gender+"\nPhoneNo:" + phoneNo;
			}
	}
