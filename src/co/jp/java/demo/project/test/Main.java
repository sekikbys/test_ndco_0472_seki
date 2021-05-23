package co.jp.java.demo.project.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        //inputLstを用意する
        List<String> inputLst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                inputLst.add("Postgres");
            } else {
                inputLst.add("Mysql");
            }
        }
        //Loop Start
        for (int i = 0; i < inputLst.size(); i++) {
            String str = inputLst.get(i);
            Random rand = new Random();
            Integer num = rand.nextInt(16);
            System.out.print("Loop Index:\"" + i + "\"\tSearch Type:\"" + str +"\"\tSearchedID:\"" + num);
            if (str.contentEquals("Postgres")) {
                Class dataSrcChooserClass = Class.forName("co.jp.java.demo.project.test.PostgreDataSrcImpl");
                Object obj = dataSrcChooserClass.getDeclaredConstructor().newInstance();
                ((DataSrcChooser) obj).choseDataSrc(num);
            } else {
                Class dataSrcChooserClass = Class.forName("co.jp.java.demo.project.test.MysqlDataSrcImpl");
                Object obj = dataSrcChooserClass.getDeclaredConstructor().newInstance();
                ((DataSrcChooser) obj).choseDataSrc(num);
            }
        }
    }
}
