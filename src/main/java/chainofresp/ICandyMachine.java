package chainofresp;

public abstract class ICandyMachine {

	abstract void  setNextChain(ICandyMachine nextChain) ;
	abstract void  dispense( ProductsMachine productsMachine);
	
	int addProducts (ProductsMachine productsMachine, double price) {
		int golosina = 0;
		double money = productsMachine.getMoney();
		while(money >= price) {
			money -= price;
			golosina++;
		}
		productsMachine.setMoney(money);
		return golosina;
	};
	
}
