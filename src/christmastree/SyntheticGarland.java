/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class which extends garland into a synthetic one.
 * @author Yassine
 *
 */
public class SyntheticGarland extends Garland {

  private String paillette;

  /**
   * the standard constructor.
   * @param treeDecorator the tree to be decorated
   */
  public SyntheticGarland(ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " SyntheticGarlandColor: " + "yellow");
    setDescription(treeDecorator.getDescription() + " SyntheticGarlandDecorator: " + "Garland");
    setPrice(treeDecorator.getPrice() + 10.99);
    setLength(15);
    setPaillette(
        getPaillette() == null
            ? "" + " SyntheticGarlandPaillette: " + "Square"
            : getPaillette() + " SyntheticGarlandPaillette: " + "Square");
  }

  /**
   * the personnalized constructor.
   * @param paillette choice of paillette
   * @param color choice of color
   * @param description to be changed
   * @param price choice of price
   * @param length choice of length
   * @param treeDecorator the tree o be decorated
   */
  public SyntheticGarland(
      String paillette,
      String color,
      String description,
      double price,
      double length,
      ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " SyntheticGarlandColor: " + color);
    setDescription(treeDecorator.getDescription() + " SyntheticGarlandDecorator: " + description);
    setPrice(treeDecorator.getPrice() + price);
    setLength(length);
    this.paillette =
        getPaillette() == null
            ? "" + " SyntheticGarlandPaillette: " + paillette
            : getPaillette() + " SyntheticGarlandPaillette:: " + paillette;
  }

  // Getters and setters
  public String getPaillette() {
    return paillette;
  }

  public void setPaillette(String paillette) {
    this.paillette = paillette;
  }

  @Override
  public String toString() {
    return super.toString() + " SyntheticGarland{" + paillette + '}';
  }
}
