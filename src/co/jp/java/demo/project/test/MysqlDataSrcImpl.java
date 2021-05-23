package co.jp.java.demo.project.test;

import java.util.HashMap;
import java.util.Map;

public class MysqlDataSrcImpl implements DataSrcChooser {
    @Override
    public void choseDataSrc(Object o) {
        Integer j = (Integer) o;
        //mysqlDataMockMap
        Map<Integer,String> mysqlDataMockMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            mysqlDataMockMap.put(i,"mysql"+i);
        }
        if (mysqlDataMockMap.containsKey(j)) {
            System.out.println("\"\tSearchResult:\""+mysqlDataMockMap.get(j)+"\"");
        } else{
            System.out.println("\"\tSearchResult:\"No Result\"");
        }
    }
}
