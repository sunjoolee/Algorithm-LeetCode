function pivotIndex(nums: number[]): number {
    const psum: number[] = []
    let sum = 0
    nums.forEach(n => {
        sum += n
        psum.push(sum)
    })

    const lastIdx = psum.length -1
    for(let p = 0; p<=lastIdx; ++p){
        const lSum = p===0? 0 : psum[p-1]
        const rSum = p===lastIdx? 0 : psum[lastIdx] - psum[p]
        if(lSum === rSum) return p
    }
    return -1
};
