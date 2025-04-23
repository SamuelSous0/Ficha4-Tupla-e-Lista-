import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ficha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 01 Crie uma tupla com 5 nomes de frutas e exiba todos os elementos.
        //String[] frutas = {"Maça","Banana","Abacaxi","Melancia","Kiwi"};

        // 02 Peça ao usuário 3 números e armazene-os em uma tupla. Depois, mostre a tupla.
//        int[] nums = {1,2,3,};
//
//        System.out.println("Digite seu primeiro numero: ");
//        nums[0] = sc.nextInt();
//        System.out.println("Digite seu segundo numero: ");
//        nums[1] = sc.nextInt();
//        System.out.println("Digite seu terceiro numero: ");
//        nums[2] = sc.nextInt();
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        // 03 Crie uma lista com 4 nomes de alunos e exiba o segundo e o último nome da lista.
//        String[] nomesdealunos = {"Edmundo","Edmundo jr","Edmundo filho","Edmundo e furiosos"};
//
//        System.out.println(nomesdealunos[1]);
//        System.out.println(nomesdealunos[nomesdealunos.length-1]);

//         04 Peça 5 números ao usuário e armazene-os em uma lista. Em seguida, exiba a soma desses números.
//
//        System.out.println("Digite um numero: ");
//        int num = sc.nextInt();
//        System.out.println("Digite o segundo numero: ");
//        int num2 = sc.nextInt();
//        System.out.println("Digite o terceiro numero: ");
//        int num3 = sc.nextInt();
//
//        ArrayList<Integer> numeros = new ArrayList<>();
//        numeros.add(num);
//        numeros.add(num2);
//        numeros.add(num3);
//
//        int total = 0;
//
//        for (int i = 0; i < numeros.size(); i++) {
//            total = total + numeros.get(i);
//
//
//        }
//
//        System.out.println(total);

        // 6 Peça 4 notas ao usuário e armazene em uma lista. Depois, calcule a média e exiba.

//        double notas;
//        double total = 0;
//
//        ArrayList<Double> notas1periodo = new ArrayList<>();
//
//        for (int i = 1; i < 5; i++) {
//            System.out.print("Nota "+i+": ");
//            notas = sc.nextDouble();
//            notas1periodo.add(notas);
//            total += notas;
//        }
//
//        double media = total / notas1periodo.size();
//
//        System.out.println("Media: "+media);

        // 08  Peça uma lista de 5 números e diga qual é o maior, o menor e a soma total.

//        ArrayList<Double> numeros = new ArrayList<>();
//        double total = 0;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Digite o " + (i+1) + "º número: ");
//            numeros.add(sc.nextDouble());
//            total += numeros.get(i);
//        }
//        double maiornumero = numeros.get(0);
//        double menornumero = numeros.get(0);
//
//        for (int i = 0; i < numeros.size(); i++) {
//            if (numeros.get(i) > maiornumero) {
//                maiornumero = numeros.get(i);
//            }
//            if (numeros.get(i) < menornumero) {
//                menornumero = numeros.get(i);
//            }
//        }
//
//        System.out.println(maiornumero);
//        System.out.println(menornumero);

        // 09 Crie uma tupla com 5 números e verifique se um número digitado pelo usuário está na tupla.

//        int[] numeros = {10,8,7,5,4};
//
//        System.out.println("Digite um numero: ");
//        int numero = sc.nextInt();
//
//        for (int i = 0; i < numeros.length; i++) {
//            if (numero == numeros[i]) {
//                System.out.println("Acertou o numero " + numeros[i]);
//            }
//        }

        // 11 Crie uma lista de 10 números inteiros e remova todos os pares.
//            ArrayList<Integer> numerosImpares = new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//                int numAleatorio = (int) (Math.random() * 100);
//                numerosImpares.add(numAleatorio);
//            }
//
//        for (int i = 0; i < numerosImpares.size(); i++) {
//            System.out.println(numerosImpares.get(i));
//        }
//
//        System.out.println("""
//
//                NUMEROS IMPARES:
//
//                """);
//
//        for (int i = 0; i < numerosImpares.size(); i++) {
//            if (numerosImpares.get(i) % 2 != 0) {
//                System.out.println(numerosImpares.get(i));
//            }
//        }


        // 13 Crie uma tupla com os dias da semana e mostre apenas os dias úteis.

//        String[] diasDaSemana = {"Domingo","Segunda", "Terça", "Quarta" , "Quinta" , "Sexta" , "Sabado"};
//
//        System.out.println("Pode beber: " + diasDaSemana[0] + ", " + diasDaSemana[6] + " e " + diasDaSemana[5]);
//        System.out.println("Não pode beber: " + diasDaSemana[1] + ", " + diasDaSemana[2] + ", " + diasDaSemana[3] + " e " + diasDaSemana[4]);

        // 14 Dada uma lista com 5 nomes, peça ao usuário um nome e verifique se está presente na lista.

//        ArrayList<String> convidados = new ArrayList<>();
//        convidados.add("Edmundo");
//        convidados.add("Ed");
//        convidados.add("Edmundinho");
//
//        System.out.println("Boa noite! a reserva está em qual nome? ");
//        String nome = sc.nextLine();
//
//        boolean convidado = false;
//
//        for (int i = 0; i < convidados.size(); i++) {
//            if (convidados.get(i).equals(nome)) {
//                System.out.println(convidados.get(i) + " Seja bem vindo!");
//                convidado = true;
//            }
//        }
//
//        if (!convidado) {
//            System.out.println("Lamento, seu nome não está na lista");
//        }

        // 17 Peça ao usuário que digite nomes até que ele digite "sair". Mostre a lista ordenada dos nomes inseridos.

//        ArrayList<String> nomes = new ArrayList<>();
//        String nome = "";
//        while (!(nome.equalsIgnoreCase("SAIR"))) {
//            System.out.println("Digite um nome: ");
//            nome = sc.nextLine();
//            nomes.add(nome);
//        }
//
//        if (nomes.getLast().equalsIgnoreCase("SAIR")) {
//            nomes.removeLast();
//        }
//
//        Collections.sort(nomes);
//
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }

        // 19 Dada uma tupla com números, crie uma lista contendo apenas os valores maiores que 10.

//        int[] numeros = {50,40,30,20,10,15,2,4,3,1,9};
//
//        ArrayList<Integer> lista = new ArrayList<>();
//
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] > 10) {
//                lista.add(numeros[i]);
//            }
//        }
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }
        
    }
}