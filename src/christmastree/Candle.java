/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * This class specializes the decorator with functionnalities from the candle.
 * @author Yassine
 *
 *
 * */
public class Candle extends Decorator {

  private int lifeTime; // en heur
  private String parfum;

  /**
   * This is the standard constructor of candle.
   * @param treeDecorator the christmasTree to be augmented
   *
   */
  public Candle(ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " CandleColor: " + "White");
    setDescription(treeDecorator.getDescription() + " CandleDecorator: " + "Candle");
    setPrice(treeDecorator.getPrice() + 16.99);
    setLifeTime(5);
    setParfum(
        getParfum() == null
            ? "" + " CandleParfum: " + "Senteurs d'inspiration"
            : getParfum() + " CandleParfum: " + "Senteurs d'inspiration");
  }

  /**
   * this is the personnalised constructor of the candle.
   * @param color choice of color
   * @param description to be augmented
   * @param price choice of price
   * @param lifeTime choice of lifetime
   * @param parfum choice of parfum
   * @param treeDecorator the christmasTree to be augmented
   *
   *
   */
  public Candle(
      String color,
      String description,
      double price,
      int lifeTime,
      String parfum,
      ChrismasTree treeDecorator) {
    super(treeDecorator);
    setColor(
        treeDecorator.getColor() == null
            ? ""
            : treeDecorator.getColor() + " CandleColor: " + color);
    setDescription(treeDecorator.getDescription() + " CandleDecorator: " + description);
    setPrice(treeDecorator.getPrice() + price);
    this.lifeTime = lifeTime;
    this.parfum =
        getParfum() == null
            ? "" + " CandleParfum: " + parfum
            : getParfum() + " CandleParfum: " + parfum;
  }

  // Getters and Setters

  public int getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(int lifeTime) {
    this.lifeTime = lifeTime;
  }

  public String getParfum() {
    return parfum;
  }

  public void setParfum(String parfum) {
    this.parfum = parfum;
  }

  @Override
  public String toString() {
    return super.toString() + "Candle{" + "lifeTime=" + lifeTime + "," + parfum + '}';
  }
}
