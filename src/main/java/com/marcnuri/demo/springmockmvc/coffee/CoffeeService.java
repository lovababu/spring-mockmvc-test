/*
 * CoffeeService.java
 *
 * Created on 2018-05-20, 8:26
 */
package com.marcnuri.demo.springmockmvc.coffee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2018-05-20.
 */
@Service
public class CoffeeService {

//**************************************************************************************************
//  Fields
//**************************************************************************************************
  @Autowired //Not recommended - Demo test purposes
  private CoffeeRepository coffeeRepository;

//**************************************************************************************************
//  Constructors
//**************************************************************************************************

//**************************************************************************************************
//  Abstract Methods
//**************************************************************************************************

//**************************************************************************************************
//  Overridden Methods
//**************************************************************************************************

//**************************************************************************************************
//  Other Methods
//**************************************************************************************************

//**************************************************************************************************
//  Getter/Setter Methods
//**************************************************************************************************
  public List<String> getCoffees() {
    return coffeeRepository.findAll();
  }

//**************************************************************************************************
//  Static Methods
//**************************************************************************************************

//**************************************************************************************************
//  Inner Classes
//**************************************************************************************************

}
