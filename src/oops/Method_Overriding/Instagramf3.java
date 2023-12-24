package oops.Method_Overriding;

public class Instagramf3 extends Instagramf2 {

  @Override
  void DM() {
    super.DM();
    System.out.println("Images DM supported");
  }

  void Story() {
    System.out.println("Can upload stories!");
  }
}
