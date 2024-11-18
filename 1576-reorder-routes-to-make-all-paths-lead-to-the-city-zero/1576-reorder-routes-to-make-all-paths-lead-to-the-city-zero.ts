let reorderCnt = 0
let isVisited: number[]
const connectionMap: Map<number, number[][]> = new Map()

function minReorder(n: number, connections: number[][]): number {
    isVisited = new Array(connections.length).fill(0)
    reorderCnt = 0
    connectionMap.clear()

    connections.forEach(connection => {
        const start = connection[0]
        const dest = connection[1]
        connectionMap.set(start, connectionMap.get(start) ? [...connectionMap.get(start)!!, connection]: [connection])
        connectionMap.set(dest, connectionMap.get(dest) ? [...connectionMap.get(dest)!!, connection]: [connection])
    })
    console.log(connectionMap)
    reorder(0, connections)
    return reorderCnt
};

function reorder(cur: number, connections: number[][]){
    console.log(`cur: ${cur} reorderCnt: ${reorderCnt}`)
    if(isVisited[cur]) return 

    isVisited[cur] = 1
    connectionMap.get(cur)?.forEach(connection => {
        const start = connection[0]
        const dest = connection[1]

        // 정방향 connection
        if(!isVisited[start] && dest === cur){
            reorder(start, connections)
        }
        // 역방향 connection
        if(start === cur && !isVisited[dest]) {
            reorderCnt++
            reorder(dest, connections)
        }
    })
}