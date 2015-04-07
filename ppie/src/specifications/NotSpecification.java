package specifications;

public class NotSpecification<T> implements ISpecification<T> {
	
	private ISpecification<T> wrapped;
	
	public NotSpecification(ISpecification<T> wrapped) {
		super();
		this.wrapped = wrapped;
	}

	@Override
	public Boolean IsSatisfiedBy(T candidate) {
		// TODO Auto-generated method stub
		return !wrapped.IsSatisfiedBy(candidate);
	}

}
