package specifications;

public interface ISpecification<T> {
	Boolean IsSatisfiedBy(T candidate);
}
