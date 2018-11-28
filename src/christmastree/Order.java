/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class which stores client and order info.
 * @author mohamad
 *
 */
public class Order {

  private String deliveryAddress;
  private String name;
  private String surname;
  private java.util.Date date = null;

  /**
   * ths constructor of the order class.
   * @param deliveryAddress the adress od delivery
   * @param name name of the client
   * @param surname surname of the client
   */
  public Order(String deliveryAddress, String name, String surname) {

    this.date = new java.util.Date();
    this.deliveryAddress = deliveryAddress;
    this.surname = surname;
    this.name = name;
  }

  public void setDeliveryAdress(String address) {
    this.deliveryAddress = address;
  }

  public String getDeliveryAddress() {
    return this.deliveryAddress;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return this.surname;
  }

  public java.util.Date getDate() {
    return this.date;
  }
}
