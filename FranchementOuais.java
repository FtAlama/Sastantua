import java.util.Scanner;

public class FranchementOuais
{

	public static void affichage(int etage, int nombre)
	{
		System.out.println(etage);
		int espace = etage*2-1;
		if(nombre > 5)
			espace -= 4;
		if(nombre < 5 && nombre > 2)
			espace--;
		System.out.println(espace);
		int tmp_espace =espace;
		int étoile = 1;
		int tmp_étoile = étoile; 
		char On_la = 92;
		int étoile_tmp = 0;
		int saut = 3;
		int tmp_saut = saut;
		int longeur = nombre;
		int largeur = nombre;
		int tmp_longeur = longeur;
		int moitié = étoile/2;
		int tmp_largeur = largeur;
		int moitié_étoile = 0;
		int yeet = 1;

		System.out.println("Size : " + nombre);
		if(nombre < 3)
			System.out.println("piramide trop coutre pour une porte.");
		while(etage > 0)
		{
			System.out.print("|");
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
			étoile_tmp = étoile/2 +1;
			moitié_étoile = étoile/2 +nombre -1;
			while(étoile > 0)
			{
				if(nombre < 3)
				{
					if(etage == 1 && étoile == étoile_tmp)
					{
						System.out.print("|");
						étoile--;
					}
				}
				if(etage == largeur && nombre > 2 && moitié_étoile == étoile)
				{
						étoile = étoile - nombre;
						while(longeur > 0)
						{
							System.out.print("|");
							longeur--;
						}
					largeur--;
				}
				System.out.print("*");
				étoile--;
				longeur = tmp_longeur;
				
			}
				
			étoile = tmp_étoile + 2;
			tmp_étoile = étoile;
			System.out.print(On_la);
			etage--;
			System.out.println();
			saut--;
		}
		System.out.println(espace + 1);

	}

	public static void main(String[] agrs)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("écrivez le nombre détage");
		int nombre = scan.nextInt();
		int ligne = 3;
		int tmp = ligne;
		int ligne_final = 0;
		int tmp_nombre = nombre;
		
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

		affichage(ligne_final, tmp_nombre);
	}		
}
