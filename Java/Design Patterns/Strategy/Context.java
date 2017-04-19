public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int[] executeStrategy(int[] someArray){
		return strategy.sort(someArray);
	}
}