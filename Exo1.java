package initiation;

import java.util.Scanner;

public class exo01 {
	// Racine carree des nombres fournis en donnée .
	
	public static void main(String[] args) {
	double x ;
		Scanner Clavier = new Scanner(System.in);
	  do{ System.out.print ("donnez un nombre positif : ") ;
	      x = Clavier.nextDouble();
	      if (x < 0) { System.out.println ("svp positif") ;
	      continue ;
	      }
	      if (x>0) System.out.println ("sa racine carree est : " + Math.sqrt (x) ) ;
	    }while (x != 0) ;
	  }
}

