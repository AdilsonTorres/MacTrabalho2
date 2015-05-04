
public class Pokemon
{
	private String nome;
	private String tipo;
	private int hp = 100;
	private static int cura = 15;
	private static int qtAtaque = 4;
	private String[] ataque = new String[qtAtaque];
	private int[] dano = new int[qtAtaque];
	private int[] prioridade = new int[qtAtaque];

	public void setAtaque(String[] ataque)
	{
		this.ataque = ataque;
	}

	public void setPrioridade(int[] prioridade)
	{
		this.prioridade = prioridade;
	}

	public int getPrioridade(int i)
	{
		return prioridade[i];
	}

	public void setDano(int[] dano)
	{

		this.dano = dano;
	}

	public int getDano(int i)
	{

		return this.dano[i];
	}

	Pokemon(String nome, String tipo)
	{
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome()
	{
		return nome;
	}

	public int getHp()
	{
		return hp;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void recebeAtaque(int dano)
	{
		if (this.hp - dano >= 0) this.hp -= dano;
		else
			this.hp = 0;
	}

	public void curar()
	{
		if (this.hp + cura <= 100) this.hp += cura;
		else
			this.hp = 100;
	}

	public void exibeAtaques()
	{
		for (int i = 0; i < qtAtaque; i++)
		{
			System.out.println("(" + (i + 1) + ") " + ataque[i]
					+ ", com dano de " + dano[i] + "hp.");
		}
	}

}