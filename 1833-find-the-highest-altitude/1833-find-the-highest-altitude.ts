function largestAltitude(gain: number[]): number {
    const altitude: number[] = [0]
    for(let i = 0; i<gain.length; ++i){
        altitude.push(gain[i] + altitude[i])
    }
    return Math.max(...altitude)
};