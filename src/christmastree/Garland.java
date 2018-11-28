/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class to specialize decorator into garland.
 * @author Yassine
 *
 */
public class Garland extends Decorator {

  private double length; // en cm

  /**
   * the standard contructor.
   * @param treeDecorator the tree to be decorated
   */
  public Garland(ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " GarlandColor: " + "blue");
    setDescription(treeDecorator.getDescription() + " GarlandDecorator: " + "Garland");
    setPrice(treeDecorator.getPrice() + 12.99);
    setLength(100);
  }

  /**
   * the personnalized decorator.
   * @param color choice of color
   * @param description to be changed
   * @param price choice of price
   * @param length choice of length
   * @param treeDecorator the tree to be decorated
   */
  public Garland(
      String color, String description, double price, double length, ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " GarlandColor: " + color);
    setDescription(treeDecorator.getDescription() + " GarlandDecorator: " + description);
    setPrice(treeDecorator.getPrice() + price);
    this.length = length;
  }

  // Getters and Setters
  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return super.toString() + " Garland{" + "length=" + length + '}';
  }
}
