/*
What Is Closure?
A closure is a function that has access to its outer function scope even after the function has returned.

Meaning, A closure can remember and access variables and arguments reference of its outer function even after the function has returned.

Example and Explanation
• JavaScript uses a lexical scope environment.
• When a function needs to access a variable, it first looks in its own local memory.
• If the variable is not found in the local memory, the function then looks for it in the memory of its lexical parent.

See Below code, Over here function y along with its lexical scope
i.e. (function x) would be called a Closure.

function x() {
    var a = 123;
    function y() {
    console.log(a);
    }
    return y;
  }
  var z = x();
  console.log(z); // value of z is entire code of function y.
• When y is returned, not only is the function returned but the entire closurec(fun y + its lexical scope) is returned and put inside z.

• So when z is used somewhere else in program, it still remembers var a inside x().

• Here z is a closure and a is in its lexical scope, and when y is called through z, it can access the value of a even if it no longer in scope.

• This is because Closures in JavaScript allow a function to access variables from its parent function, even after that parent function has completed execution.

• A closure can access and manipulate those variables as needed, even if they are no longer in scope outside of the closure
*/

//Solution
var createHelloWorld = function() {
    return function(...args) {
        return "Hello World";
    }
};

/*
How does this program works?
• The createHelloWorld function is defined using a function expression and does not take any arguments.
• When createHelloWorld is called, it returns an anonymous function.
• This anonymous function uses the rest parameter syntax ...argsto accept any number of arguments (although in this case, it doesn't actually use them).
• When the anonymous function is called, it simply returns the string "Hello World".

Complexity
Time complexity: O(1)O(1)O(1)
Space complexity: O(1)O(1)O(1)
*/