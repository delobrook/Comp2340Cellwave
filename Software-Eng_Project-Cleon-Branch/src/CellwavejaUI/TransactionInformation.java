package CellwavejaUI;

import java.util.ArrayList;

import Core.Customer;
import Core.Transaction;

public class TransactionInformation extends Subject {
	public static ArrayList<Transaction> newTransactions = new ArrayList<Transaction>();
	public static void addtransaction(Transaction t) {
		newTransactions.add(t);
	}
	public static void clearTransactionInformation() {
		newTransactions.clear();
	}
	public static void deletecustomer(int selrow) {
		newTransactions.remove(selrow);
	}
}
