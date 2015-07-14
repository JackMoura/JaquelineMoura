package Agenda;
import java.util.Scanner;

class Contatos {
    
    public static void Contatos(){
    int i = 1;
    metodos n[] = new metodos[100];
    int comand;
    Scanner entrada = new Scanner(System.in); 
     
    System.out.println("------------CONTATOS----------");
    System.out.println("[1] Cadastrar Contato");
    System.out.println("[2] Lista dos Contatos");
    System.out.println("[3] Atualizar Contato");
    System.out.println("[0] Voltar"); 
    System.out.print("Digite a sua opção:");
    
    comand = entrada.nextInt();
    entrada.nextLine();
    
    switch(comand){ 
        
    // adicionar contato

    case 1:
    if (i < n.length) {
        n[i] = new metodos ();
           System.out.println("Contato "+i);
           System.out.print("Nome: ");
           n[i].setNome(entrada.nextLine());
           System.out.print("Telefone: ");
           n[i].setTelefone(entrada.nextLine());
           System.out.print("E-mail: ");
           n[i].setEmail(entrada.nextLine());
           System.out.print("Endereço: ");
           n[i].setEndereco(entrada.nextLine());
           i++;
    }
    System.out.println("Contato adicionado");
    break;
    
    // visualizar contatos
    case 2:
        
            System.out.println("Contatos");
        for(i=0;i<100;i++){
            if (n[i]!=null){
                System.out.println("Contato "+i);
		System.out.println("Nome: "+n[i].getNome());
		System.out.println("Telefone: "+n[i].getTelefone());
		System.out.println("E-mail: "+n[i].getEmail());
		System.out.println("Endereço: "+n[i].getEndereco());
            }
        }
    break;
        
    // editar contato
    case 3:
        
        System.out.println("Opção em manutenção");
        
    break;
    // Sair
        
    case 4:
    System.exit(0);
    break;
   
    default:
        System.out.println("Opçao Incorreta! Tente Novamente.");
    break;
           
    }
    
    System.out.println("------------CONTATOS----------");
    System.out.println("[1] Cadastrar Contato");
    System.out.println("[2] Lista dos Contatos");
    System.out.println("[3] Atualizar Contato");
    System.out.println("[4] Sair"); 
    System.out.print("Digite a sua opção:");
    
    comand = entrada.nextInt();
    entrada.nextLine();
}
}


