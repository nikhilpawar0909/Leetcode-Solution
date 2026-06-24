/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const c  = [];
    let i = 0;
    while (i < arr.length) {
        c.push(arr.slice(i, i + size))
        i += size
    }
    return c
};
