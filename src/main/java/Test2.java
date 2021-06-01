import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        String[] array;
        array = new String[20];
        array[0] = "Бесспорно";
        array[1] = "Предрешено";
        array[2] = "Никаких сомнений";
        array[3] = "Определённо да";
        array[4] = "Можешь быть уверен в этом";
        array[5] = "Мне кажется — «да»";
        array[6] = "Вероятнее всего";
        array[7] = "Хорошие перспективы";
        array[8] = "Знаки говорят — «да»";
        array[9] = "Да";
        array[10] = "Пока не ясно, попробуй снова";
        array[11] = "Спроси позже";
        array[12] = "Лучше не рассказывать";
        array[13] = "Сейчас нельзя предсказать";
        array[14] = "Сконцентрируйся и спроси опять";
        array[15] = "Даже не думай";
        array[16] = "Мой ответ — «нет»";
        array[17] = "По моим данным — «нет»";
        array[18] = "Перспективы не очень хорошие";
        array[19] = "Весьма сомнительно";

        int Randomize = randomGenerator.nextInt(20);
        System.out.println(array[Randomize]);
    }

}