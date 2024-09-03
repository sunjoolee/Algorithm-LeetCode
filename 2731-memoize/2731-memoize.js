/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let cache = new Map()

    return function(...args) {
        const key = JSON.stringify(args)

        if(cache.has(key)) return cache.get(key)
        
        const ret = fn(...args)
        cache.set(key, ret)
        return ret
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */