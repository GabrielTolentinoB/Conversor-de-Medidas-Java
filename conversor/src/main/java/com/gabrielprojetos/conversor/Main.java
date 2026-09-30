apackage com.gabrielprojetos.conversor;

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
                                    System.out.println("O valor " + n1 + " em polegadas é:" + (n1 / 2.54));
                                    menu.menuComprimento();

                                    break;

                                }
                                case 2: {

                                    System.out.println("");
                                    System.out.println("Opção 2 Selecionada");

                                    System.out.println("Digite o valor das polegadas");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println();
                                    System.out.println("O valor " + n1 + " em centimetros é:" + (n1 * 2.54));
                                    menu.menuComprimento();

                                    break;

                                }
                                case 3: {

                                    System.out.println("");
                                    System.out.println("Opção 3 Selecionada");

                                    System.out.println("Digite o valor dos kilômetros");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println();
                                    System.out.println("O valor " + n1 + " en milhas é:" + (n1 / 0.621371));
                                    menu.menuComprimento();
                                    break;

                                }
                                case 4: {

                                    System.out.println("");
                                    System.out.println("Opção 4 Selecionada");

                                    System.out.println("Digite o valor das milhas");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println();
                                    System.out.println("O valor " + n1 + " en kilômetros é:" + (n1 * 0.621371));
                                    menu.menuComprimento();
                                    break;

                                }
                                case 5: {
                                    break;
                                }
                                default: {
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
                                    System.out.println("");
                                    System.out.println("Opção 1 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor dos kilos");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em libras é: "+ ( n1 * 2.20));
                                    menu.menuMassa();
                                    break;

                                }
                                case 2: {
                                    System.out.println("");
                                    System.out.println("Opção 2 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor das libras");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em kilos é: "+ ( n1 / 2.20));
                                    menu.menuMassa();
                                    break;

                                }
                                case 3: {
                                    break;
                                
                                }

                                default: {
                                    System.out.println("Digite um número válido");
                                }
                            }
                        } while (choiceIn != 3);
                        break;

                    case 3:
                        menu.menuTemperatura();

                        do {
                            choiceIn = scanner.nextInt();
                            scanner.nextLine();

                            switch (choiceIn) {
                                case 1: {
                                    System.out.println("");
                                    System.out.println("Opção 1 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor em celcius");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em fahrenheit é: " + ((n1 * (9/5)) + 32));
                                    menu.menuTemperatura();
                                    break;

                                }
                                case 2: {
                                    System.out.println("");
                                    System.out.println("Opção 2 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor em fahrenheit");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em celcius é: " + (( n1 − 32) * (5/9)));
                                    menu.menuTemperatura();
                                    break;

                                }
                                case 3: {

                                    break;

                                }
                                default: {
                                    System.out.println("Digite um número válido");
                                }
                            }
                        } while (choiceIn != 3);
                        break;

                    case 4:
                        menu.menuTempo();

                        do {
                            choiceIn = scanner.nextInt();
                            scanner.nextLine();

                            switch (choiceIn) {
                                case 1: {
                                    System.out.println("");
                                    System.out.println("Opção 1 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor em minutos");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em Horas são: " + (n1 / 60));
                                    menu.menuTempo();
                                    break;

                                }
                                case 2: {
                                    System.out.println("");
                                    System.out.println("Opção 1 Selecionada");

                                    System.out.println("");
                                    System.out.println("Digite o valor em horas");
                                    float n1 = scanner.nextFloat();
                                    scanner.nextLine();

                                    System.out.println("O valor " + n1 + "em minutos são: " + (n1 * 60));
                                    menu.menuTempo();
                                    break;

                                }
                                case 3: {

                                    break;

                                }
                                default: {
                                    System.out.println("Digite um número válido");
                                }
                            }
                        } while (choiceIn != 3);
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
