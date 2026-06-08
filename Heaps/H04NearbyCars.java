import java.util.*;
public class H04NearbyCars{
    @SuppressWarnings("unused")
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;
        }
    }

    public static ArrayList<Integer> nearestCars(int[][] cars, int k ){
        ArrayList<Integer> nearest = new ArrayList<>(k);
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int[] car : cars) {
            int distSq = car[1] * car[1] + car[2] * car[2];
            pq.add(new Point(car[1], car[2], distSq, car[0]));
        }

        for(int i = 0; i<k; i++){
            nearest.add(pq.remove().idx);
        }
        return nearest;
    }

    public static void main(String[] args) {
        int pts[][] = {{1,3,3},{2,5,-1},{3,-2,4},{4,-3,2}};
        int k = 2;

        System.out.println(nearestCars(pts, k));
    }

}