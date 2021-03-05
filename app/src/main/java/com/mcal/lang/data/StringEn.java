package com.mcal.lang.data;

public class StringEn {
	public static String string(String id) {
		if(id == "hello_world") return "Hello, World!";
		else if(id == "btn_show_alert") return "Show Alert";
		else if(id == "alert_message") return "Message";
		else if(id == "alert_title") return "Title";
		else if(id == "alert_message") return "Message";
		else if(id == "alert_btn_ok") return "Ok";
		
		return "Not found id!";
	}

	public static String string(int id) {
		if(id == 0x1) return "Hello, World!";
		else if(id == 0x2) return "Show Alert";
		else if(id == 0x3) return "Title";
		else if(id == 0x4) return "Message";
		else if(id == 0x5) return "Ok";
		
		return "Not found id!";
	}
}
