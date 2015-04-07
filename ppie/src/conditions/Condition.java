package conditions;

import specifications.AndSpecification;
import specifications.ISpecification;
import specifications.NotSpecification;
import specifications.OrSpecification;

public abstract class Condition<T> implements ISpecification<T> {

	protected T objT;

	public Condition(T obj) {
		objT = obj;
	}
	
	public ISpecification<T> And(ISpecification<T> spec) {
		return new AndSpecification<T>(this, spec);
	}
	
	public ISpecification<T> Or(ISpecification<T> spec) {
		return new OrSpecification<T>(this, spec);
	}
	
	public ISpecification<T> Not() {
		return new NotSpecification<T>(this);
	}
}
