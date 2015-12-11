package me.patrick.mcdonald.adventofcode.day11.rules;

/**
 * Rule Chain carries multiple rules and help to execute them in defined order
 * 
 * @author Patrick McDonald 
 * @param <T>
 */
public class RuleChain<T> {
	
	/** Acts as a Linked List **/
	private Rule<T> chain;
	
	/**
	 * Add a rule, if do not have a head, set the rule as a head else add it to the tail
	 * @param rule
	 */
	public void addRule(Rule<T> rule) {
		if (chain == null) {
			chain = rule;
		} else {
			chain.getLast().setNext(rule);
		}
	}

	/** 
	 *  Execute this rule chain
	 *  
	 * @param string
	 * @return
	 */
	public T execute(T rule) {
		if (chain != null) 
			return chain.execute(rule);

		return null;
	}
}