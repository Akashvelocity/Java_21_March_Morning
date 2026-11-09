package Inheritance;

public class WhatsApp 
{
	public static void main(String[] args)
	{
	WhatAppV3 V3=new WhatAppV3();
	V3.AudioCalling();
	V3.Textmsg();
	V3.VideoCalling();
	
	System.out.println("------------------------------------");
	
	WhatAppV2 V2=new WhatAppV2();
	V2.AudioCalling();
	V2.Textmsg();

	}
}
