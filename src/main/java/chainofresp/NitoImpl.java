package chainofresp;

public class NitoImpl extends ICandyMachine {
	
	private ICandyMachine chain;
	private double price = 11;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain = nextChain;
		
	}
	
	@Override
	public void dispense(ProductsMachine productsMachine) {
		
		int nitos = addProducts(productsMachine, price);
		
		productsMachine.setNitos(nitos);
		
		if (this.chain != null) {
			this.chain.dispense( productsMachine);
		}
	}	

}
