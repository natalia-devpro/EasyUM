package blackJack;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Delier delier = new Delier();
        Player player = new Player();

        game.addPlayerToGame(delier);
        game.addPlayerToGame(player);

        game.dealTwoCards();
        game.addCardsIfNeed();
        game.printWinner();

    }
}
