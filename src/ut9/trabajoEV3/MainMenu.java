package ut9.trabajoEV3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author daast
 */

public class MainMenu {
    // Versión 2018
    private ArrayList<IntoArrayList> menu = new ArrayList<IntoArrayList>();
    private int menuOption = 0;
    private Scanner teclado = new Scanner(System.in);


    public int getOpcion() {
        return menuOption;
    }

    public int getCodigo() {
        if (menu.isEmpty() == false)
            return menu.get(menuOption - 1).getMenuCode();
        else
            return 0;
    }

    public String getEntrada() {
        if (menu.isEmpty() == false)
            return menu.get(menuOption - 1).getUserInput();
        else
            return "N/A";
    }


    public void add(String entrada) {
        this.add(entrada, 0);
    }

    public void add(String entrada, int codigo) {
        menu.add(new IntoArrayList(entrada, codigo));
    }


    public class IntoArrayList {
        private String userInput = "";
        private int menuCode = 0;

        public IntoArrayList(String entrada, int codigo) {
            this.userInput = entrada;
            this.menuCode = codigo;
        }

        public String getUserInput() {
            return userInput;
        }

        public int getMenuCode() {
            return menuCode;
        }

        @Override
        public String toString() {
            return String.format("IntoArrayList [%-30s] (%4d)", this.userInput, this.menuCode);
        }

    }

    private int readMenuOption() {

        boolean sw = true;
        do {
            try {
                System.out.print("Option -> (1 - " + menu.size() + ") ");
                menuOption = Integer.parseInt(teclado.nextLine());
                if (!(menuOption >= 1 && menuOption <= menu.size()))
                    throw new Exception("Introduce un valor entre 1 y " + menu.size());
                sw = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (sw);
        System.out.println();
        return menuOption;
    }

    public int ver() {
        return this.ver("Menu");
    }

    public int ver(String head) {
        this.menuOption = 0;
        if (menu.size() == 0) return this.menuOption;

        // Encabezado
        System.out.println("\n" + head);
        for (int i = 1; i <= head.length(); i++)
            System.out.print("--");

        // Muestra el menu con las opciones
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("\n%3d. %s", i + 1, menu.get(i).getUserInput());
        }
        System.out.println();

        for (int i = 1; i <= head.length(); i++)
            System.out.print("--");
        System.out.println();

        return readMenuOption();
    }

    public boolean salirMenu() {
        return this.menuOption == menu.size();
    }

    @Override
    public String toString() {
        return "MainMenu";
    }

}
