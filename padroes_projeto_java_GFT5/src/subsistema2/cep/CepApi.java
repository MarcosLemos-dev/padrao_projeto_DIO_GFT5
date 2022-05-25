package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Cidade hipotética";
	}
	
	public String recuperarEstado(String cep) {
		return "Estado impotetico";
	}
	public String recuperarEndereco(String cep) {
		return "Endereco recuperado";
	}
}
