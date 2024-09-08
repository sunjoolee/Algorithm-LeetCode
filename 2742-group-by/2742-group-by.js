/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    let ret = {};
    this.forEach((item) => {
        const k = fn(item);

        let newVal = new Array();
        if(ret.hasOwnProperty(k)) newVal = ret[k]
        newVal.push(item);

        ret[k] = newVal;
    })
    return ret;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */