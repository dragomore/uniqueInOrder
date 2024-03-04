public class Main {
    public static void main(String[] args) {
        String a = "111333223322";
        uniqueInOrder(a);
    }

    public static void uniqueInOrder(String str){
        char tmp = str.charAt(0);
        StringBuilder result = new StringBuilder();
        result.append(tmp);
        for(int i = 0; i < str.length(); i++ ){
            if( str.charAt( i ) != tmp ) {
                result.append(str.charAt(i));
                tmp = str.charAt( i );
            }
        }
        System.out.println(result);
    }
}

