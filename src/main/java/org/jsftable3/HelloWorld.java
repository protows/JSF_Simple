/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jsftable3;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}