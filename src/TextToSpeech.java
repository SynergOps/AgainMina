import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.JTextPane; 
//import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
//import javax.sound.sampled.AudioFileFormat.Type;

class x 
{
	VoiceManager freettsvm;
	Voice freettsvoice; 
	private Voice voice; 
	public x (String voicename)
	{
		VoiceManager voiceManager = VoiceManager.getInstance();
		voice = voiceManager.getVoice(voicename);
	}
	public void speak (String arg)
	{
		freettsvoice.allocate();
		freettsvoice.speak(arg);
		freettsvoice.deallocate();
	}
}


public class TextToSpeech extends JFrame {
	static String voiceName = "kevin16"; // Voice type "alan","kevin","kevin16"
  //  static String voiceMsg = "Hi How are you?"; // The text to Speech
  //  static String fileLocation = "D://select"; // filename without extension
   

	private JPanel contentPane;
	private JFrame TexttoSpeech;
	private JFrame frame;
	private JTextArea txtSpeech;
	private static final String SayWhat = "tolis16";
	private Voice iTalk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextToSpeech frame = new TextToSpeech();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextToSpeech() {
		JTextArea textArea = new JTextArea();
		setTitle("Text To Speech");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(10, 11, 764, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Text To Speech");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 34));
		lblNewLabel.setBounds(236, 11, 347, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\\u039C\u03AC\u03B3\u03B4\u03B1\\Desktop\\Logo.png"));
		lblNewLabel_1.setBounds(21, 11, 116, 39);
		panel.add(lblNewLabel_1);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VoiceManager vm = VoiceManager.getInstance();
				iTalk = vm.getVoice("kevin16");
				iTalk.allocate();
				try{
					iTalk.speak(textArea.getText());
				} catch(Exception ex)
				{
					//JOptionPane.showConfirmDialog(null, "Can't Talk ME, have Error!!");
				}
				
				
				
				//txtSpeech.setText("");
				//txtSpeech.setText("textArea");
			}
		});
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlay.setBounds(10, 122, 89, 23);
		contentPane.add(btnPlay);
		
		//JTextArea textArea = new JTextArea();
		textArea.setBounds(109, 82, 665, 404);
		contentPane.add(textArea);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JLabel txtSpeech = null;
				textArea.setText(" ");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(10, 198, 89, 23);
		contentPane.add(btnClear);
		
		
		JLabel lblNewLabel_2 = new JLabel("\u00A9Garoufos P. Apostolos");
		lblNewLabel_2.setBounds(109, 497, 181, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("2019");
		label.setBounds(10, 497, 46, 14);
		contentPane.add(label);
		
		JLabel lblApogaroufosgmailcom = new JLabel("apogaroufos@gmail.com");
		lblApogaroufosgmailcom.setBounds(300, 497, 196, 14);
		contentPane.add(lblApogaroufosgmailcom);
	}
}
