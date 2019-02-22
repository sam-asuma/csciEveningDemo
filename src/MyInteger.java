

public class MyInteger {

	private int value;
	

	public MyInteger() {

		this.value = 1082;

	}

	public MyInteger(int value) {
		
		
		int lower_limit = Integer.MIN_VALUE;
		int upper_limit = Integer.MAX_VALUE;

		if (lower_limit <= value && value <= upper_limit) {
			this.value = value;
		} else {
			System.out.println("Error your number is too large!");
			System.exit(0);
			
		}

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isEven() {
		value = value % 2;
		
		if (value == 0) {
			return true;
		}
	
		return false;
		
	}

	public boolean isOdd() {
		value = value % 2;
		
		if (value == 0) {
			return false;
		}
	
	
		return true;

	}

	public int add(MyInteger arg0, MyInteger arg1) {
		
		int sum = arg0.value + arg1.value;
		return sum;

	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}

}
