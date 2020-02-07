public class Main
{

	public static void affichage(int etage)
	{
		int espace = etage * 2 - 2;
		int tmp_espace =espace;
		int étoile = 1;
		int tmp_étoile = étoile; 
		char On_la = 92;
		
		int saut = 3;
		int tmp_saut = saut;
		while(etage > 0)
		{
			if(saut == 0)
			{
				étoile = étoile + 4;
				espace = espace - 2;
				saut = tmp_saut + 1;
				tmp_étoile = étoile;
				tmp_espace = espace;
				tmp_saut = saut;
			}
			while(espace > 0)
			{
				System.out.print(" ");
				espace--;
			}
			if(espace == 0)
			{
				espace = tmp_espace - 1;
				tmp_espace = espace;
			}
			System.out.print("/");
		while(étoile > 0)
			{
				System.out.print("*");
				étoile--;
			}
				
			étoile = tmp_étoile + 2;
			tmp_étoile = étoile;
			System.out.print(On_la);
			etage--;
			System.out.println();
			saut--;
		}
		System.out.println(espace);
	}

	public static void main(String[] agrs)
	{

		int nombre = 5;
		int ligne = 3;
		int tmp = ligne;
		int ligne_final = 0;

		while(nombre > 0)
		{
			while(ligne > 0)
			{
				ligne_final++;		
				ligne--;
			}
			ligne = tmp + 1;
			tmp = ligne;
			nombre --;		
		}

		affichage(ligne_final);
	}		
}
