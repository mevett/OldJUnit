package oldJUnit;

public class ClassToBeTested {
	protected int value1, value2;

	// assigning the values.  Creating the "fixture"
	protected  ClassToBeTested(int val1, int val2){
		value1 = val1;
		value2 = val2;
	}

	// test method to add two values
	public int add(){
		int result = value1 + value2;
		return result;
	}

}
