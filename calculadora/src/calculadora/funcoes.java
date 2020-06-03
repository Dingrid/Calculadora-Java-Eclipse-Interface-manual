package calculadora;

public class funcoes {

	public double soma(double n1, double n2)
	{
		return n1+n2;
	}
	
	public double sub(double n1, double n2)
	{
		return n1-n2;
	}
	
	public double div(double n1, double n2)
	{
		return n1/n2;
	}
	
	public double mult(double n1, double n2)
	{
		return n1*n2;
	}
	public double porc(double n1, double n2)
	{
		return ((n2*n1)/100);
	}
	public double raiz(double n1)
	{
		return Math.sqrt(n1);
	}
	
	public double fracao(double n1)
	{
		return 1/n1;
	}
}
