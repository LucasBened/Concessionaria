
// package packageLogin;
// import java.util.Scanner;

// public class Carros {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] aluguelCompraOpt = {"Alugar", "Comprar"};
//         String[] estadoOpt = {"Novo", "Seminovo", "Usado"};
//         String[] tipoCarroOpt = {"Sedan", "SUV", "Esportivo"};
//         String[] lugaresOpt = {"2 Lugares", "5 Lugares", "7 Lugares"};
//         String[] motorOpt = {"1.0", "1.4", "1.6", "2.0 ou Mais"};
//         String[] marcaOpt = {"Renault", "Volkswagen", "Honda", "Fiat", "Ford", "Porsche", "Jeep"};
//         String[] cambioOpt = {"Automático", "Manual"};
//         String[] arOpt = {"Ar Condicionado", "Nenhum"};
//         String[] windowOpt = {"Automático", "Manual"};

//         SistemaCarros[] carros = new SistemaCarros[3]; // Ajuste o tamanho conforme necessário

//         for (int k = 0; k < carros.length; k++) {
//             String[] escolhas = new String[9];

//             for(int i = 0; i < 8; i++) {
//                 switch(i) {
//                     case 0:
//                         System.out.println("COLOCAR PARA ALUGAR/COMPRAR");
//                         for(int j = 0; j < aluguelCompraOpt.length; j++)
//                             System.out.println((j+1) + "- " + aluguelCompraOpt[j]);
//                         break;
//                     case 1:
//                         System.out.println("QUAL O ESTADO DO CARRO?");
//                         for(int j = 0; j < estadoOpt.length; j++)
//                             System.out.println((j+1) + "- " + estadoOpt[j]);
//                         break;
//                     case 2:
//                         System.out.println("QUAL O TIPO DO CARRO?");
//                         for(int j = 0; j < tipoCarroOpt.length; j++)
//                             System.out.println((j+1) + "- " + tipoCarroOpt[j]);
//                         break;
//                     case 3:
//                         System.out.println("QUANTIDADE DE LUGARES DO CARRO");
//                         for(int j = 0; j < lugaresOpt.length; j++)
//                             System.out.println((j+1) + "- " + lugaresOpt[j]);
//                         break;
//                     case 4:
//                         System.out.println("QUAL O MOTOR DO CARRO?");
//                         for(int j = 0; j < motorOpt.length; j++)
//                             System.out.println((j+1) + "- " + motorOpt[j]);
//                         break;
//                     case 5:
//                         System.out.println("QUAL A MARCA DO CARRO?");
//                         for(int j = 0; j < marcaOpt.length; j++)
//                             System.out.println((j+1) + "- " + marcaOpt[j]);
//                         break;
//                     case 6:
//                         System.out.println("QUAL O CâMBIO DO CARRO?");
//                         for(int j = 0; j < cambioOpt.length; j++)
//                             System.out.println((j+1) + "- " + cambioOpt[j]);
//                         break;
//                     case 7:
//                         System.out.println("QUAL O AR DO CARRO?");
//                         for(int j = 0; j < arOpt.length; j++)
//                             System.out.println((j+1) + "- " + arOpt[j]);
//                         break;
//                     case 8:
//                         System.out.println("COMO É A JANELA DO CARRO?");
//                         for(int j = 0; j < windowOpt.length;j++)
//                             System.out.println((j+1) + "- " + windowOpt[j]);
//                         break;
//                 }
//                 System.out.println("Selecione a opção:");
//                 int escolha = sc.nextInt();
//                 escolhas[i] = Integer.toString(escolha);
//             }

//             System.out.println("Informe o preço do carro:");
//             escolhas[8] = sc.next();

//             carros[k] = new SistemaCarros(
//                 aluguelCompraOpt[Integer.parseInt(escolhas[0]) - 1],
//                 estadoOpt[Integer.parseInt(escolhas[1]) - 1],
//                 tipoCarroOpt[Integer.parseInt(escolhas[2]) - 1],
//                 lugaresOpt[Integer.parseInt(escolhas[3]) - 1],
//                 motorOpt[Integer.parseInt(escolhas[4]) - 1],
//                 marcaOpt[Integer.parseInt(escolhas[5]) - 1],
//                 cambioOpt[Integer.parseInt(escolhas[6]) - 1],
//                 arOpt[Integer.parseInt(escolhas[7]) - 1],
//                 windowOpt[Integer.parseInt(escolhas[8]) - 1],
//                 escolhas[8]
//             );

//             System.out.println("SistemaCarros registrado:\n" + carros[k].toString());
//         }

//         sc.close();
//     }
// }