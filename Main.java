public class Main {
    public static void main(String[] args) {
        DBinary(5);

    }

    public static void DBinary(int x){
        Stack s=new Stack();
        int temp=x;
        while (temp>0){
            int y=temp%2;
            s.push(y);
            temp=temp/2;
        }
        s.print();
    }

}
