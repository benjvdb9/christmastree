/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * This class extendes the Decorator to add the specificity of a ball.
 *
 * @author Yassine
 *
 *
 * */
public class Balls extends Decorator {

  String material;
  String size; // in cm

  /**
   * This class adds balls in a christmasTree.
   *
   * @param treeDecorator the christmasTree to be augmented with the decorator
   *
   * */
  public Balls(ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null ? "" : treeDecorator.getColor() + " BallsColor: " + "Red");
    setDescription(treeDecorator.getDescription() + " BallsDecorator: " + "Balls");
    setPrice(treeDecorator.getPrice() + 20.99);
    setMaterial(
        getMaterial() == null
            ? "" + " BallsMaterial: " + "Plastic"
            : getMaterial() + " BallsMaterial: " + "Plastic");
    setSize(
        getSize() == null ? "" + " BallsSize: " + "Small" : getSize() + " BallsSize: " + "Small");
  }

  /**
   *this class decorated a christmas with a personnalized ball.
   *
   * @param color the color of the ball
   * @param description to be augmented with values from this method
   * @param price the selected price of the ball
   * @param material the selected material of the ball
   * @param size the selected size of the ball
   * @param treeDecorator the tree to be decorated with the ball
   *
   *
   * */
  public Balls(
      String color,
      String description,
      double price,
      String material,
      String size,
      ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null ? "" : treeDecorator.getColor() + " BallsColor: " + color);
    setDescription(treeDecorator.getDescription() + " BallsDecorator: " + description);

    setPrice(treeDecorator.getPrice() + price);
    this.material =
        getMaterial() == null
            ? "" + " BallsMaterial: " + material
            : getMaterial() + " BallsMaterial: " + material;
    this.size = getSize() == null ? "" + " BallsSize: " + size : getSize() + " BallsSize: " + size;
  }

  // Getters and setters
  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString() {

    return super.toString() + "Balls{" + material + "," + size + '}';
  }
}
