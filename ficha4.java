import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
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

        // 05 Crie um dicionário com 3 pares de chave e valor representando nome e idade de pessoas. Mostre todas as idades.

//        HashMap<String, Integer> pessoa = new HashMap<>();
//        pessoa.put("Edmundo", 27);
//        pessoa.put("Edmundo: o ultimo dobrador de ar", 15);
//        pessoa.put("Kung FU Edmundo", 10);
//
//        for(String i : pessoa.keySet() ) {
//            System.out.println(i + ": " + pessoa.get(i));
//        }

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

        // 07 Peça o nome de 3 produtos e seus respectivos preços e armazene em um dicionário. Mostre os produtos mais caros.

//        HashMap<String, Double> produto  = new HashMap<>();
//
//        produto.put("Carta do tigrinho", 999.99);
//        produto.put("Naipe", 15.0);
//        produto.put("Puxe", 7.50);
//
//        double produtomaiscaro = 0;
//        String chaveprodutomaiscaro = "";
//
//
//
//        for (String i : produto.keySet()) {
//            if (produto.get(i) > produtomaiscaro) {
//                produtomaiscaro = produto.get(i);
//                chaveprodutomaiscaro = i;
//
//            }
//        }
//
//        System.out.println(chaveprodutomaiscaro);





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

        //  10 Crie um dicionário com 4 nomes e notas de alunos. Calcule e mostre a média geral da turma.

//        HashMap<String, Double> aluno = new HashMap<>();
//
//        aluno.put("Edmundo", 10.0);
//        aluno.put("Edzinh", 7.5);
//        aluno.put("Edzão", 9.0);
//        aluno.put("Ed", 4.0);
//
//        double total = 0;
//
//        for (Double i : aluno.values()) {
//            total += i;
//        }
//
//        double mediaturma = total/aluno.size();
//
//        System.out.println(mediaturma);

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

        // 12 Solicite ao usuário 3 pares de chave e valor e crie um dicionário a partir dessas entradas.

//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter name " + (i+1) + ": ");
//            String name = sc.nextLine();
//            System.out.print("Enter number " + (i+1) + ": ");
//            int number = sc.nextInt();
//            sc.nextLine();
//            map.put(name, number);
//        }
//
//        for (String i : map.keySet()) {
//            System.out.println(i+" "+map.get(i));
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

        // 16 Crie duas listas: uma com nomes e outra com idades. Junte essas listas em um dicionário

//        ArrayList<String> nomes = new ArrayList<>();
//        ArrayList<Integer> idade = new ArrayList<>();
//        HashMap<String, Integer> map = new HashMap<>();
//
//        System.out.println("Digite a quantidade de alunos: ");
//        int quantidade = sc.nextInt();
//
//        for (int i = 0; i < quantidade; i++) {
//            System.out.println("Digite o nome do aluno "+(i+1)+": ");
//            nomes.add(sc.next());
//            System.out.println("Digite a idade do aluno "+(i+1)+": ");
//            idade.add(sc.nextInt());
//        }
//
//        for (int i = 0; i < nomes.size(); i++) {
//            map.put(nomes.get(i), idade.get(i));
//        }
//
//        for(String id : map.keySet()) {
//            System.out.println(id + " - " + map.get(id) + " anos");
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

        // 18 Crie um dicionário com 5 cidades e suas temperaturas. Mostre a cidade mais quente.

//        HashMap<String, Double> cidade = new HashMap<>();
//        cidade.put("Curitiba", -10.0);
//        cidade.put("Recife", 40.0);
//        cidade.put("Xique-Xique", 15.0);
//
//        String cidademaisquente = "";
//        ArrayList<Double> valores = new ArrayList<>();
//
//        for (String i : cidade.keySet()) {
//            valores.add(cidade.get(i));
//        }
//
//        Collections.sort(valores);
//
//        System.out.println(valores.getLast());



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

        // 20 Peça ao usuário que informe nomes e idades de pessoas. Armazene em um dicionário. Em seguida, exiba o nome da pessoa mais velha.

//        HashMap<String, Integer> map = new HashMap<>();
//
//        System.out.println("Enter the number of elements in the map");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the element " + i + ": ");
//            String key = sc.next();
//            System.out.println("Enter the value " + i + ": ");
//            int value = sc.nextInt();
//            sc.nextLine();
//            map.put(key, value);
//        }
//
//        String oldestName = "";
//        int oldestAge = -1;
//
//
//       for (String key : map.keySet()) {
//            int age = map.get(key);
//            if (age > oldestAge) {
//                oldestAge = age;
//                oldestName = key;
//            }
//       }
//
//        System.out.println("The oldest person is: " + oldestName + " (" + oldestAge + " years old)");


    }
}
