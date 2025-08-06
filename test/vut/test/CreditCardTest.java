/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;

import org.junit.Test;
import static org.junit.Assert.*;
import vut.CreditCard;

/**
 *
 * @author thato
 */
public class CreditCardTest {

    CreditCard objCreditcard = new CreditCard();

    @Test
    public void CreditCard() {

        objCreditcard.setCustIdNo("0502055597087"); // test the south african id 

    }

    @Test
    public void CreditCard1() {

        objCreditcard.cardPurchase(150.00);    //testing accumulation points
        objCreditcard.cardPurchase(5050.44);
        objCreditcard.cardPurchase(680.50);
        objCreditcard.cardPurchase(5050.44);

    }
    
    @Test
    
    public void CreditCard2(){
    
        objCreditcard.setCustCellNo("0783668855"); // test cellphone No
    }
    
    @Test
    public void CreditCard3(){
    
        objCreditcard.setCustFullName("Thato,Mokhuamathe"); // test name and surname
        
    }

}
