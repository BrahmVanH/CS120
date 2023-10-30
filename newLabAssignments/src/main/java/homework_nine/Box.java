package homework_nine;

public class Box {
  private double width;
  private double height;
  private double depth;

  

  public void setWidth(double w) {
    width = w;
  }

  public void setHeight(double h) {
    height = h;
  }

  public void setDepth(double d) {
    depth = d;
  }

  public double getVolume() {
    return (width * height * depth);
  }
}
