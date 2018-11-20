package MainWork;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import facebook.Facebook;

/**
 * Interface gráfica principal desenvolvida, com todos os butões descritos para Facebook, Twitter e E-mail. Também
 * se apresenta a barra de pesquisa e o botão  respetivo (search).
 * 
 * @author Brogueira
 *
 */
public class Interfacegrafica{

	private JFrame frame;
	private BomDiaAcademia bda;

	JTextField label = new JTextField();
	JTextField textface = new JTextField();
	JTextField textmail = new JTextField();
	JTextField texttwitter = new JTextField();
	JTextField textdestinatario = new JTextField();
	JTextArea text1 = new JTextArea();
	JTextArea text2 = new JTextArea();
	JButton bface = new JButton("TimeLine FACEBOOK");
	JButton bmail = new JButton("TimeLine EMAIL");
	JButton btwitter = new JButton("TimeLine TWITTER");
	JButton borigem = new JButton("Origem");
	JButton bkeyword = new JButton("Palavra-Chave");
	JButton bperiodoinfo = new JButton("Período da Informação");
	JButton bescreverpost = new JButton("Escrever Post");
	JButton bescreverpostf = new JButton("Escrever Post");
	JButton bescrevermail = new JButton("Escrever Email");
	DefaultListModel<String> model = new DefaultListModel<>();
	JList<String> list = new JList<>(model);

	
	public Interfacegrafica(BomDiaAcademia bda) {
		
		this.bda = bda;

		frame = new JFrame("MAIN MENU");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addFrameContent();
		frame.pack();
		open();
		getFaceTimeLine();
		getTwitterTimeLine();
		getEmailTimeLine();
	}
/**
 * 
 * Fun��o que abre a janela principal e lhe o tamanha pretendido
 * 
 * @author Brogueira
 * 
 */
	public void open() {

		frame.setSize(1000, 1050);
		frame.setVisible(true);

	}
/**
 * 
 * Fun��o que cria a disposi��o dos bot�es, da barra e da caixa onde se representa os resultados das pesquisas.
 * � criado um Layout principal e posteriormente os Layouts secund�rios.
 * 
 * @author Brogueira
 * 
 */
	private void addFrameContent() {

		JPanel search = new JPanel(new GridLayout(1, 2));
		JPanel panelp = new JPanel();
		JPanel panelp1 = new JPanel(new GridLayout(1,2));
		JPanel panel16= new JPanel(new GridLayout(6,1));
		JPanel panel15= new JPanel();
		JPanel panel14= new JPanel();
		JPanel panel17= new JPanel(new GridLayout(2,1));
		JPanel panel18= new JPanel();
		JPanel panel1= new JPanel(new GridLayout(2,1));
		JPanel panel13= new JPanel(new GridLayout(5,1));
		JPanel panel19= new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel6 = new JPanel();
		
		Color color= new Color(128,128,255);
		
		Dimension d1= new Dimension(500,20);
		label.setPreferredSize(d1);
		JTextArea area3 = new JTextArea();
		area3.setText("Procurar palavra que desejar:");
		area3.setEditable(false);
		
		area3.setFont(new Font("SansSerif", Font.BOLD, 15));
		area3.setForeground(color);
		
		panelp.add(area3, BorderLayout.CENTER);
		panelp.add(label, BorderLayout.EAST);


		JTextArea area1 = new JTextArea();
		area1.setText("Filtros:");
		area1.setEditable(false);
		
		area1.setFont(new Font("SansSerif", Font.BOLD, 40));
		area1.setForeground(color);
		panel13.add(area1);


		
		panel7.add(borigem);
		panel13.add(panel7);

		panel8.add(bkeyword);
		panel13.add(panel8);

		panel9.add(bperiodoinfo);
		panel13.add(panel9);

		

		JTextArea area = new JTextArea();
		area.setText("Plataformas Online:");
		area.setEditable(false);
		area.setFont(new Font("SansSerif", Font.BOLD, 45));
		area.setForeground(color);
		
		panel13.add(area);
		panel19.add(panel13);
		
		panel1.add(panel13);
		bface.setFont(new Font("SansSerif", Font.BOLD, 20));
		bmail.setFont(new Font("SansSerif", Font.BOLD, 20));
		btwitter.setFont(new Font("SansSerif", Font.BOLD, 20));

		Dimension d5= new Dimension(300,60);
		bface.setPreferredSize(d5);
		
		Dimension d6= new Dimension(300,30);
		textmail.setPreferredSize(d6);
		texttwitter.setPreferredSize(d6);
		textface.setPreferredSize(d6);
		textdestinatario.setPreferredSize(d6);
		
		panel2.add(bface);
		panel14.add(textface, BorderLayout.CENTER);
		panel14.add(bescreverpostf, BorderLayout.EAST);
		
		panel16.add(panel2);
		panel16.add(panel14);

		bmail.setPreferredSize(d5);
		panel3.add(btwitter);
		panel15.add(texttwitter, BorderLayout.CENTER);
		panel15.add(bescreverpost, BorderLayout.EAST);
		
		panel16.add(panel3);
		panel16.add(panel15);


		btwitter.setPreferredSize(d5);
		panel4.add(bmail);
		panel16.add(panel4);
		
		panel6.add(textmail, BorderLayout.CENTER);
		panel6.add(bescrevermail, BorderLayout.EAST);
		panel17.add(panel6);
		
		Dimension d7= new Dimension(200,15);
		textdestinatario.setPreferredSize(d7);
		
		JTextArea area2 = new JTextArea();
		area2.setText("Destinatário:");
		area2.setEditable(false);
		
		area2.setFont(new Font("SansSerif", Font.BOLD, 15));
		area2.setForeground(color);
		
		panel19.add(area2, BorderLayout.CENTER);
		panel19.add(textdestinatario, BorderLayout.EAST);

		panel17.add(panel19);
		panel16.add(panel17);
		
		panel18.add(panel16);
		panel1.add(panel18);

		panelp.add(search);
		panelp1.add(panel1);
		//				panelp2.add(panel6);

		JScrollPane scrollpane1 = new JScrollPane(list);
		panelp1.add(scrollpane1);



	

		frame.add(panelp,BorderLayout.NORTH);
		frame.add(panelp1,BorderLayout.SOUTH);

	}
//
//	/**
//	 * Fun��o onde que faz a pesquisa de uma palava inserida, na barra de pesquisa, clicando bot�o Facebook.
//	 * Aqui faz-se a pesquisa de de todos os estados onde se encontre a palavra pretendida 
//	 * @author Brogueira
//	 */

	
	public void getFaceTimeLine() {
		bface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=label.getText();
				System.out.println(procurar);
				bda.getFacebook().search(procurar,model);
			}
		});
	}
	
	public void getTwitterTimeLine() {
		btwitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=label.getText();
				System.out.println(procurar);
				bda.getTwitter().getTimeline(procurar,model);
			}
		});
	}
	
	public void getEmailTimeLine() {
		bmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=label.getText();
				System.out.println(procurar);
				bda.getMail().caixaChegada(model);
			}
		});
	}


  public void escreverPostFace() {
	  bescreverpostf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=textface.getText();
				System.out.println(procurar);
				bda.getMail().caixaChegada(model);
			}
		});
  }
  
  public void escreverPostTwitter() {
	  bescreverpost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=texttwitter.getText();
				System.out.println(procurar);
				bda.getTwitter().updateStatus(procurar);
			}
		});
  }
  
  public void escreverMail() {
	  bescrevermail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				String procurar=textmail.getText();
				System.out.println(procurar);
				bda.getMail().caixaChegada(model);
			}
		});
  }
  
  
}