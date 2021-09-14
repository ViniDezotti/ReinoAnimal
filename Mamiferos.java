
public abstract class Mamiferos
{
	public String nome;
	public String habitat;
	
	public boolean vertebrados;
	public boolean glandulas_mamaria;
	public boolean asas;
	public boolean respiracao_pulmonar;
	public boolean sonar;

	public Mamiferos(String nome, String habitat) {
		this.nome = nome;
		this.habitat = habitat;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setVertebrados(boolean vertebrados) {
		this.vertebrados = vertebrados;
	}
	
	public boolean getVertebrados() {
		return vertebrados;
	}
	
	public void setGlandulas_mamaria(boolean glandulas_mamaria) {
		this.glandulas_mamaria = glandulas_mamaria;
	}
	
	public boolean getGlandulas_mamaria() {
		return glandulas_mamaria;
	}
	
	public void setAsas(boolean asas) {
		this.asas = asas;
	}
	
	public boolean getAsas() {
		return asas;
	}
	
	public void setRespiracao_pulmonar(boolean respiracao_pulmonar) {
		this.respiracao_pulmonar = respiracao_pulmonar;
	}
	
	public boolean getRespiracao_pulmonar()
	{
		return respiracao_pulmonar;
	}
	
}