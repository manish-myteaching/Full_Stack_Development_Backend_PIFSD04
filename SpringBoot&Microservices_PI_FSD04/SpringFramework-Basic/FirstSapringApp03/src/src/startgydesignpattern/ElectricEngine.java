package startgydesignpattern;

public class ElectricEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Electric Engine Started..!");
		return 1;
	}

}
