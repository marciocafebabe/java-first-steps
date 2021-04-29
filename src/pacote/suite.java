package pacote;

public class suite {

	public static void main(String[] args) {
		
		String tecnologias = "mariah cariew";
		
			switch(tecnologias) {
				case "java":
				case "c++":
				case "python":
					System.out.println("Linguagem de programacao");
					break;
				
				case "oracle" :
				case "sqlserver" :
				case "postgresql" :
					System.out.println("Banco de dados");
					break;
				
				default:
					System.out.println("Tecnologia desconhecida");
			}
		
	}

}
