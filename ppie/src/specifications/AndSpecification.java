package specifications;

public class AndSpecification<T> implements ISpecification<T> {

	public AndSpecification(ISpecification<T> spec1, ISpecification<T> spec2) {
		super();
		this.spec1 = spec1;
		this.spec2 = spec2;
	}

	private ISpecification<T> spec1, spec2;
	
	@Override
	public Boolean IsSatisfiedBy(T candidate) {
		return spec1.IsSatisfiedBy(candidate) && spec2.IsSatisfiedBy(candidate);
	}

}
