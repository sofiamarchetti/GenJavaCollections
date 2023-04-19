package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();


        for (int x=0 ;x < 5; x ++) {
            System.out.println("Entre com 5 cores: "); 
            String cor = ler.nextLine();
            cores.add(cor);
            }
            		
            Iterator<String> iterator = cores.iterator();
            System.out.println("\nListar todas as cores: ");
            
            while(iterator.hasNext()) {
            System.out.println(iterator.next());
            }
            		
            Collections.sort(cores);
            System.out.println("\nCores ordenadas:");
            System.out.println("\n"+cores);
           	}

}