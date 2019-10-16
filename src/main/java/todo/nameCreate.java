package todo;

import entity.person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nameCreate {
    public static void main(String[] args) {
        //List<person> persons=new ArrayList<person>();
        List<String> firstnames=getFirstname("src/document/firstname/firstname");
        List<String> firstnamelittles=getFirstname("src/document/firstname/firstnamelittle");
        List<String> goods=getFirstname("src/document/disposition/good");
        List<String> bads=getFirstname("src/document/disposition/bad");
        List<String> lastnameshi =getFirstname("src/document/lastname/shijing");
        List<String> lastnamechu =getFirstname("src/document/lastname/chuci");
        //List<String> yaocai=getFirstname("src/document/lastname/zhongyao");
        for (int i = 0; i <10 ; i++) {
            person per=new person();
            if(rand.rand(6)==1){
                per.setFirstname("little "+firstnamelittles.get(rand.rand(firstnamelittles.size())-1));
            }else {
                per.setFirstname("normal "+firstnames.get(rand.rand(firstnames.size())-1));
            }
            String ddd="";
            for (int j = 0; j <3 ; j++) {
                if(rand.rand(2)==1){
                    ddd=ddd+goods.get(rand.rand(goods.size())-1)+" ";
                }else {
                    ddd=ddd+bads.get(rand.rand(bads.size())-1)+" ";
                }
            }
            per.setDisposition(ddd);
            int kk=0;
            if(rand.rand(2)==1){
                per.setSex("男");
                kk=1;
            }else {
                per.setSex("女");
                kk=4;
            }
            if(rand.rand(5)>kk){
                String string = lastnamechu.get(rand.rand(lastnamechu.size())-1);
                String str="";
                char[] chars=string.toCharArray();
                if(rand.rand(2)==1){
                    int rr=rand.rand(chars.length);
                    str=str+chars[rr-1];
                }else {
                    int rr=rand.rand(chars.length-1);
                    str=str+chars[rr-1]+chars[rr];
                }
                per.setLastname(str+"chu");
            }else {
                String string=lastnameshi.get(rand.rand(lastnameshi.size())-1);
                String str="";
                char[] chars=string.toCharArray();
                if(rand.rand(2)==1){
                    int rr=rand.rand(chars.length);
                    str=str+chars[rr-1];
                }else {
                    int rr=rand.rand(2);
                    if (rr == 1) {
                        str=str+chars[0]+chars[1];
                    }else {
                        str=str+chars[chars.length-2]+chars[chars.length-1];
                    }

                }
                per.setLastname(str+"shi");
            }
            System.out.println(per.toString());
        }
    }

    public static List<String> getFirstname(String pathname){
            List<String> firstnames=new ArrayList<String>();

            try {
                FileReader reader = new FileReader(pathname);
                BufferedReader br = new BufferedReader(reader);
                String line;
                //网友推荐更加简洁的写法
                //br.r
                while ((line = br.readLine()) != null) {
                    // 一次读入一行数据
                    if (!line.equals("")){
                        String[] words=line.split(",");
                        for(String word:words){
                            if(!word.equals(""))
                            firstnames.add(word);
                            //System.out.println(word.toString()+"hhh");
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return firstnames;
    }


    public static void test(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("5555");
        StringBuilder stringBuilder=new StringBuilder("6666");
        Set<String > strings=new HashSet<String>();
        List<String> list = new ArrayList<String>();

    }
}
