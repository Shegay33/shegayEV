package ru.job4j.stoopidbot;

/**
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Bot {


	String a = "Привет, Бот.";
	String b = "Привет, умник.";
	String c = "Пока.";
	String d = "До скорой встречи.";
	String e = "Сколько будет 2 + 2?";
	String g = "Это ставит меня в тупик. Спросите другой вопрос.";

	/**
	 * Отвечает на вопросы.
	 *
	 * @param question Вопрос от клиента.
	 * @return Ответ.
	 */
	public String answer(String question) {

		if (question == a) {

			return b;

		}
		return b;

	}

	public String answ(String question2) {

		if (question2 == c) {

			return d;

		}
		return d;

	}


	public String an(String question3) {

		if (question3 == e) {

			return g;

		}
        return g;
	}



}
