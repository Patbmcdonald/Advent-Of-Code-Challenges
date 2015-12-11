
package me.patrick.mcdonald.adventofcode.day11.rules;


/**
 * 
 * @author Patrick McDonald
 *
 */
public interface Rule<T> {
	
	/**
	 * Execute processing Rule.
	 * @param <T>
	 * @return processed String
	 */
	T execute(T rule);
	
	/**
	 * Set next Rule in chain after this.
	 * @param Rule
	 */
	void setNext(Rule<T> filter);
	
	/**
	 * Get next Rule in chain after this.
	 * @return
	 */
	Rule<T> getNext();
	
	/**
	 * Get last Rule in the chain.
	 * @return
	 */
	Rule<T> getLast();
}