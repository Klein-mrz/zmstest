import org.springframework.cglib.core.TinyBitSet;

import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class erchashu {
    public static void main(String[] args) {
        note n1 = new note(),n2 = new note(),n3 = new note(),n4 = new note(),n5 = new note();
        n1.var="n1";
        n2.var="n2";
        n3.var="n3";n4.var="n4";n5.var="n5";
        n1.leftson = n2;
        n2.leftson=n3;
        n2.rightson=n4;
        n1.rightson=n5;
        System.out.println("    n1");
        System.out.println("   /  \\");
        System.out.println("  n2   n5");
        System.out.println(" /  \\");
        System.out.println("n3   n4");
        System.out.printf("LNR");
        System.out.println("------");
        LNR(n1);
        System.out.printf("\nNLR");
        System.out.println("------");
        NLR(n1);
        System.out.printf("\nLRN");
        System.out.println("------");
        LRN(n1);
        System.out.printf("\ncengxu");
        System.out.println("------");
        cengxu(n1);
    }
    private static void NLR(note note){
        Stack<note> stack=new Stack<note>();
        if(note==null) return;
        note gen=new note(),now=new note();
        gen=note;
        while(gen!=null || !stack.empty()){
            while(gen!=null){
                System.out.printf(gen.var+ " ");
                stack.push(gen);
                gen=gen.leftson;
            }
            gen=stack.pop();
            gen=gen.rightson;
        }

    }
    private static void LNR(note note){
        Stack<note> stack=new Stack<note>();
        if(note==null) return;
        note gen=new note(),now=new note();
        gen=note;
        while(gen!=null || !stack.empty()){
            while(gen!=null){
                stack.push(gen);
                gen=gen.leftson;
            }
            gen=stack.pop();
            System.out.printf(gen.var+" ");
            gen=gen.rightson;
        }
    }
    private static void LRN(note note){
        Stack<note> stack=new Stack<note>();
        if(note==null) return;
        note gen=new note(),last=new note();
        gen=note;
        while(gen!=null || !stack.empty()){
            while(gen!=null){
                stack.push(gen);
                gen=gen.leftson;
            }
            gen=stack.peek();
            if(gen.rightson!=null&&!gen.rightson.Visited){
                gen=gen.rightson;
            }else {
                System.out.printf(gen.var+" ");
                gen.Visited=true;
                stack.pop();
                gen=null;
            }
        }
    }
    private static void cengxu(note note ){
        if(note==null)return ;
        Queue<note> queue=new LinkedList<note>();
        queue.add(note);
        while (!queue.isEmpty()){
            note now=queue.poll();
            System.out.printf(now.var+" ");
            if(now.leftson!=null){
                queue.add(now.leftson);
            }
            if(now.rightson!=null){
                queue.add(now.rightson);
            }
        }


    }
}

class note{
    public String var;
    public note leftson;
    public  note rightson;
    public boolean Visited=false;
}

