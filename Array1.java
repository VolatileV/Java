


public class Array1 {
    public static void main(String[] args){

        // String[] flowers = {"rose","lily","hydrangea"};

        // System.out.println(flowers[0]);
        // flowers[0] = "lol";
        // System.out.println(flowers[0]);

        int[][] arr = {{1,2},{3,4}};
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++){

                System.out.println(arr[i][j]+ "\t");

            }
        }
    }
}
