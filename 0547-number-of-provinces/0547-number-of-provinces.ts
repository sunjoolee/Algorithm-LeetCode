let isVisited: number[]

function findCircleNum(isConnected: number[][]): number {
  isVisited = new Array(isConnected.length)

  let provinceCnt = 0
  for(let cur = 0; cur < isConnected.length; ++cur){
    if(isVisited[cur]) continue
    visit(cur, isConnected);
    provinceCnt++
  }  
    return provinceCnt
};

function visit(cur: number, isConnected: number[][]){
    if(isVisited[cur]) return

    isVisited[cur] = 1
    for(let next = 0; next < isConnected.length; ++next){
        if(isConnected[cur][next] && !isVisited[next]) visit(next, isConnected)
    }
    return
}