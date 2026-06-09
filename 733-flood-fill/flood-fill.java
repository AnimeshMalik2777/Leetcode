class Solution { 
 
    public int[][] floodFill(int[][] image, 
                             int sr, 
                             int sc, 
                             int color) { 
 
        int original = image[sr][sc]; 
 
        if (original == color) { 
            return image; 
        } 
 
        Queue<int[]> queue = new LinkedList<>(); 
 
        queue.offer(new int[]{sr, sc}); 
 
        int[][] dir = { 
            {1, 0}, 
            {-1, 0}, 
            {0, 1}, 
            {0, -1} 
        }; 
 
        while (!queue.isEmpty()) { 
 
            int[] curr = queue.poll(); 
 
            int r = curr[0]; 
            int c = curr[1]; 
 
            if (r < 0 || c < 0 || 
                r >= image.length || 
                c >= image[0].length || 
                image[r][c] != original) { 
 
                continue; 
            } 
 
            image[r][c] = color; 
 
            for (int[] d : dir) { 
                queue.offer(new int[]{ 
                    r + d[0], 
                    c + d[1] 
                }); 
            } 
        } 
 
        return image; 
    } 
} 