import java.util.ArrayList;
import java.util.List;

public class proDungeons {

    static List<List<Integer>> list =new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int k=80;
        int[][] dungeons={{80,20},
                          {50,40},
                          {30,10}};



        visited =new boolean[dungeons.length];
        int count=0;


        dfs(k,dungeons,count);

    }
    static void dfs(int k, int[][] dungeons,int count){

        for(int i=0;i< dungeons.length; i++){
            if(k>=dungeons[i][0]){
                visited[i]=true;
                k-= dungeons[i][1];
                count++;
            }



            }
        }

    }

