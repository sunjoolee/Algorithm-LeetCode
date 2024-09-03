/**
 * @param {string} rh
 * @return {Object}
 */
var expect = function(rh) {
    return{
        toBe: (lh) => {
            if(rh === lh) return true
            else throw Error("Not Equal")
        },
        notToBe: (lh) => {
            if(rh !== lh) return true
            else throw Error("Equal")
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */