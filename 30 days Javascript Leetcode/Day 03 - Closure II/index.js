/*
Intuition
• We need to use closure for this problem which will return an object with the required methods.
• Closure will have access to init.
• Object will contain 3 methods : increment, decrement and reset.
• Increment and decrement should update the value and return the new value.
• Reset should reset the counter to its real value and return it.

Approach
• create a function createCounter that accepts an initial integer init and returns an object with three functions: increment, decrement, and reset.
• Increment increases value by 1.
• Decrement decreases the value by 1.
• Reset sets the current value to init

Complexity
Time complexity: O(1)O(1)O(1) - Space complexity:O(1)O(1)O(1)

Code
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
 var createCounter = function(init) {
    let presentCount = init
    return {
        increment:()=> ++presentCount,
        decrement:()=> --presentCount,
        reset:()=> presentCount = init,
    }
};

/*
  const counter = createCounter(5)
    increment:()=> ++presentCount, 6
    decrement:()=> --presentCount, 4
    reset:()=> presentCount = init, 5
 */

/*
Explanation
• var createCounter = function(init) {
Declares a function named createCounter which takes an initial value as its argument.
• let presentCount = init
Declaration of a variable presentCount and initializes it with the init value passed to the createCounter .
• return {
This line starts the definition of an object that will be returned by the createCounter.
• increment:()=> ++presentCount,
Increment method that increments the presentCount variable by 1 and returns the new value .
• decrement:()=> --presentCount,
Decrement method that decrements the presentCount variable by 1 and returns the new value .
• reset:()=> presentCount = init,
reset method that sets the presentCount variable back to its initial value and returns it .
*/