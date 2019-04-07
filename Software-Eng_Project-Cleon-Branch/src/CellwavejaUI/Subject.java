package CellwavejaUI;

public class Subject {
	public static Observer obs;
	public static void notifyObserversofSuccessfuladdition(int n) {
			obs.update(n);
	}
	public static void notifyObserverOfErrorsInAddingProduct(int n) {
		
	}
	public static void attachObserver(Observer o) {
		obs= o;
	}

}
