package me.patrick.mcdonald.adventofcode.day11.rules;

/**
 * Abstract Rule
 * @author Patrick McDonald
 *
 */
public class AbstractRule<T> implements Rule<T> {

	/** Next Rule **/
	private Rule<T> _next;
	
	public AbstractRule() {
		
	}

	public AbstractRule(Rule<T> next) {
		this._next = next;
	}
	

	@Override
	public void setNext(Rule<T> rule) {
		this._next = rule;
	}

	@Override
	public Rule<T> getNext() {
		return _next;
	}

	@Override
	public Rule<T> getLast() {
		Rule<T> last = this;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		return last;
	}


	@Override
	public T execute(T rule) {
		if (getNext() != null) 
			return getNext().execute(rule);
		else
			return rule;
	}

}
