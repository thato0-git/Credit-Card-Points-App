/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut;

/**
 *
 * @author thato
 */
public class CreditCard {

    private String custFullName;
    private String custIdNo;
    private String custCellNo;
    private int custNoOfPurchase;
    private int custPointAccum;

    public CreditCard(String custFullName, String custIdNo, String custCellNo) {
        this.custFullName = custFullName;
        this.custIdNo = custIdNo;
        this.custCellNo = custCellNo;
        this.custPointAccum = 0;
        this.custNoOfPurchase = 0;
    }

    public CreditCard(String custFullName, String custIdNo, String custCellNo, int custNoOfPurchase, int custPointAccum) {
        setCustFullName(custFullName);
        setCustIdNo(custIdNo);
        setCustCellNo(custCellNo);
        setCustNoOfPurchase(custNoOfPurchase);
        setCustPointAccum(custPointAccum);
    }
       
       //default constructor
    public CreditCard() {
         
    }
    // public mutators

    

    public void setCustFullName(String custFullName) {
        if (custFullName == null || custFullName.split(",").length != 2) {
            throw new IllegalArgumentException("Full name must consist of a name and surname separated by a comma.");
        }
        String[] nameParts = custFullName.split(",");
        if (nameParts[0].trim().length() < 3 || nameParts[1].trim().length() < 3) {
            throw new IllegalArgumentException("Each part of the name must be at least three characters long.");
        }
        this.custFullName = custFullName;
    }

    public void setCustIdNo(String custIdNo) {
        if (!isValidSouthAfricanId(custIdNo)) {
            throw new IllegalArgumentException("Invalid South African ID number.");
        }
        this.custIdNo = custIdNo;
    }

    public void setCustCellNo(String custCellNo) {
        if (!isValidCellNumber(custCellNo)) {
            throw new IllegalArgumentException("Invalid cell number.");
        }
        this.custCellNo = custCellNo;
    }

    // private mutators
    private void setCustNoOfPurchase(int custNoOfPurchase) {

        this.custNoOfPurchase = custNoOfPurchase;
    }

    private void setCustPointAccum(int custPointAccum) {
        this.custPointAccum = custPointAccum;
    }

// validation method
    private boolean isValidSouthAfricanId(String idNumber) {
        return idNumber != null && idNumber.matches("\\d{13}");
    }

    private boolean isValidCellNumber(String cellNumber) {
        return cellNumber != null && cellNumber.matches("^[0-9]{10}$");
    }

    public String getcustFullName() {
        return custFullName;
    }

    public String getcustIdNo() {
        return custIdNo;
    }

    public String getcustCellNo() {

        return custCellNo;
    }

    public int getcustPointAccum() {
        return custPointAccum;
    }

    public int getcustNoOfPurchase() {
        return custNoOfPurchase;
    }

    public void cardPurchase(double amountSpent) {
        if (amountSpent < 0) {
            throw new IllegalArgumentException("Purchases amount cannot be negative.");
        }

        if (amountSpent <= 100) {
            custPointAccum += 5; // 5 points awarded

        } else if (amountSpent <= 500) {
            custPointAccum += 10; // 10 points awarded
        } else if (amountSpent <= 1800) {
            custPointAccum += 18; // 18 points awarded
        } else {
            custPointAccum += 25; // 25 points awarded
        }
        custNoOfPurchase++;
    }
}

