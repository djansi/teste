package poo;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class academia {

	public static void main(String[] args) {
		
				int opc;
				int apc;
				
				String id;
				String nome;
				String endereco;
				String telefone; 
				String idade; 
				String sexo; 
				String cpf; 
				String email; 
				String objetivo;
				String personal;
				String datainicio;
				
				
		
		//TECLADO
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		
		
		//OBJETOS
		Aluno novoaluno = new Aluno ();
		Personal novopersonal = new Personal ();
		
		
		
		//do {
		
			System.out.println("_____ FiTech _____  ");
			System.out.println("1 - Cadastrar Aluno ");
			System.out.println("2 - Consultar Aluno");
			System.out.println("3 - Cadastrar Personal");
			System.out.println("4 - Imprimir Ficha de Treino");

		
		opc = teclado.nextInt();
		teclado.nextLine();
		
		 switch (opc) {
		
		 case 1:
			
			System.out.println("\nId: ");
			id = teclado.nextLine();	
			System.out.println("\nNome: ");
			nome = teclado.nextLine();
			System.out.println("\nEndereco: ");
			endereco = teclado.nextLine();
			System.out.println("\nTelefone: ");
			telefone = teclado.nextLine();
			System.out.println("\nIdade: ");
			idade = teclado.nextLine();
			System.out.println("\nSexo: ");
			sexo = teclado.nextLine();
			System.out.println("\nCpf: ");
			cpf = teclado.nextLine();
			System.out.println("\nEmail: ");
			email = teclado.nextLine();
			System.out.println("\nObjetivo:: ");
			objetivo = teclado.nextLine();
			System.out.println("\nPersonal:: ");
			personal = teclado.nextLine();
			System.out.println("\nData de Inicio:: ");
			datainicio = teclado.nextLine();
		
		
			
			novoaluno = new Aluno ();
			
			/*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(datainicio);
			*/
			System.out.println("\nAluno Cadastrado com Sucesso!");
			
		break;
		
		
		 case 2:	
			 break;
		     
		     
		case 3:
			System.out.println("\nId: ");
			id = teclado.nextLine();	
			System.out.println("\nNome: ");
			nome = teclado.nextLine();
			System.out.println("\nEndereco: ");
			endereco = teclado.nextLine();
			System.out.println("\nTelefone: ");
			telefone = teclado.nextLine();
			System.out.println("\nIdade: ");
			idade = teclado.nextLine();
			System.out.println("\nSexo: ");
			sexo = teclado.nextLine();
			System.out.println("\nCpf: ");
			cpf = teclado.nextLine();
			System.out.println("\nEmail: ");
			email = teclado.nextLine();
			
			novopersonal = new Personal ();
			break;
		     
		case 4:
			System.out.println("__ Selecione a pré-definição de treino desejada __");
			System.out.println("1 - Ganho de Massa magra ");
			System.out.println("2 - Perca de Gordura");
			System.out.println("3 - Ganho de desempenho aerobico");
			System.out.println("4 - Ganho de força");

			
			apc = teclado.nextInt();
			teclado.nextLine();
			

			switch (apc) {
			
				case 1:
					  
				System.out.println("\nTreino A - Supino reto (4x12)\n           Supino Declinado (4x12)\n           Peck-Deck (4x12)\n           Crucifixo (4x12)\n           Triceps Pullet (4x12)\n           Triceps Polia (4x10)");
				System.out.println("\nTreino B - Puxador Costas, Remada Baixa, Remada Curvada, Remana Unilateral (4x12) \n           Rosca direta, Rosca alternada, Martelo (4x12) ");
				System.out.println("\nTreino C - Agachamento Livre, Leg Press, Hack45°, Stiff, Cadeira Extensora, Mesa Flexora");
				System.out.println("\nTreino D - 30' Cardio 2 x Semana");
			
			
			break;
			
			case 2:
				System.out.println("\nTreino A "); 
				System.out.println("\nTreino B ");
				System.out.println("\nTreino C ");
				System.out.println("\nTreino D ");
				
				break;
				
			case 3:
				System.out.println("\nTreino A "); 
				System.out.println("\nTreino B ");
				System.out.println("\nTreino C ");
				System.out.println("\nTreino D ");
			
				
				break;		
			
			case 4:
				System.out.println("\nTreino A ");
				System.out.println("\nTreino B ");
				System.out.println("\nTreino C ");
				System.out.println("\nTreino D ");
			
				
				break;	
			}
			break;
			
			
		 default:
			 System.out.println("\nOpção invalida!");
			     
		
		}
		
		
		
			} //while (opc != 0); 
			
			
	
	}

//}
