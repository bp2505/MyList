import MyList.MyArrayList;
import MyList.User;
public class Test {
    public static void main(String[]args){
        MyArrayList<Integer> data = new MyArrayList<Integer>();
        for (int i = 0; i <= 15; i++){
            data.add(i);
        }
        System.out.println(data.size());
        for (int i = 0; i <= data.size()-1; i++){
            System.out.print(data.get(i)+" ");
        }
        if (data.checkDuplicate(10)){
            System.out.println("\ndata already exists");
        }
        data.add(16,16);
        System.out.println(data.indexOf(16));


    }
}
