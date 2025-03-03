package e1;

public interface BankAccount {
    /**
     * Retrieves the current balance of the account.
     *
     * @return the current balance as an integer.
     */
    int getBalance();

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to be deposited.
     */
    void deposit(int amount);

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to be withdrawn
     */
    void withdraw(int amount);

}
