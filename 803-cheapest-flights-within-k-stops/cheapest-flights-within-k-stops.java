class Solution {
    class tuple {
        int stop , node, dist ;
        tuple(int stop , int node , int dist ){
            this.stop = stop;
            this.node = node;
            this. dist = dist;

        }
    }
    
    class pair{
        int to , cost;
        pair(int to , int cost){
            this .to = to;
            this.cost = cost;
        }

    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i =0; i <n; i ++){
            adj.add(new ArrayList<>());
        }
        for(int i =0; i <flights.length; i ++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];

            adj.get(from).add(new pair(to,cost));

        }
        int dist[]= new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(0,src,0));
        while(!q.isEmpty()){
            tuple curr = q.poll();
            int currstop = curr.stop;
            int currnode = curr.node;
            int currdist = curr.dist;

            for(int i =0; i < adj.get(currnode).size(); i ++){
                int neigh = adj.get(currnode).get(i).to;
                int ndist = adj.get(currnode).get(i).cost;

                if(dist[neigh] > currdist + ndist && k>= currstop){
                    dist[neigh]= currdist + ndist;
                    q.add(new tuple(currstop+1,neigh, dist[neigh]));
            
            }


            }
        }

        if(dist[dst]== Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];

        
        
    }
}