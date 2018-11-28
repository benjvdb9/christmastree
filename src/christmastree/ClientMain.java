/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * this is the main class.
 * @author Yassine
 *
 */
public class ClientMain {



  Scanner scan = new Scanner(System.in);


  /**
   * the order returned contains the client's info; the delivery adress and when it was done.
   * @param asker the class that pass a user input as a variable
   * @return the order class
   *
   *
   */
  public static Order makeOrder(AskString asker) {


    String name = asker.ask("Client's name :");
    String surname = asker.ask("Client's surname :");
    String deliveryAdress = asker.ask("Client's adress :");
    Order order = new Order(deliveryAdress, name, surname);
    return order;
  }

  /**
   * this class is used to choose which decoration to be added on the tree.
   * @param asker the class that pass a user input as a variable
   * @param chrismasTree the christmastree to be augmented
   * @param choiceTree the type of tree chosen
   *
   *@return the decorated chrismastree
   */
  public static Decorator treeDecorationStandard(ChrismasTree chrismasTree,
                                                 AskString asker, String choiceTree) {
    Decorator decoration = null;
    Decorator manyDecoration = null;
    // Decorator Options

    String choiceDecoration;
    do {
      System.out.println("Decorator Options: ");
      System.out.println("a: Balls");
      System.out.println("b: Garland");
      if (choiceTree.equals("a")) {
        System.out.println("c: Candle");
      }
      System.out.println("q: Quit");
      choiceDecoration = asker.ask("Choose a decoration please: ");

      switch (choiceDecoration) {
        case "a":
        {
          if (manyDecoration == null) {
            decoration = new Balls(chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Balls(manyDecoration);
          }

          // display
          System.out.println(decoration.toString());
        }
          break;

        case "b":
        {
          System.out.println("Garland Options: ");
          System.out.println("a: Electric Garland");
          System.out.println("b: Synthetic Garland");
          System.out.println("q: Finish");
          String garlandOption;
          do {
            System.out.println("Choose a Garland decorations options : ");
            garlandOption = asker.ask("Choose a Garland decorations options : ");

            switch (garlandOption) {
              case "a": {

                if (manyDecoration == null) {
                  decoration = new ElectricGarland(chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration = new ElectricGarland(manyDecoration);
                }

                // display
                System.out.println(decoration.toString());
              }
                break;

              case "b":
              {

                if (manyDecoration == null) {
                  decoration = new SyntheticGarland(chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration = new SyntheticGarland(manyDecoration);
                }

                // dispaly
                System.out.println(decoration.toString());
              }
                break;
              default:
                break;
            } // end of switch
          } while (!garlandOption.equals("q")); // end of loop
        }
          break;

        case "c":
        {
          
          if (manyDecoration == null) {
            decoration = new Candle(chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Candle(manyDecoration);
          }

          // dispaly
          System.out.println(decoration.toString());
        }
          break;

        default:
          break;
      } // end of switch
    } while (!choiceDecoration.equals("q")); // end of loop
    return decoration;
  }

  /**
   * this class allows for choosing a personalized decoration.
   * @param asker the class that pass a user input as a variable
   * @param chrismasTree the ree to be personalized
   * @param choiceTree the type of tree chosen
   *
   * @return the decorated chrismastree
   */
  public static Decorator treeDecorationPersonalized(ChrismasTree chrismasTree,
                                                     AskString asker, String choiceTree) {
    Decorator decoration = null;
    Decorator manyDecoration = null;
    String choiceDecoration;


    do {

      // Decorator Options
      System.out.println("Decorator Options: ");
      System.out.println("a: Balls");
      System.out.println("b: Garland");
      if (choiceTree.equals("a")) {
        System.out.println("c: Candle");
      }
      System.out.println("q: Quit");
      choiceDecoration = asker.ask("Choose a decoration please: ");

      // Decorator data(description)
      String description = asker.ask("description: ");

      double price = asker.askDouble("price: ");

      String color = asker.ask("color: ");

      switch (choiceDecoration) {
        case "a": /* Balls*/ {
          String material = asker.ask("material: ");

          String size = asker.ask("size: ");

          if (manyDecoration == null) {
            decoration = new Balls(color, description, price, material, size, chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = new Balls(color, description, price, material, size, manyDecoration);
          }

          // display
          System.out.println(decoration.toString());
        }
          break;

        case "b": /* Garland*/ {
          String garlandOption;
          do {
            System.out.println("Garland Options: ");
            System.out.println("a: Electric Garland");
            System.out.println("b: Synthetic Garland");
            System.out.println("q: Finish");
            garlandOption = asker.ask("Choose a Garland decorations options : ");

            double garlandLength = asker.askDouble("length : ");

            switch (garlandOption) {
              case "a": // Electric Garland
                boolean hasBlink = asker.askBool("hasBlink true or false : ");
                if (manyDecoration == null) {
                  decoration =
                      new ElectricGarland(
                          color, description, price, hasBlink, garlandLength, chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration =
                      new ElectricGarland(
                          color, description, price, hasBlink, garlandLength, manyDecoration);
                }

                // display
                System.out.println(decoration.toString());
                break;

              case "b": // Synthetic Garland
                String paillette = asker.ask("paillette : ");

                if (manyDecoration == null) {
                  decoration =
                      new SyntheticGarland(
                          paillette, color, description, price, garlandLength, chrismasTree);
                  manyDecoration = decoration;
                } else {
                  decoration =
                      new SyntheticGarland(
                          paillette, color, description, price, garlandLength, manyDecoration);
                }

                // dispaly
                System.out.println(decoration.toString());
                break;
              default:
                break;

            } // end of switch
          } while (!garlandOption.equals("q")); // end of loop
        }
            break;

        case "c": {
          int lifeTime = asker.askInt("LifeTime : ");

          String parfum = asker.ask("Parfum : ");

          if (manyDecoration == null) {
            decoration = 
                    new Candle(
                            color, description, price, lifeTime, parfum, chrismasTree);
            manyDecoration = decoration;
          } else {
            decoration = 
                    new Candle(
                            color, description, price, lifeTime, parfum, manyDecoration);
          }

          // dispaly
          System.out.println(decoration.toString());
        }
          break;
        default :
          break;
      } // end of switch
    } while (!choiceDecoration.equals("q")); // end of loop
    return decoration;
  }

  /**
   * the class main to be used by the retailer.
   * @param args to be entered by the user
   * @throws IOException if a file can't be created
   */
  public static void main(String[] args) throws IOException {
    AskString asker = new AskString(System.in, System.out);
    Order order = makeOrder(new AskString(System.in, System.out));
    int flag = 0;
    ChrismasTree tree = null;
    String choiceTree = null;


    do {
      // Menu of Command Options
      System.out.println("Command Options: ");
      System.out.println("a: Natural tree");
      System.out.println("b: Artificial tree");
      System.out.println("q: Finish ");

      // read the choice
      choiceTree = asker.ask("Choose an option please: ");

      // Menu to choose type ommand (tree) personalized or standard
      System.out.println("Commande de choix: ");
      System.out.println("1: Standard");
      System.out.println("2: personalized");
      System.out.println("q: Finish ");

      // read the choice
      String commandType = asker.ask("Choose type of command: ");

      switch (commandType) {
        case "1": {
          flag = 1;
          switch (choiceTree) {
            case "a": {
              tree = new NaturalTree();
              treeDecorationStandard(tree,new AskString(System.in, System.out),choiceTree);
            }
              break;

            case "b": {
              tree = new ArtificialTree();
              treeDecorationStandard(tree,new AskString(System.in, System.out),choiceTree);
            }
              break;
            default:
              break;
          }
        }
            break;

        case "2":
        {
          flag = 1;
          switch (choiceTree) {
            case "a": {
              tree = new NaturalTree();
              treeDecorationPersonalized(tree,new AskString(System.in, System.out),choiceTree);
            }
                break;

            case "b": {
              tree = new ArtificialTree();
              treeDecorationPersonalized(tree,new AskString(System.in, System.out),choiceTree);
            }
              break;
            default:
              break;
          }
        }
          break;
        default:
          break;
      }

    } while (!choiceTree.equals("q")  && flag == 0); // end of loop
    Bill bill = new Bill(tree, order, Paths.get(".").toAbsolutePath().normalize().toString());
    bill.print();

 

  }
}
