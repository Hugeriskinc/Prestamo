package Prestamo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Console;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CLamortizacion 
{
    public static void main(String[] args) 
    {
        Scanner sn= new Scanner(System.in);
        
        double Monto;
        double Interes,interes,capital;
        int Plazo;
        double cuota;
        double saldo;
        String am = null;
        
        System.out.println("Monto del prestamo: ");
        Monto=sn.nextDouble();
        System.out.println("Tasa interes del prestamo: ");
        Interes=sn.nextDouble();
        System.out.println("Plazo del prestamo en meses: ");
        Plazo=sn.nextInt();
        System.out.println("\n");
        
        for(int x=0;x<am.length();x++)
        {
            saldo=Monto;
            interes=saldo*Interes;
            capital=saldo/Plazo;
            cuota=interes+capital;
            Monto=saldo-cuota;
            
            
            saldo=0;
            interes=0;
            capital=0;
            Monto=0;
        }
        
       
        
    }
    
    public void Consultar(String lengthS, String principalS, String interestS) { 
   
    double Monto = Double.parseDouble(principalS); 
    int Plazo = Integer.parseInt(lengthS); 
    double interest = Double.parseDouble(interestS);

    double monthlyInterest = interest / (12 * 100); 
    double monthlyPayment = Monto * ( monthlyInterest / ( 1 - Math.pow((1 + monthlyInterest), (Plazo*-1))));

    final int PAYMENT_WIDTH = 15; 
    final int AMOUNT_WIDTH = 15; 
    final int PRINCIPAL_WIDTH = 15; 
    final int INTEREST_WIDTH = 15; 
    final int BALANCE_WIDTH = 15;

    String pattern = "%" + PAYMENT_WIDTH + "s%" + AMOUNT_WIDTH + "s%" + PRINCIPAL_WIDTH + "s%" + INTEREST_WIDTH + "s%" + BALANCE_WIDTH + "s";

    System.out.printf(pattern, "PAYMENT", "AMOUNT", "PRINCIPAL", "INTEREST", "BALANCE"); System.out.println();

    NumberFormat nf = NumberFormat.getCurrencyInstance();

        for (int x = 1; x <= Plazo; x++) { 
        double amountInterest = Monto * monthlyInterest; 
        double amountPrincipal = monthlyPayment - amountInterest; Monto = Monto - amountPrincipal;

        System.out.printf(pattern, x, nf.format(monthlyPayment), nf.format(amountPrincipal), nf.format(amountInterest), nf.format(Monto));
        System.out.println();

        }

     }
    
}
