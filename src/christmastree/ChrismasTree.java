/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * this is the class of the tree which is to be augmented with decoration.
 * @author  Yassine
 */
public abstract class ChrismasTree {
  private String description;
  private double price;
  private String color;

  // Getters and Setters
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "ChrismasTree{" + description + ", price=" + price + "," + color + '}';
  }
}
