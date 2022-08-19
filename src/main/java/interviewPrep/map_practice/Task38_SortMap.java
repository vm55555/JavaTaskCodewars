package interviewPrep.map_practice;

import java.util.*;

public class Task38_SortMap {

    public static void main(String[] args) {

        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);

        //System.out.println(sortMap(map));
        System.out.println(sortWithMaharram(map));
    }

    public static TreeMap<String, Integer> sortMap (Map <String, Integer> map){

        TreeMap<String, Integer> res = new TreeMap<>(map);

        return res;
    }

    public static Map<String, Integer> sortWithMaharram(Map <String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByKey()); //comparingByKey()
        map.clear();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

       return map;
    }
}

/*
//38  SORT MAP

   Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);
 */
