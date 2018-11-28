/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class's purpose is to save a command of a christmas tree in the format of a billing where,
 * client's info, the tree, it's elements and their prices and the total price is present.
 *
 * @author venon arthur
 */
public class Bill {

  private FileWriter wr;
  private BufferedWriter bf;
  private PrintWriter pf ;
  private ChrismasTree toBePrinted;
  private Order order;
  // private String[] elements;
  /**
   * @param toBePrinted the class whiwch contains all info needed to make the file
   * @param order the class which contains the info about the client and the order
   * @param path the path to the file's location
   * @throws IOException this is in case the file cannot be created
   *
   *     This method is the constructor which instantiates the file, buffer and print writer to,
   *     write in a file located in the specified path.
   */
  public Bill(ChrismasTree toBePrinted, Order order, String path) throws IOException {

    this.wr = new FileWriter(path, true);
    this.bf = new BufferedWriter(wr);
    this.pf = new PrintWriter(bf);
    this.toBePrinted = toBePrinted;
    this.order = order;
  }
  /**
   * @throws IOException this is used in case the buffer and writer are already closed
   *
   *     this method closes the writer, buffer and printer so ressources used are released.
   */
  public void close() throws IOException {

    this.pf.close();
    this.bf.close();
    this.wr.close();
  }
  /**
   * @param newString the string to be added in the file
   *
   *     this method adds the string in the parameters directly inside the file.
   */
  public void addString(String newString) {
    pf.print(newString);
  }
  /**
   * @param newString this string is to be added in the file
   *
   *     this methods adds ths stirng in the parameters and then goes to the next lien.
   */
  public void addStringLine(String newString) {
    pf.println(newString);
  }
  /** this methods adds the client's info.
   *
   */
  public void addClient() {
    addStringLine("surname : " + order.getSurname() + " name : " + order.getName());
    addStringLine("address : " + order.getDeliveryAddress());
    addStringLine("date : " + order.getDate());
    addStringLine("");
  }
  /**
   * @param treeType the type of the tree commanded
   * @param treeColor the color of the tree commanded
   *
   *     this method adds the tree's info in the file.
   */
  public void addTree(String treeType, String treeColor) {
    addStringLine("1x " + treeType + " " + treeColor);
  }
  /**
   * @param description the array of the types of decoration
   * @param color the array of the color of decoration
   *
   *     this method adds the decorations in the file.
   */
  public void addDecorator(String[] description, String[] color) {
    int variable = 1;
    while (variable < description.length) {
      addStringLine(String.format("1x %s %s", description[variable], color[variable]));
      variable++;
    }
  }
  /** this method adds the price in the file.
   *
   */
  public void addPrice() {
    addStringLine("      ¨Price : " + String.valueOf(this.toBePrinted.getPrice()));
  }
  /** this methods adds the title in the file.
   *
   */
  public void addTitle() {
    addStringLine("A new command");
    addStringLine("");
    addStringLine("");
  }
  /**
   * @return elementsList the array of descitption on tree dans decoration
   *
   *     this method parse the descritpion of the description.
   */
  public String[] parserDescription() {
    String tampon = this.toBePrinted.getDescription();
    tampon = stringReplacer(tampon, "TreeDescritpion: ");
    tampon = stringReplacer(tampon, "BallsDecorator: ");
    tampon = stringReplacer(tampon, "CandleDecorator: ");
    tampon = stringReplacer(tampon, "GarlandDecorator: ");
    tampon = stringReplacer(tampon, "ElectricGarlandDecorator: ");
    tampon = stringReplacer(tampon, "SyntheticGarlandDecorator: ");
    String[] elementsList = tampon.split(" ");
    return elementsList;
  }
  /**
   * this methods parses the color string.
   * @return elementsList the array of the colors of tree and decorations
   *
   *
   */
  public String[] parserColor() {
    String tampon = this.toBePrinted.getColor();
    tampon = stringReplacer(tampon, "TreeColor: ");
    tampon = stringReplacer(tampon, "BallsColor: ");
    tampon = stringReplacer(tampon, "CandleColor: ");
    tampon = stringReplacer(tampon, "GarlandColor: ");
    tampon = stringReplacer(tampon, "ElectricGarlandColor: ");
    tampon = stringReplacer(tampon, "SyntheticGarlandColor: ");
    String[] elementsList = tampon.split(" ");
    return elementsList;
  }
  /**
   * this methods supress parts of a string.
   * @param toBeCut the string to have replacment
   * @param change the string to be suppressed
   * @return the new string
   *
   */
  public String stringReplacer(String toBeCut, String change) {
    return toBeCut.replace(change, "");
  }
  /**
   * this method adds all the elements in the file.
   * @throws IOException if file can't be created or open
   *
   *
   */
  public void print() throws IOException {
    addTitle();
    addClient();
    String[] description = parserDescription();
    String[] color = parserColor();
    addTree(description[0], color[0]);
    addDecorator(description, color);
    addPrice();
    close();
  }
}
