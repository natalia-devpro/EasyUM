package blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private Card[] cards = new Card[52];

    public Koloda() {
        cards[0] = new Card(2, "Двойка трефа");
        cards[1] = new Card(2, "Двойка бубна");
        cards[2] = new Card(2, "Двойка черви");
        cards[3] = new Card(2, "Двойка пики");

        cards[4] = new Card(3, "Тройка трефа");
        cards[5] = new Card(3, "Тройка бубна");
        cards[6] = new Card(3, "Тройка черви");
        cards[7] = new Card(3, "Тройка пики");

        cards[8] = new Card(4, "четверка трефа");
        cards[9] = new Card(4, "четверка бубна");
        cards[10] = new Card(4, "четверка черви");
        cards[11] = new Card(4, "четверка пики");


        cards[12] = new Card(5, "Пятерка трефа");
        cards[13] = new Card(5, "Пятерка бубна");
        cards[14] = new Card(5, "Пятерка черви");
        cards[15] = new Card(5, "Пятерка пики");

        cards[16] = new Card(6, "Шестерка трефа");
        cards[17] = new Card(6, "Шестерка бубна");
        cards[18] = new Card(6, "Шестерка черви");
        cards[19] = new Card(6, "Шестерка пики");


        cards[20] = new Card(7, "Семерка трефа");
        cards[21] = new Card(7, "Семерка бубна");
        cards[22] = new Card(7, "Семерка черви");
        cards[23] = new Card(7, "Семерка пики");

        cards[24] = new Card(11, "Туз трефа");
        cards[25] = new Card(11, "Туз бубна");
        cards[26] = new Card(11, "Туз черви");
        cards[27] = new Card(11, "Туз пики");


        cards[28] = new Card(8, "Восьмерка трефа");
        cards[29] = new Card(8, "Восьмерка бубна");
        cards[30] = new Card(8, "Восьмерка черви");
        cards[31] = new Card(8, "Восьмерка пики");


        cards[32] = new Card(9, "Девять трефа");
        cards[33] = new Card(9, "Девять бубна");
        cards[34] = new Card(9, "Девять черви");
        cards[35] = new Card(9, "Девять пики");


        cards[36] = new Card(10, "Десять трефа");
        cards[37] = new Card(10, "Десять бубна");
        cards[38] = new Card(10, "Десять черви");
        cards[39] = new Card(10, "Десять пики");


        cards[40] = new Card(2, "Валет трефа");
        cards[41] = new Card(2, "Валет бубна");
        cards[42] = new Card(2, "Валет черви");
        cards[43] = new Card(2, "Валет пики");

        cards[44] = new Card(3, "Дама трефа");
        cards[45] = new Card(3, "Дама бубна");
        cards[46] = new Card(3, "Дама черви");
        cards[47] = new Card(3, "Дама пики");

        cards[48] = new Card(4, "Король трефа");
        cards[49] = new Card(4, "Король бубна");
        cards[50] = new Card(4, "Король черви");
        cards[51] = new Card(4, "Король пики");
    }

    public Card randomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[randomNum];
    }








}
