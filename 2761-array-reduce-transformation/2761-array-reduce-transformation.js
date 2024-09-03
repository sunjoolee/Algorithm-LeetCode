/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var ret = init
    for(num of nums) ret = fn(ret, num)
    return ret
};