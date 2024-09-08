/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    let lastIdx = Object.keys(this).length -1
    if(lastIdx == -1) return -1
    return this[lastIdx]
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */