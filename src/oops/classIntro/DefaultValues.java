package oops.classIntro;

public class DefaultValues {

  byte a;
  short b;
  int c;
  long d; //0
  float e;
  double f; //0.0
  boolean h; //false
  char g; //dmpty space
//   String i;//null

  public static void main(String[] args) {
    DefaultValues dv = new DefaultValues();
    Object[] values = { dv.a, dv.b, dv.c, dv.d, dv.e, dv.f, dv.h, dv.g};
    for (int i = 0; i < values.length; i++) {
      System.out.println( ((Object)values[i]).getClass().getSimpleName()+" ===> " + values[i]);
    }
  }
}

//change the values
// package oops.classIntro;

// public class DefaultValues {

//   byte a;
//   short b;
//   int c;
//   long d; //0
//   float e;
//   double f; //0.0
//   boolean h; //false
//   char g; //dmpty space
//   String i; //null

//   public static void main(String[] args) {
//     DefaultValues dv = new DefaultValues();
//     System.out.println("Before===> " + dv.i);
//     System.out.println(((Object)(dv.a)).getClass().getSimpleName());
//     dv.i = "Darshan";
//     System.out.println("After===> " + dv.i);
//   }
// }
