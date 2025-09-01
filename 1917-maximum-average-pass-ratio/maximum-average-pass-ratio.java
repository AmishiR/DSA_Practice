class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        int n= classes.length;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));


        for(int i=0;i<n;i++){
            double PR=(double)classes[i][0]/classes[i][1];
            double newPR=(double)(classes[i][0]+1)/(classes[i][1]+1);
            double delta = newPR - PR;
            pq.add(new double[]{delta, i});
        }

        while(extraStudents-->0){
            double[] curr = pq.poll();
            double delta = curr[0];
            int id = (int) curr[1];


            classes[id][0]++;
            classes[id][1]++;


            double curr_PR=(double)classes[id][0]/classes[id][1];
            double new_PR=(double)(classes[id][0]+1)/(classes[id][1]+1);
            delta=new_PR-curr_PR;
            pq.add(new double[]{delta, id});


        }

        double result=0.0;
        for(int i=0;i<n;i++){
            result+=(double)classes[i][0]/classes[i][1];
        }

        return result/n;
    }
}