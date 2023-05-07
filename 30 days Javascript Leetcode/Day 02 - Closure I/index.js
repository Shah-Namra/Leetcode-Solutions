/*
Intuition
createCounter(n) makes a function that acts like a counter. The first time you call it, it returns n. Every time after that, it returns the previous value plus one.

Approach
We will use a closure that remembers n and returns a function that increments it each time it's called.

Complexity
Time complexity:O(1) O(1)O(1) - Space complexity::O(1) O(1)O(1)
Code
/**
 * @param {number} n
 * @return {Function} counter
 */

var createCounter = function(n) {
    return ()=> n++
};
/**     
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */

//Explaination

// var createCounter = function(n) {
// This line declares a variable createCounter and assigns it to an anonymous function that takes an integer n as an argument.

// return ()=> n++
//};

//This line creates a function that increases the value of n each time it's called, and then returns the new value.

