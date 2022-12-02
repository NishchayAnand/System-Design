import java.util.Map;

public class LiskovSubstitutionPrinciple {
	
	public class BrewingUnit {
		
	}
	
	private static void printInfo() {
		
	}
	
	public static void printInfo2() {
		
	}
	
	public class BasicCoffeeMachine {
		
		private Map configMap; // -> 
		private Map groundCoffee; // -> 
		private BrewingUnit brewingUnit; // -> 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
