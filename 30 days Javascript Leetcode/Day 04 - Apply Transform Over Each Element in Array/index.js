/*Complexity
Time complexity:O(n) - Space complexity:O(n)

Code
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
  const transformedArr = [];
for (let i = 0; i < arr.length; i++) {
transformedArr[i] = fn(arr[i], i);
}
return transformedArr;
};

/*
Explanation

var map = function(arr, fn) {
• A function map which takes two parameters:
input array arr and a mapping function fn. var is used to declare a variable map that will hold the function definition.

const transformedArr = [];
• Initializes an empty array transformedArr which will store the transformed values of the input array.

for (let i = 0; i < arr.length; i++) {
transformedArr[i] = fn(arr[i], i);
}
• for loop which uses let to decalre a loop variable i that intializes to 0 and the condition i < arr.length ensures that loop will continue till the value of i is equal to length of input array
• ith element of arr passes to the function fn having index i
• function fn returns a transformed value and this value is assigned to ith index of a new array transformedArr.

*/
