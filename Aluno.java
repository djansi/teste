package poo;


public class Aluno extends Pessoa {
	
		
		private String objetivo;
		/*String avaliacaoFisica;	
		 String frequenciasAluno;
		 String fichasTreino;*/
		private String personal;
		private String datainicio; 
		
		
		
		public Aluno() {

			}
		
		
		//MATRICULA
		public void setId(String id) { 
			this.id = id;
			}
		
		public String getId() {
			return id;
			}


		//NOME
		public void setNome(String nome) {
			this.nome = nome;
			}
		
		public String getNome() {
			return  nome;
			}


		//ENDEREÇO
		public void setEndereco(String endereco) {
			this.endereco = endereco;
			}
		
		public String getEndereco() {
			return  endereco;
			}
		

		//TELEFONE
		public void setTelefone(int telefone) {
			this.telefone = telefone;
			}
		
		public int getTelefone() {
			return  telefone;
			}

		//IDADE
		public void setIdade(int idade) {
			this.idade = idade;
			}
		
		public int getIdade() {
			return  idade;
			}


		//SEXO		
		public void setSexo(String sexo) {
			this.sexo = sexo;
			}
		
		public String getSexo() {
			return sexo;
			}
		
		//CPF
		
		public void setCpf (String cpf) {
			this.cpf = cpf;
			}
		
		public String getCpf() {
			return cpf;
			}
		
		//EMAIL
		public void setEmail (String email ) {
			this.email =  email;
			}
		
		public String getEmail () {
			return email;
			}
			
		//OBJETIVO
		public void setObjetivo (String objetivo ) {
			this.objetivo = objetivo;
		}
		
		public String getObjetivo () {
			return objetivo;
			
		}
		
		// AVALIAÇÃO FISICA
		
		//FREQUENCIA ALUNO
		
		//FICHA TREINO 
		
		//PERSONAL
		public void setPersonal (String personal ) {
			this.personal = personal;
		}
		
		public String getPersonal () {
			return personal;
		}
		
		//DATA INICIO
		
		//
		
		public void setDataInicio (String datainicio ) {
			this.datainicio = datainicio;
			
		}
		
		public String getDataInicio () {
			return datainicio;
		}
		
	



	
	
	
	
	
	
	

}
