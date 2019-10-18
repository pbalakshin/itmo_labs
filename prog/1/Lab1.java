/**
 * Class with lab1 solution
 * @author Dmitry Kuperstein (269359)
 */
public class Lab1 {
  /**
   * Main function with procedural code
   * @param args command line arguments 
   */
  public static void main(String[] args) {

    /** Array for 1st task */
    long[] firstArray = new long[12];
    for (int i = 1; i <= 12; i++) {
      firstArray[12 - i] = i * 2 - 1;
    }

    /** Array for 2ed task */
    float[] secondArray = new float[16];
    for (int i = 0; i < 16; i++) {
      secondArray[i] = -2.0F + (float)Math.random() * 8.0F;
    }

    /** Matrix for 3ed task */
    double[][] matrix = new double[12][16];
    /** Temporary varivariable for calculations */
    double tmp;
    /** For beauty */
    double x;
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 16; j++) {
        x = secondArray[j];
        if (firstArray[i] == 1) {
          /*
          Simplification:
            (e^x)^2 = e^(2*x)
          */
          tmp = Math.tan
            (Math.pow
              (Math.E, 2 * x));
        } else if (firstArray[i] == 3
                   || firstArray[i] == 5
                   || firstArray[i] == 13
                   || firstArray[i] == 15
                   || firstArray[i] == 17
                   || firstArray[i] == 23) {
          /*
          Simplification:
            1/4 * (x+2)/8 = 1/4 * (x/8 + 1/4) =
            = x/32 + 0.0625
          */
          tmp = Math.pow
            (2 * Math.asin
              (x/32 + 0.0625), 3);
        } else {
          /*
          Simplification:
            (2 * |x|/2)^2 = |x|^2
            and |x|^2 = x^2
            for real numbers
          */
          tmp = Math.log
            (Math.pow
              (Math.sin
                (Math.log
                  (Math.pow
                    (x, 2))), 2));
        }
        matrix[i][j] = tmp;
      }
    }
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 16; j++) {
        System.out.printf("%10.5f", matrix[i][j]);
      }
      System.out.print("\n");
    }
  }
}