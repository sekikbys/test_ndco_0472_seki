package co.jp.java.demo.project.test;

import java.util.HashMap;
import java.util.Map;

public class PostgreDataSrcImpl implements DataSrcChooser {
    @Override
    public void choseDataSrc(Object o) {
        Integer j = (Integer) o;
        //postgresDataMockMap
        Map<Integer,String> postgresDataMockMap = new HashMap<>();
        for (int i = 6; i < 16; i++) {
            postgresDataMockMap.put(i,"postgres"+i);
        }
        if (postgresDataMockMap.containsKey(j)) {
            System.out.println("\"\tSearchResult:\""+postgresDataMockMap.get(j)+"\"");
        } else{
            System.out.println("\"\tSearchResult:No Result");
        }
    }
}
