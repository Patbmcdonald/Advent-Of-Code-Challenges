package me.patrick.mcdonald.adventofcode.day11.rules;

/** 
 * Rule Manager
 * 
 * @author Patrick McDonald
 * @param <T>
 *
 */
public class RuleManager<T> {
	
	/** Our chain of rules **/
	private RuleChain<T> _ruleChain;

	public RuleManager() {
		_ruleChain = new RuleChain<T>();
	}

	/**
	 * Add rule to chain
	 * @param rule
	 */
	public void addRule(Rule<T> rule) {
		_ruleChain.addRule(rule);
	}

	/** 
	 * filter request
	 * @param rule
	 * @return
	 */
	public T filterRequest(T request) {
		return _ruleChain.execute(request);
	}
}