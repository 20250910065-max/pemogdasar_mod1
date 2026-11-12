public class PreTest_Multidimensi {
    public static void main(String[] args) {

        int[][] nilai2D = new int[3][2];
        nilai2D[0][0] = 80;
        nilai2D[0][1] = 85;
        nilai2D[1][0] = 70;
        nilai2D[1][1] = 75;
        nilai2D[2][0] = 60;
        nilai2D[2][1] = 65;

        String[][] data = {
            {"001", "Reinna"},
            {"002", "Dicka"},
            {"003", "Rere"}
        };

        System.out.println(data[1][1]);    
        System.out.println(nilai2D[0][1]);  
        System.out.println(data.length);    
    }
}
