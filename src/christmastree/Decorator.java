/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class used to augment christmasTree.
 * @author Yassine
 *
 */
public abstract class Decorator extends ChrismasTree {

  private ChrismasTree treeDecorator;

  /**
   * the constructor of the decorator.
   * @param treeDecorator the tree to be decorated
   *
   */
  public Decorator(ChrismasTree treeDecorator) {
    this.treeDecorator = treeDecorator;
  }

  // Getters and setters
  public ChrismasTree getTreeDecorator() {
    return treeDecorator;
  }

  public void setTreeDecorator(ChrismasTree treeDecorator) {
    this.treeDecorator = treeDecorator;
  }
}
