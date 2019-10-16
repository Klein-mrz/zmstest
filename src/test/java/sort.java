import java.util.ArrayList;
import java.util.Random;

public class sort {
    public static void main(String[] args) {
    int[] arrs=new int[100];
    for(int i=0;i<100;i++){
        arrs[i]= new Random().nextInt(1000);
    }
    sort sort=new sort();
    sort.Sort(arrs,"QUICK");
        for (int it:arrs){
            System.out.println(it);
        }


    }

    public int[] Sort(int[] arrs){
        return this.Sort(arrs, "QUICK");
    }
    public int[] Sort(int[] arrs,String type){
       if (arrs.length>0){
           if (type.equals("QUICK")){
               this.quickSort(arrs, 0, arrs.length-1);
           }
       }
       return arrs;
    }
    public void quickSort(int[] arrs,int begin,int end){
        if(begin>end) return;
        int flag=arrs[begin];
        int left=begin,right=end;
        while (left<right){
            while (left<right&&arrs[right]>=flag){
                right--;
                //找到右边比flag小的
            }
            while (left<right&&arrs[left]<=flag){
                left++;
                //找到左边比flag大的
            }

            if (left<right){
                //交换
                int temp=arrs[left];
                arrs[left]=arrs[right];
                arrs[right]=temp;
            }
            //每个都加上left<right的原因是，一旦二者相等立刻跳出
        }
        //此时left=right
        int medium =left;
        arrs[begin]=arrs[medium];
        arrs[medium]=flag;
        this.quickSort(arrs, begin, medium -1);
        this.quickSort(arrs, medium +1, end);
    }
    public int[] heapSort(int[] arrs){
        return arrs;
    }
    public ArrayList<Integer> quickSort(ArrayList<Integer> arrs){
        Integer maduim=arrs.get(0);
        if (arrs.size()==1) return arrs;
        ArrayList<Integer> before=new ArrayList<Integer>();
        ArrayList<Integer> after=new ArrayList<Integer>();
        for (int i=1;i<arrs.size();i++){
            Integer temp= arrs.get(i);
            if(temp<=maduim){
                before.add(temp);
            }else {
                after.add(temp);
            }
        }
        before=this.quickSort(before);
        after = this.quickSort(after);
        before.add(maduim);
        before.addAll(after);


        return before;
    }

}
