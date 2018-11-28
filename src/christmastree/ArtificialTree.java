/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

import java.util.ArrayList;

/**
 * This class extends te christmas tree one to specialize it.
 *
 * @author Yassine
 *
 */
public class ArtificialTree extends ChrismasTree {

  private String plasticType;

  /**
   * Constructor of the ArtificialTree class with standard (preprogrammed) value.
   *
   * */
  public ArtificialTree() {
    setDescription("TreeDescription: " + "Artificial Tree");
    setPrice(100.99);
    setColor(" TreeColor " + "Green");
    this.plasticType = "plasticType: " + "plasticTypeA";
  }

  /**
   *This is the constructor of the class where you can input your own parameter,
   *  to make the christmas tree.
   *
   * @param description the tree type
   * @param price the price of the tree
   * @param color the color of the tree
   * @param plasticType the typr of plastic of the tree
   *
   *
   * */
  public ArtificialTree(String description, double price, String color, String plasticType) {
    setDescription("TreeDescription" + description);
    setPrice(price);
    setColor("TreeColor" + color);
    this.plasticType = "plasticType: " + plasticType;
  }

  /**
   * the list of possible decorations.
   * @return the list of all possible decorator for this type of tree.
   * */
  public ArrayList decoratorPossible() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Balls");
    list.add("ElectricGarland");
    list.add("SyntheticGarland");
    return list;
  }

  public String getPlasticType() {
    return plasticType;
  }

  public void setPlasticType(String plasticType) {
    this.plasticType = plasticType;
  }

  @Override
  public String toString() {
    super.toString();
    return " ArtificialTree{" + plasticType + '}';
  }
}
