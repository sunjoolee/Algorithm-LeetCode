/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let newArr = new Array()
    for(let i = 0; i<arr.length; ++i) newArr.push(fn(arr[i], i))
    return newArr
};