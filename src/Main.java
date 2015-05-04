import java.util.Scanner;

public class Main
{
	private static int ladoMapa = 10;
	private static int posInicialX = 4;
	private static int posInicialY = 4;
	static Scanner scanner = new Scanner(System.in);

	public static void constroiMapa(int[][] mapa)
	{
		for (int i = 0; i < ladoMapa; i++)
		{
			for (int j = 0; j < ladoMapa; j++)
			{
				if (i > 6 && j > 6) mapa[i][j] = 1;
				else
					mapa[i][j] = 0;
			}

		}

	}

	public static void exibeMapa(int[][] mapa)
	{
		int i, j;

		for (i = 0; i < ladoMapa; i++)
		{
			for (j = 0; j < ladoMapa; j++)
			{
				if (mapa[i][j] == 2) System.out.print("T");
				else
					System.out.print(mapa[i][j]);
				System.out.print(" ");
			}
			System.out.println();

		}

	}

	private static void interacao(int[][] mapa)
	{
		char op;
		System.out.println("W S A D para movimentar.");
		op = scanner.next().charAt(0);
		constroiMapa(mapa);
		switch (op)
		{
		case 'W':
		case 'w':
			posInicialX--;
			mapa[posInicialX][posInicialY] = 2;
			break;
		case 'S':
		case 's':
			posInicialX++;
			mapa[posInicialX][posInicialY] = 2;
			break;
		case 'A':
		case 'a':
			posInicialY--;
			mapa[posInicialX][posInicialY] = 2;
			break;
		case 'D':
		case 'd':
			posInicialY++;
			mapa[posInicialX][posInicialY] = 2;
			break;
		}
	}

	void exibeOpcoes()
	{
		int op;
		System.out.println("1 - Listar pokemons ");
		System.out.println("2 - Atacar");
		System.out.println("3 - Ver pokemon atual");
		System.out.println("4 - Mudar pokemon atual");
		System.out.println("5 - Usar poção");
		System.out.println("6 - Desistir");
		op = scanner.nextInt();

		switch (op)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		}

	}

	public static void main(String[] args)
	{
		int[][] mapa = new int[ladoMapa][ladoMapa];
		constroiMapa(mapa);
		mapa[posInicialX][posInicialY] = 2;
		exibeMapa(mapa);
		int op = 1;
		while (op != 0)
		{
			interacao(mapa);
			exibeMapa(mapa);
		}

		scanner.close();

	}

}
