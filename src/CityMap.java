import java.util.HashMap;
import java.util.Map;

public class CityMap {

    public String  getLegend(String[] cityMap, int[] POIs ){
     String str;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      for(int i=0;i<cityMap.length;i++){

          str = cityMap[i];
          char[] charArray = str.toCharArray();
          for(char c : charArray){
              if(c=='.'){
                  //do nothing
              }else{
                  if(map.get(c)!=null){
                  map.put(c,map.get(c)+1);
                  }else{
                      map.put(c,1);
                  }
                 }
          }



      }
       StringBuilder s = new StringBuilder();
        for(int j = 0;j<POIs.length;j++){
           int num =  POIs[j];
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(num==entry.getValue()){
                    s.append(entry.getKey());
                }
            }
        }



     return s.toString();
    }

}
