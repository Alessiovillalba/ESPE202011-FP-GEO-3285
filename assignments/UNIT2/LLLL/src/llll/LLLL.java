/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llll;

import java.util.Scanner;

/**
 *
 * @author Alessio
 */
public class LLLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base;
        float percentage;
        float total;
        float IVA;
        float SurplusFractionTax = 0.0F;
        float value;
        float NetIncome;

        Scanner input = new Scanner(System.in);
        System.out.println("----IVA CALCULATOR -----");
        System.out.println("Enter the subtotal--");
        base = getIVA(input);

        System.out.println("The total is--" + base);
        System.out.println("=======================");

        System.out.println("INCOME TAX CALCULATOR");
        System.out.println("Enter NetIncome");
        NetIncome = input.nextFloat();

        if (NetIncome < 11212) {
            SurplusFractionTax = 0;
            value = NetIncome;
            System.out.println("The Income Tax is-- " + value);
        } else if (NetIncome >= 11212) {
            if (NetIncome < 14205) {
                SurplusFractionTax = 5;
                value = (float) (NetIncome * 1.05);
                System.out.println("The Income Tax is-- " + value);

            } else if (NetIncome >= 14205) {
                if (NetIncome < 17854) {
                    SurplusFractionTax = 10;
                    value = (float) (NetIncome * 1.1);
                    System.out.println("The Income Tax is-- " + value);

                } else if (NetIncome >= 17854) {
                    if (NetIncome < 21442) {
                        SurplusFractionTax = 12;
                        value = (float) (NetIncome * 1.12);
                        System.out.println("The Income Tax is-- " + value);
                    } else if (NetIncome >= 21442) {
                        if (NetIncome < 42874) {
                            SurplusFractionTax = 15;
                            value = (float) (NetIncome * 1.15);
                            System.out.println("The Income Tax is-- " + value);
                        } else if (NetIncome >= 42874) {
                            if (NetIncome < 64297) {
                                SurplusFractionTax = 20;
                                value = (float) (NetIncome * 1.2);
                                System.out.println("The Income Tax is-- " + value);
                            } else if (NetIncome >= 64297) {
                                if (NetIncome < 85729) {
                                    SurplusFractionTax = 25;
                                    value = (float) (NetIncome * 0.25);
                                    System.out.println("The Income Tax is-- " + value);
                                } else if (NetIncome >= 85729) {
                                    if (NetIncome < 114288) {
                                        SurplusFractionTax = 30;
                                        value = (float) (NetIncome * 1.3);
                                        System.out.println("The Income Tax is-- " + value);
                                    } else if (NetIncome >= 114288) {
                                        SurplusFractionTax = 35;
                                        value = (float) (NetIncome * 1.35);
                                        System.out.println("The Income Tax is-- " + value);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static float getIVA(Scanner input) {
        float base;
        float IVA;
        base = input.nextFloat();
        if (base > 100) {
            base = (float) (base + (base * 0.12));
        }
        IVA = (float) (base * 0.12);
        System.out.println("The IVA is--" + IVA);
        return base;

    }
}
    }
    
}
