/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return (x) => {
        let ret = x
        for(f of functions.reverse()) ret = f(ret)
        return ret
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */