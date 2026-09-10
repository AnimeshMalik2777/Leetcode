class Solution {

    int ans = 0;

    class Pair {
        int sum;
        int count;

        Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public Pair dfs(TreeNode root) {

        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        int sum = root.val + left.sum + right.sum;
        int count = 1 + left.count + right.count;

        int average = sum / count;

        if (root.val == average) {
            ans++;
        }

        return new Pair(sum, count);
    }
}