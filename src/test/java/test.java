import java.util.BitSet;
import java.util.Vector;

public class test {
    public static void main(String[] args) {
        System.out.println(4>>>1);
        BitSet bitSet=new BitSet();
        Vector vector=new Vector();
        System.out.println(-8&(-8-1));
    }
}
class single{
    private static single instance=new single();
    private single(){};
    public static single getInstance(){
        return instance;
    }
}
class single2{
    private  static single2 intstance;
    private single2(){}
    public static single2 getInstance(){
        if(intstance==null){
            intstance=new single2();
        }
        return intstance;
    }
}
