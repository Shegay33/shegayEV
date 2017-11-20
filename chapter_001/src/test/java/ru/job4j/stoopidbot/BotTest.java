package ru.job4j.stoopidbot;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BotTest {
    @Test
    public void whenGreetBot() {
        Bot bot = new Bot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }

    @Test
    public void whenByuBot() {
        Bot bot = new Bot();
        assertThat(bot.answ("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenUnknownBot() {
        Bot bot = new Bot();
        assertThat(
                bot.an("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}
