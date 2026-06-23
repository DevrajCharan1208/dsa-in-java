
public class G17DisjointSetUnion{
    
    static final int N = 7;
    static int[] par = new int[N];
    static int[] rank = new int[N];

    public static void init(){
        for(int i = 0; i<N; i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(par[x] == x){
            return par[x] = x;
        }

        return find(par[x]);
    }
 
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA]==rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]>rank[parB]){
            par[parB] = parA;
        }else{
            par[parA] = parB;
        }
    } 

    public static void main(String[] args) {
        init();

        union(1,3);
        System.out.println(find(3));
        union(2,4);
        System.out.println(find(4));
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
        System.out.println(find(5));

        for(int i = 0; i<N; i++){
            System.out.print(par[i] + " ");
        }
    }

}