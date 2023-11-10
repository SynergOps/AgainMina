import java.awt.EventQueue;

import javax.swing.JFrame;
/*import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.ImageIcon;*/
//import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
//import java.awt.TextField;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
//import java.awt.TextArea;
import java.awt.Button;
//import java.awt.Checkbox;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JMenu;
//import java.awt.Scrollbar;
//import java.util.Scanner;
import java.awt.*;
//import java.awt.event.*;
//import javax.swing.JScrollBar;
//import javax.swing.JCheckBox;
//import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import javax.swing.UIManager;

public class AgainMina extends Frame
{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmMinadot;
	public JTextArea Transcript1;
	public JTextArea Transcript2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgainMina window = new AgainMina();
					window.frmMinadot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public AgainMina() {
		initialize(null);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param b 
	 */
	private void initialize(Object b) {
		frmMinadot = new JFrame();
		frmMinadot.setTitle("MinaDot");
		frmMinadot.setBounds(0, 0, 800, 560);
		frmMinadot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinadot.getContentPane().setLayout(null);
		
		JLabel lblTextToTranscript = new JLabel("Text to Transcript:");
		lblTextToTranscript.setBounds(10, 42, 171, 14);
		frmMinadot.getContentPane().add(lblTextToTranscript);
		
		JTextArea Transcript1_1 = new JTextArea();
		Transcript1_1.setBounds(10, 67, 655, 105);
		JScrollPane sp = new JScrollPane (Transcript1_1);
		sp.setBounds(10, 67, 655, 105);
		frmMinadot.getContentPane().add(sp);
		
		JLabel lblTranscript = new JLabel("Transcript:");
		lblTranscript.setBounds(10, 196, 201, 14);
		frmMinadot.getContentPane().add(lblTranscript);
		
		JTextArea Transcript2 = new JTextArea();
		Transcript2.setBounds(10, 221, 655, 264);
		JScrollPane sp2 = new JScrollPane (Transcript2);
		sp2.setBounds(10, 221, 655, 264);
		frmMinadot.getContentPane().add(sp2);
		
		Button button = new Button("Transcript");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Transcript1_1.getText());
				TranscriptText(Transcript1_1.getText(), Transcript2);
			
			}
		});
		button.setBounds(704, 188, 70, 22);
		frmMinadot.getContentPane().add(button);

		
		Button button_1 = new Button("Clear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Transcript1_1.setText("  ");
				Transcript2.setText("  ");
			
			}
		});
		button_1.setBounds(704, 67, 70, 22);
		frmMinadot.getContentPane().add(button_1);
		
		Button button_2 = new Button("Select All & Copy");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transcript2.selectAll();
				button_2.transferFocusBackward();
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection ss = new StringSelection(Transcript2.getText());
				clipboard.setContents(ss, null);
			
			}
		});
		button_2.setBounds(671, 321, 103, 31);
		frmMinadot.getContentPane().add(button_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 183, 655, 2);
		frmMinadot.getContentPane().add(separator);
		
		JLabel lblgaroufosPApostolos = new JLabel("\u00A9Garoufos P. Apostolos");
		lblgaroufosPApostolos.setBounds(0, 496, 181, 14);
		frmMinadot.getContentPane().add(lblgaroufosPApostolos);
		
		JLabel lblApogaroufosgmailcom = new JLabel("apogaroufos@gmail.com");
		lblApogaroufosgmailcom.setBounds(147, 496, 228, 14);
		frmMinadot.getContentPane().add(lblApogaroufosgmailcom);
		
		JLabel label = new JLabel("2018");
		label.setBounds(119, 507, 46, 14);
		frmMinadot.getContentPane().add(label);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 115, 31);
		frmMinadot.getContentPane().add(menuBar);
		
		JMenu mnSelect = new JMenu("Select Language");
		menuBar.add(mnSelect);
		
		JRadioButtonMenuItem rdbtnmntmGreekAndEnglish = new JRadioButtonMenuItem("Greek and English");
		mnSelect.add(rdbtnmntmGreekAndEnglish);
		
		JRadioButtonMenuItem rdbtnmntmEnglishAndGreek = new JRadioButtonMenuItem("English and Greek");
		mnSelect.add(rdbtnmntmEnglishAndGreek);
		
		JButton btnTextToSpeech = new JButton("Text To Speech");
		btnTextToSpeech.setForeground(Color.RED);
		btnTextToSpeech.setBounds(635, 8, 139, 23);
		frmMinadot.getContentPane().add(btnTextToSpeech);
		btnTextToSpeech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToSpeech frame = new TextToSpeech();
				frame.setVisible(true);
			}
		});
	}
	
	public void TranscriptText(String textTT, JTextArea TranscriptTT)

	{
			char x,y,z;
			int i,j;
			boolean n,e,c,c2,ce,c3;
			String a,b;
			n=false;
			e=false;
			c=false;
			c2=false;
			ce=false;
			c3=false;
			a=textTT;
			System.out.println(a);
			i=0;
			b="";
				while (i<a.length())
			{
				x=a.charAt(i);
				i=0;
				while (i<a.length())
				{
					x=a.charAt(i);
					if ((x>='a' && x<='z') || (x>='A' && x<='Z'))
					{
						if (e==false)
						{
							b+=("\u2830");
							e=true;
						}
					}
					if ((x>='Α' && x<='Ω') || x=='Ά' || x=='Ώ' || x=='Έ' || x=='Ή' || x=='Ί' || x=='Ύ' || x=='Ό')
					{
						if (c2==false)
						{
							if (i+1<a.length())
							{
								z=a.charAt(i+1);
								if (((z>='Α' && z<='Ω') || z=='Ά' || z=='Ώ' || z=='Έ' || z=='Ή' || z=='Ί' || z=='Ύ' || z=='Ό')) 
								{
									b+=("\u2828\u2828");
									c2=true;
									c=false;
								}
								else 
								{
									b+=("\u2828");
									c=true;
								}
							}
							else 
							{
								b+=("\u2828");
								c=true;
							}
						}
					}
					if ((x>='A' && x<='Z'))
					{
						if (c3==false)
						{
							if (i+1<a.length())
							{
								z=a.charAt(i+1);
								if (((z>='A' && z<='Z'))) 
								{
									b+=("\u2820\u2820");
									c3=true;
									ce=false;
								}
								else 
								{
									b+=("\u2820");
									ce=true;
								}
							}
							else 
							{
								b+=("\u2820");
								ce=true;
							}
						}
					}
					if ((x>='a' && x<='z') || (x>='A' && x<='Z') || (x>='α' && x<='ω') || (x>='Α' && x<='Ω') || x=='ά' || x=='Ά' || x=='έ' || x=='Έ' || x=='ί' || x=='Ί' || x=='ή' || x=='Ή' || x=='ώ' || x=='Ώ' || x=='ό' || x=='Ό' || x=='ύ' || x=='Ύ' )
					{
						n=false; 
						if (x=='a' || x=='α' || x=='ά')
						{
							if (x=='a' || x=='ά')
							{
								b+=("\u2801");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='ι' || y=='ί')
									{
										b+=("\u2823");
										i++;
									}
									else if (y=='υ' || y=='ύ')
									{
										b+=("\u2821");
										i++;
									}
									else 
									{
										b+=("\u2801");
									}
								}
								else 
								{
									b+=("\u2801");
								}
							}
						}
						else if (x=='A')
						{
							b+=("\u2801");
						}
						if (x=='Α' || x=='Ά')
						{
							if (x=='Ά')
							{
								b+=("\u2801");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if(y=='ι' || y=='ί' || y=='Ι' || y=='Ί')
									{
										b+=("\u2823");
										i++;
									}
									else if (y=='υ' || y=='ύ' || y=='Υ' || y=='Ύ')
									{
										b+=("\u2821");
										i++;
									}
									else 
									{
										b+=("\u2801");
									}
								}
								else
								{
									b+=("\u2801");
								}
							}
						}
						else if (x=='b' || x=='β')
						{
							b+=("\u2803");
						}
						else if (x=='B')
						{
							b+=("\u2803");
						}
						else if (x=='Β')
						{
							b+=("\u2803");
						}
						else if (x=='c')
						{
							b+=("\u2809");
						}
						else if (x=='C')
						{
							b+=("\u2809");
						}
						else if (x=='d' || x=='δ')
						{
							b+=("\u2819");
						}
						else if (x=='D')
						{
							b+=("\u2819");
						}
						else if (x=='Δ')
						{
							b+=("\u2819");
						}
						else if (x=='e' || x=='ε' || x=='έ')
						{
							if (x=='e' || x=='έ')
							{
								b+=("\u2811");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='ι' || y=='ί')
									{
										b+=("\u2829");
										i++;
									}
									else if (y=='υ' || y=='ύ')
									{
										b+=("\u2831");
										i++;
									}
									else 
									{
										b+=("\u2811");
									}
								}
								else 
								{
									b+=("\u2811");
								}
							}
						}
						else if (x=='E')
						{
							b+=("\u2811");
						}
						else if (x=='Ε' || x=='Έ')
						{
							if (x=='Έ')
							{
								b+=("\u2811");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if(y=='ι' || y=='ί' || y=='Ι' || y=='Ί')
									{
										b+=("\u2829");
										i++;
									}
									else if (y=='υ' || y=='ύ' || y=='Υ' || y=='Ύ')
									{
										b+=("\u2831");
										i++;
									}
									else 
									{
										b+=("\u2811");
									}
								}
								else
								{
									b+=("\u2811");
								}
							}
						}
						else if (x=='f' || x=='φ')
						{
							b+=("\u280b");
						}
						else if (x=='F')
						{
							b+=("\u280b");
						}
						else if (x=='Φ')
						{
							b+=("\u280b");
						}
						else if (x=='g' || x=='γ')
						{
							b+=("\u281b");
						}
						else if (x=='G')
						{
							b+=("\u281b");
						}
						else if (x=='Γ')
						{
							b+=("\u281b");
						}
						else if (x=='h' || x=='χ')
						{
							b+=("\u2813");
						}
						else if (x=='H')
						{
							b+=("\u2813");
						}
						else if (x=='Χ')
						{
							b+=("\u2813");
						}
						else if (x=='i'|| x=='ι' || x=='ί')
						{
							b+=("\u280a");
						}
						else if (x=='I')
						{
							b+=("\u280a");
						}
						else if (x=='Ι' || x=='Ί')
						{
							b+=("\u280a");
						}
						else if (x=='j' || x=='ω' || x=='ώ')
						{
							b+=("\u281a");
						}
						else if (x=='J')
						{
							b+=("\u281a");
						}
						else if (x=='Ω' || x=='Ώ')
						{
							b+=("\u281a");
						}
						else if (x=='k' || x=='κ')
						{
							b+=("\u2805");
						}
						else if (x=='K')
						{
							b+=("\u2805");
						}
						else if (x=='Κ')
						{
							b+=("\u2805");
						}
						else if (x=='l' || x=='λ')
						{
							b+=("\u2807");
						}
						else if (x=='L')
						{
							b+=("\u2807");
						}
						else if (x=='Λ')
						{
							b+=("\u2807");
						}
						else if (x=='m' || x=='μ')
						{
							b+=("\u280d");
						}
						else if (x=='M')
						{
							b+=("\u280d");
						}
						else if (x=='Μ')
						{
							b+=("\u280d");
						}
						else if (x=='n' || x=='ν')
						{
							b+=("\u281d");
						}
						else if (x=='N')
						{
							b+=("\u281d");
						}
						else if (x=='Ν')
						{
							b+=("\u281d");
						}
						else if (x=='o' || x=='ο' || x=='ό' || x=='>')
						{
							if (x=='o' || x=='ό')
							{
								b+="\u2815";
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='ι' || y=='ί')
									{
										b+="\u282a";
										i++;
									}
									else if (y=='υ' || y=='ύ')
									{
										b+="\u2825";
										i++;
									}
									else 
									{
										b+="\u2815";
									}
								}
								else 
								{
									b+="\u2815";
								}
							}
						}
						else if (x=='O')
						{
							b+=("\u2815");
						}
						else if (x=='Ο' || x=='Ό')
						{
							if (x=='Ό')
							{
								b+=("\u2815");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if(y=='ι' || y=='ί' || y=='Ι' || y=='Ί')
									{
										b+=("\u282a");
										i++;
									}
									else if (y=='υ' || y=='ύ' || y=='Υ' || y=='Ύ')
									{
										b+=("\u2825");
										i++;
									}
									else 
									{
										b+=("\u2815");
									}
								}
								else
								{
									b+=("\u2815");
								}
							}
						}
						else if (x=='p' || x=='π')
						{
							b+=("\u280f");
						}
						else if (x=='P')
						{
							b+=("\u280f");
						}
						else if (x=='Π')
						{
							b+=("\u280f");
						}
						else if (x=='q')
						{
							b+=("\u281f");
						}
						else if (x=='Q')
						{
							b+=("\u281f");
						}
						else if (x=='r' || x=='ρ')
						{
							b+=("\u2817");
						}
						else if (x=='R')
						{
							b+=("\u2817");
						}
						else if (x=='Ρ')
						{
							b+=("\u2817");
						}
						else if (x=='s' || x=='σ' || x=='ς')
						{
							b+=("\u280e");
						}
						else if (x=='S')
						{
							b+=("\u280e");
						}
						else if (x=='Σ')
						{
							b+=("\u280e");
						}
						else if (x=='t' || x=='τ')
						{
							b+=("\u281e");
						}
						else if (x=='T')
						{
							b+=("\u281e");
						}
						else if (x=='Τ')
						{
							b+=("\u281e");
						}
						else if (x=='u')
						{
							b+=("\u2825");
						}
						else if (x=='U')
						{
							b+=("\u2825");
						}
						else if (x=='v')
						{
							b+=("\u2827");
						}
						else if (x=='V')
						{
							b+=("\u2827");
						}
						else if (x=='w')
						{
							b+=("\u283a");
						}
						else if (x=='W')
						{
							b+=("\u283a");
						}
						else if (x=='x' || x=='ξ' || x=='=')
						{
							b+=("\u282d");
						}
						else if (x=='X')
						{
							b+=("\u282d");
						}
						else if (x=='Ξ')
						{
							b+=("\u282d");
						}
						else if (x=='y' || x=='υ' || x=='ύ')
						{
							if (x=='y' || x=='ύ')
							{
								b+=("\u283d");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='ι' || y=='ί')
									{
										b+=("\u2839");
										i++;
									}
									else 
									{
										b+=("\u283d");
									}
								}
							}
						}
						else if (x=='Y')
						{
							b+=("\u283d");
						}
						else if (x=='Υ' || x=='Ύ')
						{
							if (x=='Ύ')
							{
								b+=("\u283d");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='ι' || y=='ί' || y=='Ι' || y=='Ί')
									{
										b+=("\u2839");
										i++;
									}
									else 
									{
										b+=("\u283d");
									}
								}
							}
						}
						else if (x=='z' || x=='ζ')
						{
							b+=("\u2835");
						}
						else if (x=='Z')
						{
							b+=("\u2835");
						}
						else if (x=='Ζ')
						{
							b+=("\u2835");
						}
						if (x=='η' || x=='ή')
						{
							if (x=='ή')
							{
								b+=("\u281c");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='υ' || y=='ύ')
									{
										b+=("\u2833");
										i++;
									}
									else 
									{
										b+=("\u281c");
									}
								}
							}
						}
						else if (x=='Η' || x=='Ή')
						{
							if (x=='Ή')
							{
								b+=("\u281c");
							}
							else 
							{
								if (i+1<a.length())
								{
									y=a.charAt(i+1);
									if (y=='υ' || y=='ύ' || y=='Υ' || y=='Ύ')
									{
										b+=("\u2833");
										i++;
									}
									else 
									{
										b+=("\u281c");
									}
								}
							}
						}
						else if (x=='θ')
						{
							b+=("\u2839");
						}
						else if (x=='Θ')
						{
							b+=("\u2839");
						}
						else if (x=='ψ')
						{
							b+=("\u282f");
						}
						else if (x=='Ψ')
						{
							b+=("\u282f");
						}
					}
					if ((x>='0' && x<='9'))
					{
						if (n==false)
						{
							b+=("\u283c");
							n=true; 
						}
						if (x=='1')
						{
							b+=("\u2801");
						}
						else if (x=='2')
						{
							b+=("\u2803");
						}
						else if (x=='3')
						{
							b+=("\u2809");
						}
						else if (x=='4')
						{
							b+=("\u2819");
						}
						else if (x=='5')
						{
							b+=("\u2811");
						}
						else if (x=='6')
						{
							b+=("\u280b");
						}
						else if (x=='7')
						{
							b+=("\u281b");
						}
						else if (x=='8')
						{
							b+=("\u2813");
						}
						else if (x=='9')
						{
							b+=("\u280a");
						}
						else if (x=='0')
						{
							b+=("\u281a");
						}
					}
					else if (x=='.' || x==',' || x==':')
					{
						if (c2==true)
						{
							c2=false;
						}
						if (c3==true)
						{
							c3=false;
						}
						j=i+1;
						z=x;
						if(j<a.length())
						{
							z=a.charAt(j);
						}
						while (j<a.length() && (z=='<' || z=='>' || z=='=' || z=='.' || z==',' || z==':' || z=='·' || z==';' || z=='?' || z=='!' || z=='’' || z=='(' || z==')' || z=='*' || z=='[' || z==']' || z=='{' || z=='}' || z==' ' || z=='…' || z=='-' || z=='«' || z=='?' || z=='»' || z=='/' || z=='*' || z=='+' || z=='@' || z=='$' || z=='%' || z=='€'))
						{
							j++;
							if (j<a.length())
							{
								z=a.charAt(j);
							}
						}
						if (j<a.length() && ((z>='Α' && z<='Ω') || (z>='α' && z<='ω') || ( x=='ά' || x=='Ά' || x=='έ' || x=='Έ' || x=='ί' || x=='Ί' || x=='ή' || x=='Ή' || x=='ώ' || x=='Ώ' || x=='ό' || x=='Ό' || x=='ύ' || x=='Ύ')))
						{
							if (e==true)
							{
								b+=("\u2830");
								e=false;
							}
						}
						else if (j>=a.length() && e==true)
						{
							b+=("\u2830");
							e=false;
						}
						if (x=='.')
						{
							b+=("\u2832");
						}
						else if (x==',')
						{
							b+=("\u2802");
						}
						else if (x==':')
						{
							b+=("\u2812");
						}
					}
					else 
					{
						if ((c2==true) && !((x>='Α' && x<='Ω') || x=='Ά' || x=='Ώ' || x=='Έ' || x=='Ή' || x=='Ί' || x=='Ύ' || x=='Ό'))
						{
							c2=false;
						}
						if ((c3==true) && !((x>='A' && x<='Z')))
						{
							c3=false;
						}
						j=i+1;
						if (j<a.length())
						{
							z=a.charAt(j);
							while (j<a.length() && (z=='<' || z=='>' || z=='.' || z==',' || z==':' || z=='·' || z==';' || z=='?' || z=='!' || z=='’' || z=='(' || z==')' || z=='*' || z=='[' || z==']' || z=='{' || z=='}' || z==' ' || z=='…' || z=='-' || z=='«' || z=='?' || z=='»' || z=='/' || z=='*' || z=='+' || z=='@' || z=='$' || z=='%' || z=='€') || z=='=')
							{
								j++;
								if (j<a.length())
								{
									z=a.charAt(j);
								}
							}
							if (j<a.length() && ((z>='Α' && z<='Ω') || (z>='α' && z<='ω') || ( x=='ά' || x=='Ά' || x=='έ' || x=='Έ' || x=='ί' || x=='Ί' || x=='ή' || x=='Ή' || x=='ώ' || x=='Ώ' || x=='ό' || x=='Ό' || x=='ύ' || x=='Ύ')))
							{
								if (e==true)
								{
									b+=("\u2830");
									e=false;
								}
							}
							else if (j>=a.length() && e==true)
							{
								b+=("\u2830");
								e=false;
							}
						}
						else
						{
							if (e==true)
							{
								b+=("\u2830");
								e=false;
							}
						}
						n=false;
						if (x=='·')
						{
							b+=("\u2806");
						}
						else if (x==';' || x=='?')
						{
							b+=("\u2822");
						}
						else if (x=='!')
						{
							b+=("\u2816");
						}
						else if (x=='’')
						{
							b+=("\u2804");
						}
						else if (x=='=')
						{
							b+=("\u282d");
						}
						else if (x=='(' || x==')')
						{
							b+=("\u2836");
						}
						else if (x=='{' || x=='[')
						{
							b+=("\u2820"+"\u2836");
						}
						else if (x=='}' || x==']')
						{
							b+=("\u2836"+"\u2820");
						}
						else if (x=='…')
						{
							b+=("\u2804"+"\u2804"+"\u2804");
						}
						else if (x=='-')
						{
							b+=("\u2824");
						}
						else if (x=='«' || x=='?')
						{
							b+=("\u2826");
						}
						else if (x=='»')
						{
							b+=("\u2834");
						}
						else if (x=='/')
						{
							b+=("\u280c");
						}
						else if (x=='+')
						{
							b+=("\u282e");
						}
						else if (x=='*')
						{
							b+=("\u2821");
						}
						else if (x=='€')
						{
							b+=("\u2808\u2811");
						}
						else if (x=='$')
						{
							b+=("\u2808\u280e");
						}
						else if (x=='@')
						{
							b+=("\u2808\u2801\u281e");
						}
						else if (x=='%')
						{
							b+=("\u2808\u2834");
						}
						else if (x=='>')
						{
							b+=("\u2815");
						}
						else if (x=='<')
						{
							b+=("\u282a");
						}
						if (x==' ')
						{
							b+=("    ");
						}
						if (x=='\n')
						{
							b+=("\n");
						}
					}
					i++;
				}
				if (e==true)
				{
					b+=("\u2830");
				}
				TranscriptTT.setText(b);
			
		}	
}
}
