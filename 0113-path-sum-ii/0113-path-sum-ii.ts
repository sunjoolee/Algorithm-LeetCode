/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function pathSum(root: TreeNode | null, targetSum: number): number[][] {
    const paths: number[][] = []
    findPath(paths, [], 0, root, targetSum)
    return paths
};

function findPath(paths: number[][], path: number[], sum: number, node: TreeNode, targetSum: number){
    if(!node) return

    const newPath = path.concat(node.val)
    const newSum = sum + node.val
    if(!node.left && !node.right){
        if(newSum === targetSum) paths.push(newPath)
        return
    }

    findPath(paths, newPath, newSum, node.left, targetSum)
    findPath(paths, newPath, newSum, node.right, targetSum)
}