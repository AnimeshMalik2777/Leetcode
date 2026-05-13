class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1:
        // Find rotten oranges and count fresh
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If no fresh orange
        if(fresh == 0)
            return 0;

        int time = 0;

        int[][] dir = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        // BFS
        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for(int[] d : dir) {

                    int nr = r + d[0];
                    int nc = c + d[1];

                    // valid fresh orange
                    if(nr >= 0 && nc >= 0 &&
                       nr < rows && nc < cols &&
                       grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;

                        fresh--;

                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            time++;
        }

    
        if(fresh > 0)
            return -1;

        return time - 1;
    }
}