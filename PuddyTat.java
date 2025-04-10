import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner foods = new Scanner(System.in);
    System.out.println("--------------------------------------------------------");
    System.out.println("                     ~ Prices ~                         ");
    System.out.println("Chorley Cat Cakes:           $ 2.00 for 9 or $ 0.25 each");
    System.out.println("Tweety's Tasty Turnovers:   $ 4.00 for 12 or $ 0.75 each");
    System.out.println("Purrfect Puff Pastries:                      $ 0.75 each");
    System.out.println("Cedric Tiger Tails:                          $ 1.00 each");
    System.out.println("--------------------------------------------------------");
    
    System.out.println("");
    System.out.println("");

    System.out.print("How Many Chorley Cat Cakes? ");
    int cakes = foods.nextInt();
        
    System.out.println("");
    
    System.out.print("How Many Tweety's Tasty Turnovers? ");
    int turnovers = foods.nextInt();
    
    System.out.println("");
    
    System.out.print("How Many Purrfect Puff Pastries? ");
    int pastries = foods.nextInt();

    System.out.println("");

    System.out.print("How Many Cedric Tiger Tails? ");
    int tails = foods.nextInt();
    
    System.out.println("");

    System.out.print("How Many People Are Under 5? ");
    int children = foods.nextInt();

    System.out.println("");
    System.out.println("");

    double totalCakes = 0.0;
    double totalTurnovers = 0.0;
    double totalPastries = 0.0;
    double totalTails = 0.0;

    if (cakes >= 9){
      double cakeBulk = cakes / 9;
      double cakeRemainder = cakes % 9;
      totalCakes = (2 * cakeBulk) + (.25 * cakeRemainder) ;
      System.out.print("Cakes: " + cakes + " = ");
      System.out.printf("$ %.02f%n", totalCakes);
      System.out.println("");
    } else {
      totalCakes = (cakes * .25);
      System.out.print("Cakes: " + cakes + " * $ 0.25 = ");
      System.out.printf("$ %.02f%n", totalCakes);
      System.out.println("");
    }

    double turnoverBulk = 0;
    double turnoverRemainder = 0;
    double turnoverDiscount = 0;

    if(turnovers >= 25) {
      turnoverBulk = cakes / 12;
      turnoverRemainder = cakes % 12;
      totalTurnovers = (4 * turnoverBulk) + (.25 * turnoverRemainder);
      turnoverDiscount = (totalTurnovers * .1);
      totalTurnovers = totalTurnovers - turnoverDiscount;
      System.out.print("Turnovers: " + turnovers + " = ");
      System.out.printf("$ %.02f%n", totalTurnovers + " (10% discount!");
      System.out.println("");
    } else if (turnovers >= 12 && turnovers < 25){
      turnoverBulk = cakes / 12;
      turnoverRemainder = cakes % 12;
      totalTurnovers = (4 * turnoverBulk) + (.25 * turnoverRemainder) ;
      System.out.print("Turnovers: " + turnovers + " = ");
      System.out.printf("$ %.02f%n", totalTurnovers);
      System.out.println("");
    } else {
      totalTurnovers = (turnovers * .50);
      System.out.print("Turnovers: " + turnovers + " * $ 0.50 = ");
      System.out.printf("$ %.02f%n", totalTurnovers);
      System.out.println("");
    }

    totalPastries = (pastries * .75);
      
    System.out.print("Pastries: " + pastries + " * $ 0.75 = ");
    System.out.printf("$ %.02f%n", totalPastries);
    System.out.println("");

    totalTails = (tails * 1);
    System.out.print("Tails: " + tails + " * $ 1.00 = ");
    System.out.printf("$ %.02f%n", totalTails);
    System.out.println("");

    double subtotal = (totalCakes + totalTurnovers + totalPastries + totalTails);
    //Contains subtotal (prices of all food)

    System.out.println(" ");
    
    //System.out.println("Subtotal: $ " + subtotal);
    System.out.printf("Subtotal: $ %.02f%n", subtotal);
    //Displays subtotal

    System.out.println("--------------------------------------------------------");
    
    double tax = (subtotal * 0.065);
    //My true tax value 
    
    int cents = (int)(tax * 100 + 0.5);
    double rounded = (cents / 100.0);
    //Formula used to give a rounded tax value
    
    System.out.println("Tax (6.5%): $ " + rounded);

    System.out.println("--------------------------------------------------------");

    double total = (subtotal + rounded);
    //combines values of subtotal and tax
    
    //System.out.println("Total: $   " + total);
    System.out.printf("Total: $ %.02f%n", total);
    //Displays the total value, includes subtotal and tax combined
    System.out.println("");
    System.out.println("");
    System.out.println("");

    
    System.out.print("Amount Given: $ ");
    double given = foods.nextDouble();
//The amount of money given for order

    System.out.println("");
    double change = given - total;
    System.out.printf("Change: $ %.02f%n", change);
//The amount of change given back

    System.out.println("");

    int totalCoins = (int)(change * 100);
    //total change in cents

    
    int dollars = totalCoins/100;
    totalCoins = totalCoins - (100 *dollars);
    
    int quarters = totalCoins/25;
    totalCoins = totalCoins - (25 * quarters);
    
    int dimes = totalCoins/10;
    totalCoins = totalCoins - (10 *dimes);

    
    int nickels = totalCoins/5;
    totalCoins = totalCoins - (5 * nickels);

      
    int pennies = totalCoins/1;

      
    //remaining change in coins data

    System.out.println("Dollars: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
    //display remaining change in coins

    System.out.println("--------------------------------------------------------");
    System.out.println("                       --Thank You!--                   ");
    System.out.println("--------------------------------------------------------");
    //Thank You Message
  }
}
