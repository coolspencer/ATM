package atm;

import atm.BankAccount;

public class User {

    Card card;
    BankAccount bankAccount;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
