package oops.Method_Overriding;

public class Instagramf2 extends Instagramf1 {

  @Override
  void upload() {
    super.upload();
    System.out.println("Can Upload GIf");
  }

  void DM() {
    System.out.println("Text DM supported");
  }
}
