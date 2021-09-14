
public class Aereos extends Mamiferos{
	public Aereos(String nome, String habitat)
	{
		super(nome, habitat);
		vertebrados = true;
		glandulas_mamaria = true;
		asas = true;
		respiracao_pulmonar = true;
		sonar = true;
	}
	
	public void Infos()
	{
		System.out.println("Nome da espécie: " + getNome());
		System.out.println("Tipo de habitat: " + getHabitat());
		
		if(vertebrados)
		{
			System.out.print("\nO animal é vertebrado.");
		}
		
		if(glandulas_mamaria)
		{
			System.out.print("\nO animal tem glândulas mamárias.");
		}
	
		if(asas)
		{
			System.out.print("\nO animal possui asas.");
		}
		else {
			System.out.print("\nO animal nao possui asas.");
		}
		
		if(respiracao_pulmonar)
		{
			System.out.print("\nO animas tem respiração pulmonar.");
		}
		
		if(sonar)
		{
			System.out.print("\nO animal possui sonar.");
		}
		else
		{
			System.out.print("\nO animal não possui sonar");
		}
	}
}
