package com.mcal.lang.data;

public class StringRu {
	public static String string(String id) {
		if(id == "hello_world") return "Привет, мир!";
		else if(id == "btn_show_alert") return "Открыть диалог";
		else if(id == "alert_title") return "Заголовок";
		else if(id == "alert_message") return "Сообщение";
		else if(id == "alert_btn_ok") return "Ок";
		
		else return "Не найден идентификатор!";
	}

	public static String string(int id) {
		if(id == 0x1) return "Привет, мир!";
		else if(id == 0x2) return "Открыть диалог";
		else if(id == 0x3) return "Заголовок";
		else if(id == 0x4) return "Сообщение";
		else if(id == 0x5) return "Ок";
		
		else return "Не найден идентификатор!";
	}
}
