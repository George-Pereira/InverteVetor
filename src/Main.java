import java.util.Random;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor"));
		int VT[] = new int [n];
		int aux[] = new int [n];
		boolean verificacao = false;
		for(int CTA = 0; CTA<VT.length; CTA++) 
		{
			VT[CTA] = r.nextInt(50);
			aux[CTA] = VT[CTA];
		}
		System.out.print("\n");
		VT = inverteVetor(VT, 0);
		for(int CTA = 0; CTA< VT.length; CTA++) 
		{
			System.out.println(VT[CTA] + "		" + VT[(n-1)-CTA]);
		}
		for(int CTA = 0; CTA<n;CTA++) 
		{
			if(VT[CTA] == aux[(n-1)-CTA]) 
			{
				verificacao = true;
			}
		}
		if(verificacao) 
		{
			System.out.println("Vetor invertido com sucesso");
		}
		else 
		{
			System.out.println("Falha na inversão do vetor");
		}
	}

	private static int [] inverteVetor(int[] vt, int cta) 
	{
		if(cta == (int)((vt.length)/2)) 
		{
			return vt;
		}
		int aux = vt[cta];
		vt[cta] = vt[(vt.length-1)-cta];
		vt[(vt.length-1)-cta] = aux;
		inverteVetor(vt, cta+1);
		return vt;
	}
}
