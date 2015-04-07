package conditions;

public class BiggerThan extends Condition<Integer> {

	public BiggerThan(Integer obj) {
		super(obj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean IsSatisfiedBy(Integer candidate) {
		// TODO Auto-generated method stub
		return candidate > objT;
	}

}
