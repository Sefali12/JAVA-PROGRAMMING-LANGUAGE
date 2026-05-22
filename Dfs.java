import java.util.*;
ans=Math.max(ans,currentscore);
visited[node]=true;
for(int nb:adj.get(node)){
    if(!visited[nb] && layer[nb]>=currentlayer){
        int penalty=(int)Math.pow(layer[nb]-currentLayer,2);
        dfs(nb,currentscore+value[nb]-penalty,layer[nb]);
        
    }
}
    visited[node]=false;

