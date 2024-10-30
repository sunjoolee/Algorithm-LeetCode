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
 
function hasPathSum(root: TreeNode | null, targetSum: number): boolean {
    return findRootSum(0, root, targetSum)
};

function findRootSum(sum: number, node: TreeNode, targetSum: number): boolean{
    if(!node) return false
    if(!node.left && !node.right) return (sum + node.val) === targetSum

    return (findRootSum(sum + node.val, node.left, targetSum) || findRootSum(sum + node.val, node.right, targetSum))
}