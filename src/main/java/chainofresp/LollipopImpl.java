package chainofresp;

public class LollipopImpl extends ICandyMachine {

	private ICandyMachine chain;
	private double price = 1;
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain = nextChain;
		
	}

	@Override
	public void dispense( ProductsMachine productsMachine) {
		
		int lollipop = addProducts(productsMachine, price);
		
		productsMachine.setPaletas(lollipop);
		
		if (this.chain != null) {
			this.chain.dispense( productsMachine);
		}
		
	}
		

}
