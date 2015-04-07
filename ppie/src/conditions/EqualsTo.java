package conditions;

public class EqualsTo extends Condition<Integer> {

	public EqualsTo(Integer obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean IsSatisfiedBy(Integer candidate) {
		// TODO Auto-generated method stub
		return objT.equals(candidate);
	}
	
}
