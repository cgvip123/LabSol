package com.cg_vip.lab6;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.swing.text.DateFormatter;

public class Zone 
{
	public static void main(String args[])
	{
		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));

	}
}