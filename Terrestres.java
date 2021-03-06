
public class Terrestres extends Mamiferos {
	public Terrestres(String nome, String habitat)
	{
		super(nome, habitat);
		vertebrados = true;
		glandulas_mamaria = true;
		asas = false;
		respiracao_pulmonar = true;
		sonar = false;
	}
	
	public void Infos()
	{
		System.out.println("Nome da esp?cie: " + getNome());
		System.out.println("Tipo de habitat: " + getHabitat());
		
		if(vertebrados)
		{
			System.out.print("\nO animal ? vertebrado.");
		}
		
		if(glandulas_mamaria)
		{
			System.out.print("\nO animal tem gl?ndulas mam?rias.");
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
			System.out.print("\nO animas tem respira??o pulmonar.");
		}
		
		if(sonar)
		{
			System.out.print("\nO animal possui sonar.");
		}
		else
		{
			System.out.print("\nO animal n?o possui sonar");
		}
	}
}
