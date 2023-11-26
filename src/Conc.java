import java.util.Scanner;
import packageLogin.SistemaDeLogin;
import packageLogin.SistemaCarros;

public class Conc {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SistemaCarros[] carrosDisponiveis = new SistemaCarros[10];
        SistemaDeLogin siLoginCliente = new SistemaDeLogin();
        SistemaDeLogin.ArmazenamentoDeContas armazenarConta = siLoginCliente.new ArmazenamentoDeContas();
        SistemaDeLogin siLoginEmpresa = new SistemaDeLogin();
        SistemaDeLogin.ArmazenamentoDeContas armazenarContaEmpresa = siLoginEmpresa.new ArmazenamentoDeContas();
        String loginCliente, senhaCliente, loginEmpresa, senhaEmpresa;
        int opt;
        int tipoLogin = 0;

        do {
            System.out.println("Você deseja iniciar sessão ou registrar uma nova conta? \n 1 - Registrar \n 2 - Iniciar sessão \n 3 - Sair");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Você deseja criar uma conta para empresa ou cliente? \n 1- Empresa \n 2 - Cliente");
                    int tipoConta = sc.nextInt();
                    if (tipoConta == 1) {
                        System.out.println("====REGISTRAR EMPRESA====");
                        System.out.print("Insira o nome da empresa: ");
                        loginEmpresa = sc.next();
                        System.out.print("Insira a senha: ");
                        senhaEmpresa = sc.next();
                        for (int i = 0; i < armazenarContaEmpresa.contas.length; i++) {
                            if (armazenarContaEmpresa.contas[i] == null) {
                                SistemaDeLogin.Conta novaContaEmpresa = siLoginEmpresa.new Conta();
                                novaContaEmpresa.criarConta(loginEmpresa, senhaEmpresa);
                                armazenarContaEmpresa.contas[i] = novaContaEmpresa;
                                System.out.println("Conta criada com sucesso!");
                                break;
                            }
                        }
                    } else if (tipoConta == 2) {
                        System.out.println("====REGISTRAR CLIENTE====");
                        System.out.print("Insira o nome do cliente: ");
                        loginCliente = sc.next();
                        System.out.print("Insira a senha: ");
                        senhaCliente = sc.next();
                        for (int i = 0; i < armazenarConta.contas.length; i++) {
                            if (armazenarConta.contas[i] == null) {
                                SistemaDeLogin.Conta novaConta = siLoginCliente.new Conta();
                                novaConta.criarConta(loginCliente, senhaCliente);
                                armazenarConta.contas[i] = novaConta;
                                System.out.println("Conta criada com sucesso!");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Você deseja logar em uma conta para empresa ou cliente? \n 1- Empresa \n 2 - Cliente \n 3 - Voltar");
                    tipoLogin = sc.nextInt();
                    if (tipoLogin == 1) {
                        System.out.println("=====Login Empresa====");
                        System.out.print("Digite o seu login: ");
                        loginEmpresa = sc.next();
                        System.out.print("Digite a sua senha: ");
                        senhaEmpresa = sc.next();
                        if (siLoginEmpresa.fazerLoginEmpresa(loginEmpresa, senhaEmpresa, armazenarContaEmpresa.contas)) {
                            System.out.println("Login bem-sucedido!");
                            HomeEmpresa(carrosDisponiveis);
                            System.out.println("\nCarros Registrados:");
                            for (SistemaCarros carro : carrosDisponiveis) {
                                if (carro != null) {
                                    System.out.println(carro.toString());
                                }
                            }
                        } else {
                            System.out.println("Login falhou. Verifique seu usuário e senha.");
                        }
                    } else if (tipoLogin == 2) {
                        System.out.println("=====Login Cliente=====");
                        System.out.print("Digite o seu login: ");
                        loginCliente = sc.next();
                        System.out.print("Digite a sua senha: ");
                        senhaCliente = sc.next();
                        if (siLoginCliente.fazerLoginCliente(loginCliente, senhaCliente, armazenarConta.contas)) {
                            System.out.println("Login bem-sucedido!");
                            HomeCliente(carrosDisponiveis);
                        } else {
                            System.out.println("Login falhou. Verifique seu usuário e senha.");
                        }
                    } else if (tipoLogin == 3) {
                        break;  
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opt != 3);

        sc.close();
    }


// EMPRESA


    public static void HomeEmpresa(SistemaCarros[] carrosDisponiveis) {
        String[] aluguelCompraOpt = {"Alugar", "Comprar"};
        String[] estadoOpt = {"Novo", "Seminovo", "Usado"};
        String[] tipoCarroOpt = {"Sedan", "SUV", "Esportivo"};
        String[] lugaresOpt = {"2 Lugares", "5 Lugares", "7 Lugares"};
        String[] motorOpt = {"1.0", "1.4", "1.6", "2.0 ou Mais"};
        String[] marcaOpt = {"Renault", "Volkswagen", "Honda", "Fiat", "Ford", "Porsche", "Jeep"};
        String[] cambioOpt = {"Automático", "Manual"};
        String[] arOpt = {"Ar Condicionado", "Nenhum"};
        String[] janelaOpt = {"Automático", "Manual"};
        String[] precoOpt = {"5000", "10000", "15000", "20000", "25000", "30000", "35000", "40000", "45000", "50000"};

        int escolha;
        String[] escolhas = new String[11];
    
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("COLOCAR PARA ALUGAR/COMPRAR");
                    for (int j = 0; j < aluguelCompraOpt.length; j++)
                        System.out.println((j + 1) + "- " + aluguelCompraOpt[j]);
                    break;
        
                case 1:
                    System.out.println("QUAL O ESTADO DO CARRO?");
                    for (int j = 0; j < estadoOpt.length; j++)
                        System.out.println((j + 1) + "- " + estadoOpt[j]);
                    break;
        
                case 2:
                    System.out.println("QUAL O TIPO DO CARRO?");
                    for (int j = 0; j < tipoCarroOpt.length; j++)
                        System.out.println((j + 1) + "- " + tipoCarroOpt[j]);
                    break;
        
                case 3:
                    System.out.println("QUANTIDADE DE LUGARES DO CARRO");
                    for (int j = 0; j < lugaresOpt.length; j++)
                        System.out.println((j + 1) + "- " + lugaresOpt[j]);
                    break;
        
                case 4:
                    System.out.println("QUAL O MOTOR DO CARRO?");
                    for (int j = 0; j < motorOpt.length; j++)
                        System.out.println((j + 1) + "- " + motorOpt[j]);
                    break;
        
                case 5:
                    System.out.println("QUAL A MARCA DO CARRO?");
                    for (int j = 0; j < marcaOpt.length; j++)
                        System.out.println((j + 1) + "- " + marcaOpt[j]);
                    break;
        
                case 6:
                    System.out.println("QUAL O CâMBIO DO CARRO?");
                    for (int j = 0; j < cambioOpt.length; j++)
                        System.out.println((j + 1) + "- " + cambioOpt[j]);
                    break;
        
                case 7:
                    System.out.println("QUAL O AR DO CARRO?");
                    for (int j = 0; j < arOpt.length; j++)
                        System.out.println((j + 1) + "- " + arOpt[j]);
                    break;
        
                case 8:
                    System.out.println("COMO É A JANELA DO CARRO?");
                    for (int j = 0; j < janelaOpt.length; j++)
                        System.out.println((j + 1) + "- " + janelaOpt[j]);
                    break;
        
                    case 9:
                    System.out.println("Escolha o preço que está disposto a pagar:");
                    for (int j = 0; j < precoOpt.length; j++)
                        System.out.println((j + 1) + "- " + precoOpt[j]);
        
                    System.out.println("Selecione a opção:");
                    int escolhaPreco = sc.nextInt();
                    escolhas[i] = precoOpt[escolhaPreco - 1];
                    break;
            }
        
            if (i < 9) {
                System.out.println("Selecione a opção:");
                escolha = sc.nextInt();
                escolhas[i] = Integer.toString(escolha);
            }
        }
    
        int aluguelCompraEscolha = Integer.parseInt(escolhas[0]) - 1;
        int estadoEscolha = Integer.parseInt(escolhas[1]) - 1;
        int tipoCarroEscolha = Integer.parseInt(escolhas[2]) - 1;
        int lugaresEscolha = Integer.parseInt(escolhas[3]) - 1;
        int motorEscolha = Integer.parseInt(escolhas[4]) - 1;
        int marcaEscolha = Integer.parseInt(escolhas[5]) - 1;
        int cambioEscolha = Integer.parseInt(escolhas[6]) - 1;
        int arEscolha = Integer.parseInt(escolhas[7]) - 1;
        int janelaEscolha = Integer.parseInt(escolhas[8]) - 1;
        String precoEscolha = escolhas[9];
    
        SistemaCarros carro = new SistemaCarros(aluguelCompraOpt[aluguelCompraEscolha],
        estadoOpt[estadoEscolha], tipoCarroOpt[tipoCarroEscolha],
        lugaresOpt[lugaresEscolha], motorOpt[motorEscolha],
        marcaOpt[marcaEscolha], cambioOpt[cambioEscolha],
        arOpt[arEscolha], janelaOpt[janelaEscolha], precoEscolha);

        for (int i = 0; i < carrosDisponiveis.length; i++) {
            if (carrosDisponiveis[i] == null) {
                carrosDisponiveis[i] = carro;
                break;
            }
        }

System.out.println("SistemaCarros registrado:\n" + carro.toString());
}

//CLIENTE

    public static void HomeCliente(SistemaCarros[] carrosDisponiveis) {
        String[] aluguelCompraOpt = {"Alugar", "Comprar"};
        String[] estadoOpt = {"Novo", "Seminovo", "Usado"};
        String[] tipoCarroOpt = {"Sedan", "SUV", "Esportivo"};
        String[] lugaresOpt = {"2 Lugares", "5 Lugares", "7 Lugares"};
        String[] motorOpt = {"1.0", "1.4", "1.6", "2.0 ou Mais"};
        String[] marcaOpt = {"Renault", "Volkswagen", "Honda", "Fiat", "Ford", "Porsche", "Jeep"};
        String[] cambioOpt = {"Automático", "Manual"};
        String[] arOpt = {"Ar Condicionado", "Nenhum"};
        String[] janelaOpt = {"Automático", "Manual"};
        String[] precoOpt = {"5000", "10000", "15000", "20000", "25000", "30000", "35000", "40000", "45000", "50000"};
    
        String[] escolhas = new String[10];
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("Você deseja Alugar ou Comprar?");
                    for (int j = 0; j < aluguelCompraOpt.length; j++)
                        System.out.println((j + 1) + "- " + aluguelCompraOpt[j]);
                    break;
                case 1:
                    System.out.println("Qual o estado do carro?");
                    for (int j = 0; j < estadoOpt.length; j++)
                        System.out.println((j + 1) + "- " + estadoOpt[j]);
                    break;
                case 2:
                    System.out.println("Qual o tipo do carro?");
                    for (int j = 0; j < tipoCarroOpt.length; j++)
                        System.out.println((j + 1) + "- " + tipoCarroOpt[j]);
                    break;
                case 3:
                    System.out.println("Quantidade de lugares do carro");
                    for (int j = 0; j < lugaresOpt.length; j++)
                        System.out.println((j + 1) + "- " + lugaresOpt[j]);
                    break;
                case 4:
                    System.out.println("Qual o motor do carro?");
                    for (int j = 0; j < motorOpt.length; j++)
                        System.out.println((j + 1) + "- " + motorOpt[j]);
                    break;
                case 5:
                    System.out.println("Qual a marca do carro?");
                    for (int j = 0; j < marcaOpt.length; j++)
                        System.out.println((j + 1) + "- " + marcaOpt[j]);
                    break;
                case 6:
                    System.out.println("Qual o câmbio do carro?");
                    for (int j = 0; j < cambioOpt.length; j++)
                        System.out.println((j + 1) + "- " + cambioOpt[j]);
                    break;
                case 7:
                    System.out.println("Qual o ar do carro?");
                    for (int j = 0; j < arOpt.length; j++)
                        System.out.println((j + 1) + "- " + arOpt[j]);
                    break;
                 case 8:
                    System.out.println("Como é a janela do carro?");
                    for (int j = 0; j < janelaOpt.length; j++)
                        System.out.println((j + 1) + "- " + janelaOpt[j]);
                    break;
                    case 9:
                    System.out.println("Escolha o preço que está disposto a pagar:");
                    for (int j = 0; j < precoOpt.length; j++)
                        System.out.println((j + 1) + "- " + precoOpt[j]);
                
                    int escolhaPreco = -1;
                    while (escolhaPreco < 1 || escolhaPreco > precoOpt.length) {
                        System.out.println("Selecione a opção:");
                        escolhaPreco = sc.nextInt();
                        if (escolhaPreco < 1 || escolhaPreco > precoOpt.length) {
                            System.out.println("Escolha inválida. Tente novamente.");
                        }
                    }
                    escolhas[i] = Integer.toString(escolhaPreco);
                    break;  
                }
            if (i < 9) {
                System.out.println("Selecione a opção:");
                escolhas[i] = sc.next();
            }
        }
    
        int aluguelCompraEscolha = Integer.parseInt(escolhas[0]) - 1;
        int estadoEscolha = Integer.parseInt(escolhas[1]) - 1;
        int tipoCarroEscolha = Integer.parseInt(escolhas[2]) - 1;
        int lugaresEscolha = Integer.parseInt(escolhas[3]) - 1;
        int motorEscolha = Integer.parseInt(escolhas[4]) - 1;
        int marcaEscolha = Integer.parseInt(escolhas[5]) - 1;
        int cambioEscolha = Integer.parseInt(escolhas[6]) - 1;
        int arEscolha = Integer.parseInt(escolhas[7]) - 1;
        int janelaEscolha = Integer.parseInt(escolhas[8]) - 1;
        int precoEscolha = Integer.parseInt(escolhas[9]) - 1;
    
        SistemaCarros carroDesejado = new SistemaCarros(aluguelCompraOpt[aluguelCompraEscolha],
                estadoOpt[estadoEscolha], tipoCarroOpt[tipoCarroEscolha],
                lugaresOpt[lugaresEscolha], motorOpt[motorEscolha],
                marcaOpt[marcaEscolha], cambioOpt[cambioEscolha],
                arOpt[arEscolha], janelaOpt[janelaEscolha], precoOpt[precoEscolha]);
    
        boolean carroDisponivel = verificarCarroDisponivel(carroDesejado, carrosDisponiveis);
    
        if (carroDisponivel) {
            String pag, pag2;

            System.out.println("Carro disponível! Aqui estão os detalhes:");
            System.out.println(carroDesejado.toString());
            System.out.println("Confirmar pagamento ?");
            pag = sc.next();
            System.out.println(pag.equalsIgnoreCase("Sim") ?"Pagamento confirmado \nInsira o método de compra":pag.equalsIgnoreCase("Não")?"Saindo...":"Opção Inválida");
            System.out.println("Pix, Cartão, Boleto");
            pag2 = sc.next();
            System.out.println(pag2.equalsIgnoreCase("PIX")? "Chave Pix: 1249058191jasodcmqo1849Conc1013920jc":pag2.equalsIgnoreCase("Cartão")?"Pagamento Confirmado":pag2.equalsIgnoreCase("Boleto")?"Boleto foi enviado ao seu email":"Opção Inválida");
        } else {
            System.out.println("Desculpe, nenhum carro disponível com base nas suas escolhas.");
        }
    
        System.out.println("\nCarros Registrados:");
        for (SistemaCarros carro : carrosDisponiveis) {
            if (carro != null) {
                System.out.println(carro.toString());
            }
        }
    }

// VERIFICADOR


    public static boolean verificarCarroDisponivel(SistemaCarros carro, SistemaCarros[] carrosDisponiveis) {
        for (SistemaCarros c : carrosDisponiveis) {
            if (c != null && c.equals(carro)) {
                return true;
            }
        }
        return false;
    }
}