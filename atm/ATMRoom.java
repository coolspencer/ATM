package atm;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String args[]) {

        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card,
                TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentATMStatus();

    }

    private void initialize() {

        // create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(1000000, 500, 900, 500);

        // create User
        this.user = createUser();
    }

    private User createUser() {

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard() {

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }

}
