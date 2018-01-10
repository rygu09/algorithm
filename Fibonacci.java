package suibian2;

////非递归
//public class Fibonacci {
//    public static void main(String[] args) {
//        print(13);
//    }
//
//    private static void print(int n) {
//        long i = 0;
//        long j = 1;
//        long sum = 0;
//        for (int k = 1; k <= n; k++) {
//            if (k == 1) {
//                System.out.print(1 + " ");
//            } else {
//                sum = i + j;
//                i = j;
//                j = sum;
//                System.out.print(sum + " ");
//            }
//        }
//    }
//}

//递归
public class Fibonacci {

  // 使用递归方法
  private static int getFibo(int i) {
      if (i == 1 || i == 2)
          return 1;
      else
          return getFibo(i - 1) + getFibo(i - 2);
  }
  public static void main(String[] args) {
      System.out.println("斐波那契数列的前20项为：");
      for (int j = 1; j <= 20; j++) {
          System.out.print(getFibo(j) + " ");

          /*每隔5个数换行
           * if (j % 5 == 0)
              System.out.println();*/
      }
  }
}