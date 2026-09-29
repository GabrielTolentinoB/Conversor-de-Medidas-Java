package com.gabrielprojetos.conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");
        System.out.println("seja bem vindo ao conversor.");

        Menu menu = new Menu(); //para chamar os menus dentro do arquivo menu.java
        int choice;
        int choiceIn;

        try (Scanner scanner = new Scanner(System.in)) {

            do {

                

                menu.menuPrincipal();


                choice = scanner.nextInt();
                scanner.nextLine();

				switch (choice) {
				
                case 1: 
                        menu.menuComprimento();

                    do {

                        choiceIn = scanner.nextInt();
                        scanner.nextLine();
						switch (choiceIn) {

						    case 1: {
                            System.out.println("");
                            System.out.println("Opção 1 Selecionada");

                            System.out.println("Digite o valor dos centímetros");
                            float n1 = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println();
                            System.out.println("O valor " + n1 + " en polegadas é:" + (n1 * 2.54));
                            menu.menuComprimento();

    							break;

							} case 2: {

                            System.out.println("");
                            System.out.println("Opção 2 Selecionada");

                            System.out.println("Digite o valor das polegadas");
                            float n1 = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println();
                            System.out.println("O valor " + n1 + " en polegadas é:" + (n1 / 2.54));
                            menu.menuComprimento();

							break;

                       		} case 3: {

                            System.out.println("");
                            System.out.println("Opção 3 Selecionada");

                            System.out.println("Digite o valor dos kilômetros");
                            float n1 = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println();
                            System.out.println("O valor " + n1 + " en polegadas é:" + (n1 / 0.621371));
                            menu.menuComprimento();							
                            break;

                        	} case 4: {

                            System.out.println("");
                            System.out.println("Opção 4 Selecionada");

                            System.out.println("Digite o valor das milhas");
                            float n1 = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println();
                            System.out.println("O valor " + n1 + " en polegadas é:" + (n1 * 0.621371));
                            menu.menuComprimento();
							break;

                        	} case 5: {
                            break;
                        	} default: {
                            System.out.println("Digite um número válido");
                        	}
						}	

                    } while (choiceIn != 5);
                    break;

				
                case 2:
                    menu.menuMassa();

                    do {
                        choiceIn = scanner.nextInt();
                        scanner.nextLine();
						
                        switch (choiceIn) {
                            case 1: {


                                
                                break;

                            } case 2: {


                                
                                break;

                            } case 3: {
                               
                                break;

                            } default: {
                                System.out.println("Digite um número válido");
                        	}
                        }
                    } while (choiceIn != 3)
					break;

                case 3:
                    System.out.println("Qual das operações deseja realizar?");
                    System.out.println("1 - Celcius para Farenhaitz");
                    System.out.println("2 - Farenhaitz para Celcius");
                    choiceIn = scanner.nextInt();
                    scanner.nextLine();

					break;

                case 4:
                    System.out.println("Qual das operações deseja realizar?");
                    System.out.println("1 - Minutos para Horas");
                    System.out.println("2 - Horas para Minutos");
                    choiceIn = scanner.nextInt();
                    scanner.nextLine();

					break;

                case 5:
                    break;
                default:
                    System.out.println("Digite um número válido");
                }

            } while (choice != 5);
		}
	}
}
