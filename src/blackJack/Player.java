package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean winner = true;

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isDialer(){
        return false;
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }

    public void addCards(Koloda koloda){
        this.printHand();
        System.out.println("Нужна ли еще одна карта? (Да/Нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("да")){
            hand.add(koloda.randomCard());
            this.addCards(koloda);
        }
    }

    public void printHand(){
        System.out.println("---- карты в руке ----");
        for(Card currentCard:hand){
            System.out.println(currentCard);
        }
        System.out.println("---- конец ----");
    }

    public int sumPointsFromHand(){
        int count = 0;
        for(Card currentCard:hand){
            count += currentCard.getValue();
        }
        return count;
    }

}
