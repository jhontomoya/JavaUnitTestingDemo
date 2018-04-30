package chainofresp;

public class GansitoImpl extends ICandyMachine {
	
	private ICandyMachine chain;
	private double price = 22;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain = nextChain;	
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		
		int gansitos = addProducts(productsMachine, price);
		
		productsMachine.setGansitos(gansitos);
		
		if (this.chain != null) {
			this.chain.dispense( productsMachine);
		}
	}

}
