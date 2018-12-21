//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Solution {
//
//    public static int row;
//    public static int column;
//
//   public boolean checkArrays(char[][]...chars){
//
//        int counts = 0;
//       for (int k =0; k< chars.length; k++) {
//           int pieces = 0;
//           for (int i = 0; i <chars[k].length ; i++) {
//               for (int j = 0; j <chars[k][i].length ; j++) {
//
//                   switch (chars[k][i][j]){
//                       case '@':{
//                           pieces++;
//                       } break;
//                   }
//
//               }
//           }
//           if (k==0) {counts = pieces;}
//           else
//           if (pieces==counts) {continue;}
//           else return false;
//       }
//        return true;
//    }
//
//    public static char[][][] slicePieces(char[][] slice, int h, int v){
//       char[][][] chars = new char[(h+1)*(v+1)][][];
//        for (int i = 1; i <chars.length ; i++)
//                for (int k = 0; k < slice[i].length ; k++) {
//
//                chars[i] = Arrays.copyOfRangea(slice,i,k);
//            }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(new InputStreamReader(System.in));
//        int test = in.nextInt();
//        for (int i = 1; i <= test ; i++) {
//
//            row = in.nextInt();
//            column = in.nextInt();
//            char [][] cake = new char[row][column];
//            //System.out.println("Case#"+ i +":" + "POSSIBLE");
//           // System.out.println("Case#"+ i +":" + "IMPOSSIBLE");
//            int hor = in.nextInt();
//            int ver = in.nextInt();
//            for (int j = 0; j <row ; j++) {
//                cake[j] = in.nextLine().toCharArray();
//            }
//        int chips=0;
//            for (int j = 0; j <cake.length ; j++) {
//                for (int k = 0; k <cake[j].length ; k++) {
//                        switch (cake[j][k]){
//                            case '@':{
//                                chips++;
//                            } break;
//                        }
//
//                    if (chips==0){ System.out.println("Case#"+ i +":" + "POSSIBLE") ;
//                        break;
//
//
//                        }
//                }
//
//            }
//
//
//        }
//
//
//
//    }
//}
