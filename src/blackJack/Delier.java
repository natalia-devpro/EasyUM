package blackJack;

public class Delier extends Player {

    @Override
    public void addCards(Koloda koloda) {
        if (this.sumPointsFromHand() < 17) {
            this.addCardToHand(koloda.randomCard());
            this.addCards(koloda);
        }
    }

    @Override
    public boolean isDialer() {
        return true;
    }
}
