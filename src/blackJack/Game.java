package blackJack;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<>();
    private Koloda koloda = new Koloda();


    public void addPlayerToGame(Player player) {
        players.add(player);
    }


    public void dealTwoCards() {
        for (Player currentPlayer : players) {
            currentPlayer.addCardToHand(koloda.randomCard());
            currentPlayer.addCardToHand(koloda.randomCard());
        }

    }

    public void addCardsIfNeed() {
        for (Player currentPlayer : players) {
            currentPlayer.addCards(koloda);  // полиморфизм
        }
    }

    public void printWinner() {
        // 27  -13-   17   21   19 // 4
        // 25   -25-   25   25   25 // обработали
        // 22   -25-   21   25   23 // 1  обработали
        // 22     21   21    // 2
        // 19   -20-   17   17   19 // 5
        for (Player currentPlayer : players) {
            if (currentPlayer.sumPointsFromHand() > 21) {
                currentPlayer.setWinner(false);
            }
        }

        if (this.countWinners() == 0) {
            System.out.println("Победил крупье");
            for (Player currentPlayer : players) {
                if (currentPlayer.isDialer()) {
                    currentPlayer.printHand();
                    return;
                }
            }
        }

        if (this.countWinners() == 1) {
            System.out.println("------ Победитель ----- ");
            for (Player currentPlayer : players) {
                if (currentPlayer.isWinner()) {
                    currentPlayer.printHand();
                    return;
                }
            }
        }

        Player winner = null;
        for (Player currentPlayer : players) {
            if (winner == null && currentPlayer.isWinner()) {
                winner = currentPlayer;
            }
            if (currentPlayer.sumPointsFromHand() > winner.sumPointsFromHand() && currentPlayer.isWinner() ) {
                winner = currentPlayer;
            }
        }

        System.out.println("Победитель");
        winner.printHand();
    }

    public int countWinners() {
        int count = 0;
        for (Player currentPlayer : players) {
            if (currentPlayer.isWinner()) {
                count++;
            }
        }
        return count;
    }

}
