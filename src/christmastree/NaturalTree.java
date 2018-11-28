/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class specializing the tree into a natural one.
 * @author Yassine
 *
 */
public class NaturalTree extends ChrismasTree {

  String treeType;
  int lifeTime;

  /**
   * the standard constructor.
   */
  public NaturalTree() {
    setDescription(" TreeDescription: " + "Natural Tree");
    setPrice(200.20);
    setColor(" TreeColor: " + "Green");
    setTreeType(" TreeType: " + "Omorika");
    setLifeTime(50);
  }

  /**
   * the personnalized constructor.
   * @param description to be changed
   * @param price choice of price
   * @param color choice of color
   * @param treeType type chosen
   * @param lifeTime choice of lifetime
   */
  public NaturalTree(
      String description, double price, String color, String treeType, int lifeTime) {
    setDescription(" TreeDescription: " + description);
    setPrice(price);
    setColor(" TreeColor: " + color);
    this.treeType = " TreeType: " + treeType;
    this.lifeTime = lifeTime;
  }

  // Getters and Setters
  public String getTreeType() {
    return treeType;
  }

  public void setTreeType(String treeType) {
    this.treeType = treeType;
  }

  public int getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(int lifeTime) {
    this.lifeTime = lifeTime;
  }

  @Override
  public String toString() {
    super.toString();
    return " NaturalTree{" + treeType + ", lifeTime=" + lifeTime + '}';
  }
}
