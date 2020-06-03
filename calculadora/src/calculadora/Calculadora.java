package calculadora;
import java.awt.Container; 

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; //importar o JFrame que é a classe responsável pela modelagem
import javax.swing.JTextField;

public class Calculadora extends JFrame{

	//criação de objetos
	JTextField txtVisor = new JTextField(); //cria uma caixa de texto
	JButton btnMC = new JButton("MC"); //o MC é o rótulo(oq vai aparever no nome do botão)
	JButton btnMR = new JButton("MR"); 
	JButton btnMS = new JButton("MS"); 
	JButton btnMM = new JButton("M+"); 
	JButton btnMN = new JButton("M-"); 
	
	//SEGUNDA LINHA
	JButton btnSETA = new JButton("<"); 
	JButton btnCE = new JButton("CE"); 
	JButton btnC = new JButton("C"); 
	JButton btnMAISMENOS = new JButton("+/-"); 
	JButton btnRAIZ = new JButton("V"); 
	
	//TERCEIRA LINHA
	JButton btn7 = new JButton("7"); 
	JButton btn8 = new JButton("8"); 
	JButton btn9 = new JButton("9"); 
	JButton btnDIV = new JButton("/"); 
	JButton btnPORCEN = new JButton("%"); 
	
	//QUARTA LINHA
	JButton btn4 = new JButton("4"); 
	JButton btn5 = new JButton("5"); 
	JButton btn6 = new JButton("6"); 
	JButton btnMULTI = new JButton("*"); 
	JButton btnFRACAO = new JButton("1/x"); 
	
	//QUINTA LINHA
	JButton btn1 = new JButton("1"); 
	JButton btn2 = new JButton("2"); 
	JButton btn3 = new JButton("3"); 
	JButton btnMENOS = new JButton("-"); 
	
	//SEXTA LINHA
	JButton btn0 = new JButton("0"); 
	JButton btnVIRGULA = new JButton(","); 
	JButton btnMAIS = new JButton("+"); 
	
	//QUINTA E SEXTA LINHA
	JButton btnIGUAL = new JButton("="); 
	
	//criação das funções
	funcoes mat = new funcoes();
	String sinal = null;
	double valor1 = 0;
	double valor2 = 0;
	double valor=0;
	
	public Calculadora() {
		super("Calculadora"); //é o que coloca o rótulo no topo da janela
		Container paine = this.getContentPane(); //a classe container é responsável 
		//pela colocação de objetos dentro da interface
		paine.setLayout(null); //seta o layout
		
		//VISOR
		txtVisor.setFont( new Font( "Arial", Font.PLAIN, 20 ));
		txtVisor.setBounds(20, 5, 340, 50); //tamanho da caixa de texto
		paine.add(txtVisor);//fixa o campo de texto na tela 
		
		//BOTÕES
		//PRIMEIRA LINHA
		btnMC.setBounds(20, 60, 60, 60); //tamanho do botão
		paine.add(btnMC);//fixa o campo de texto na tela 
		btnMR.setBounds(90, 60, 60, 60); //tamanho do botão
		paine.add(btnMR);//fixa o campo de texto na tela 
		btnMS.setBounds(160, 60, 60, 60); //tamanho do botão
		paine.add(btnMS);//fixa o campo de texto na tela 
		btnMM.setBounds(230, 60, 60, 60); //tamanho do botão
		paine.add(btnMM);//fixa o campo de texto na tela 
		btnMN.setBounds(300, 60, 60, 60); //tamanho do botão
		paine.add(btnMN);//fixa o campo de texto na tela
		
		//SEGUNDA LINHA
		btnSETA.setBounds(20, 130, 60, 60); //tamanho do botão
		paine.add(btnSETA);//fixa o campo de texto na tela 
		btnCE.setBounds(90,  130, 60, 60); //tamanho do botão
		paine.add(btnCE);//fixa o campo de texto na tela 
		btnC.setBounds(160,  130, 60, 60); //tamanho do botão
		paine.add(btnC);//fixa o campo de texto na tela 
		btnMAISMENOS.setBounds(230,  130, 60, 60); //tamanho do botão
		paine.add(btnMAISMENOS);//fixa o campo de texto na tela 
		btnRAIZ.setBounds(300,  130, 60, 60); //tamanho do botão
		paine.add(btnRAIZ);//fixa o campo de texto na tela
		
		//TERCEIRA LINHA
		btn7.setBounds(20, 200, 60, 60); //tamanho do botão
		paine.add(btn7);//fixa o campo de texto na tela 
		btn8.setBounds(90,  200, 60, 60); //tamanho do botão
		paine.add(btn8);//fixa o campo de texto na tela 
		btn9.setBounds(160,  200, 60, 60); //tamanho do botão
		paine.add(btn9);//fixa o campo de texto na tela 
		btnDIV.setBounds(230,  200, 60, 60); //tamanho do botão
		paine.add(btnDIV);//fixa o campo de texto na tela 
		btnPORCEN.setBounds(300,  200, 60, 60); //tamanho do botão
		paine.add(btnPORCEN);//fixa o campo de texto na tela

		//QUARTA LINHA
		btn4.setBounds(20, 270, 60, 60); //tamanho do botão
		paine.add(btn4);//fixa o campo de texto na tela 
		btn5.setBounds(90,  270, 60, 60); //tamanho do botão
		paine.add(btn5);//fixa o campo de texto na tela 
		btn6.setBounds(160,  270, 60, 60); //tamanho do botão
		paine.add(btn6);//fixa o campo de texto na tela 
		btnMULTI.setBounds(230,  270, 60, 60); //tamanho do botão
		paine.add(btnMULTI);//fixa o campo de texto na tela 
		btnFRACAO.setBounds(300,  270, 60, 60); //tamanho do botão
		paine.add(btnFRACAO);//fixa o campo de texto na tela
		
		//QUINTA LINHA
		btn1.setBounds(20, 340, 60, 60); //tamanho do botão
		paine.add(btn1);//fixa o campo de texto na tela 
		btn2.setBounds(90,  340, 60, 60); //tamanho do botão
		paine.add(btn2);//fixa o campo de texto na tela 
		btn3.setBounds(160,  340, 60, 60); //tamanho do botão
		paine.add(btn3);//fixa o campo de texto na tela 
		btnMENOS.setBounds(230,  340, 60, 60); //tamanho do botão
		paine.add(btnMENOS);//fixa o campo de texto na tela 
		
		//SEXTA LINHA
		btn0.setBounds(20, 410, 130, 60); //tamanho do botão
		paine.add(btn0);//fixa o campo de texto na tela 
		btnVIRGULA.setBounds(160,  410, 60, 60); //tamanho do botão
		paine.add(btnVIRGULA);//fixa o campo de texto na tela 
		btnMAIS.setBounds(230,  410, 60, 60); //tamanho do botão
		paine.add(btnMAIS);//fixa o campo de texto na tela 
		
		//QUINTA E SEXTA
		btnIGUAL.setBounds(300,  340, 60, 130); //tamanho do botão
		paine.add(btnIGUAL);//fixa o campo de texto na tela 
		
		//AÇÕES NOS BOTÕES
		//NUMÉRICOS
		//0
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}else {
					txtVisor.setText(txtVisor.getText() + "0");
						}
				
				
														}
													});
		//1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}else {
					txtVisor.setText(txtVisor.getText() + "1");
						}
				
				
														}
													});
		
		//2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}else {
					txtVisor.setText(txtVisor.getText() + "2");
						}
				
				
														}
													});
		//3
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}else {
					txtVisor.setText(txtVisor.getText() + "3");
						}
				
				
														}
													});
		
		//4
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}else {
					txtVisor.setText(txtVisor.getText() + "4");
						}
				
				
														}
													});
		//5
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}else {
					txtVisor.setText(txtVisor.getText() + "5");
						}
				
				
														}
													});
		
		//6
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}else {
					txtVisor.setText(txtVisor.getText() + "6");
						}
				
				
														}
													});
		
		//7
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}else {
					txtVisor.setText(txtVisor.getText() + "7");
						}
				
				
														}
													});
		//8
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}else {
					txtVisor.setText(txtVisor.getText() + "8");
						}
				
				
														}
													});
		//9
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}else {
					txtVisor.setText(txtVisor.getText() + "9");
						}
				
				
														}
													});
		//virgula
		btnVIRGULA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}else {
					txtVisor.setText(txtVisor.getText() + ".");
						}
				
				
														}
													});
	
		//AÇÕES
		//C
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtVisor.setText("0");
			}
		});
		
		//CE
				btnCE.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtVisor.setText("0");
					}
				});
				
		
		//setinha

		btnSETA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((txtVisor.getText().length()) == 0)
					txtVisor.setText(0+"");
				else if ((txtVisor.getText().length()) > 0)
				{
					int tam= txtVisor.getText().length(); //pega o tamanho da string
					//o substring divide a string em várias partes, nesse caso dividimos 
					//ela e apresentamos só a parte que nos interessava, ou seja, só o tam-1
					txtVisor.setText(txtVisor.getText().substring(0,tam-1));  
							
				}
			}
		});
		
		
		
		
		//SOMA
		btnMAIS.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			valor1 = Double.parseDouble(txtVisor.getText());
			sinal = "soma";
			txtVisor.setText("0");

		}
	});
		
		//MENOS
		btnMENOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "sub";
				txtVisor.setText("0");
			}
		});
		
		//divisao
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "div";
				txtVisor.setText("0");
			}
		});
		
		//multiplicacao
		btnMULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "mult";
				txtVisor.setText("0");
			}
		});
		
		//PORCENTAGEM
		btnPORCEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.porc(valor1, valor2) + "");
			}
		});
		
		//RAIZ
		btnRAIZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.raiz(valor1) + "");
			}
		});
		
		
		//IGUAL
		btnIGUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());

				if(sinal.equals("soma")) {
					txtVisor.setText(mat.soma(valor1, valor2) + "");
				}
				else if(sinal.equals("sub")) {
					txtVisor.setText(mat.sub(valor1, valor2) + "");
				}
				else if(sinal.equals("div")) {
					txtVisor.setText(mat.div(valor1, valor2) + "");
				}
				else if(sinal.equals("mult")) {
					txtVisor.setText(mat.mult(valor1, valor2) + "");
				}

			}
		});
		
		//mais menos
		btnMAISMENOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}else {
					txtVisor.setText("-" + txtVisor.getText());
						}
				
				
														}
													});
		
		//FRACAO
		btnFRACAO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.fracao(valor1) + " ");
				
				
														}
													});
		//MS - armazenar um valor na memoria
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor = Double.parseDouble(txtVisor.getText());
												}
													});
		
		//MR- usar o valor na memoria
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() +""+ valor);
				
				
														}
													});
		//MC- apaga o valor da memoria
				btnMC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						valor = 0;
														}
															});
				
		//M+ soma o numero digitado com o MC, mas n exibe a soma
				btnMM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						valor1 = valor1+valor;
						
						
																}
															});
		//M- subtrai o numero digitado com o MC, mas n exibe a subtracao
				btnMN.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						valor1 = valor1-valor;
						
						
																}
															});
				
		
	//paine.add(arg0); o add é para adicionar algo na tela
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(388,520); //responsável pelo tamanho da janela
	this.setVisible(true); //permite que a janela fique visível

	this.setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora cal = new Calculadora(); //ao rodar o programa a janela do calculadora será construída
	}

}