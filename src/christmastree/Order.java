/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * the class which stores client and order info.
 * @author mohamad
 *
 */
public class Order {

  private Customer customer;
  private DeliveryAddress deliveryAddress;
  private java.util.Date date;

  /**
   * ths constructor of the order class.
   * @param deliveryAddress the adress od delivery
   * @param customer client
   */
  public Order(Customer customer, DeliveryAddress deliveryAddress) {

    this.date = new java.util.Date();
    this.deliveryAddress = deliveryAddress;
    this.customer = customer;
  }

  public void setDeliveryAdress(String address) {
    deliveryAddress.setAddress(address);
  }

  public String getDeliveryAddress() {
    return deliveryAddress.getAddress();
  }

  public void setName(String name) {
    customer.setName(name);
  }

  public String getName() {
    return customer.getName();
  }

  public void setSurname(String surname) {
    customer.setSurname(surname);
  }

  public String getSurname() {
    return customer.getSurname();
  }

  public java.util.Date getDate() {
    return this.date;
  }
}
