package com.mcal.lang.utils;

import com.mcal.lang.data.StringRu;
import com.mcal.lang.data.StringEn;

public class Lang {
	public static String lang(String name, int id) {
		if(name == "ru") return StringRu.string(id);
		else if(name == "en") return StringEn.string(id);
		
		return "Ошибка: Код языка не найден!";
	}

	public static String lang(String name, String id) {
		if(name == "ru") return StringRu.string(id);
		else if(name == "en") return StringEn.string(id);
		
		return "Ошибка: Код языка не найден";
	}
}
