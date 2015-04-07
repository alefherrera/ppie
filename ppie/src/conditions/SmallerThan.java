package conditions;

public class SmallerThan extends Condition<Integer> {

	public SmallerThan(Integer obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Boolean IsSatisfiedBy(Integer candidate) {
		// TODO Auto-generated method stub
		return candidate < objT;
	}

}
