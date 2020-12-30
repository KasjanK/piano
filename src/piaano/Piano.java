package piaano;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Piano implements Runnable {

	private JFrame frame;

	 // Launch the application
	
	public void run() {
		try {
			Piano window = new Piano();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Create the application

	public Piano() {
		initialize();
	}


	// Initialize the contents of the frame

	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 525, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\C.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setBounds(30, 161, 56, 205);
		frame.getContentPane().add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\D.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(96, 161, 56, 205);
		frame.getContentPane().add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\E.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnE.setBounds(162, 161, 56, 205);
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\F.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnF.setBounds(228, 161, 56, 205);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\G.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnG.setBounds(294, 161, 56, 205);
		frame.getContentPane().add(btnG);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\A.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnA.setBounds(360, 161, 56, 205);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\B.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnB.setBounds(426, 161, 56, 205);
		frame.getContentPane().add(btnB);
		
		JButton btnCSharp = new JButton("C#");
		btnCSharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\C_s.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnCSharp.setBackground(Color.BLACK);
		btnCSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCSharp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCSharp.setBounds(64, 10, 56, 141);
		frame.getContentPane().add(btnCSharp);
		
		JButton btnDSharp = new JButton("D#");
		btnDSharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\D_s.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnDSharp.setBackground(Color.BLACK);
		btnDSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnDSharp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDSharp.setBounds(130, 10, 56, 141);
		frame.getContentPane().add(btnDSharp);
		
		JButton btnFSharp = new JButton("F#");
		btnFSharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\F_s.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnFSharp.setBackground(Color.BLACK);
		btnFSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnFSharp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFSharp.setBounds(261, 10, 56, 141);
		frame.getContentPane().add(btnFSharp);
		
		JButton btnGSharp = new JButton("G#");
		btnGSharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\G_s.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnGSharp.setBackground(Color.BLACK);
		btnGSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnGSharp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGSharp.setBounds(327, 10, 56, 141);
		frame.getContentPane().add(btnGSharp);
		
		JButton btnBFlat = new JButton("Bb");
		btnBFlat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File(".\\src\\piaano\\pianoNotes\\Bb.wav")));
					clip.start();
				} 
				catch(Exception exc) {	
				}
			}
		});
		btnBFlat.setBackground(Color.BLACK);
		btnBFlat.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBFlat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBFlat.setBounds(393, 10, 56, 141);
		frame.getContentPane().add(btnBFlat);
	}
}
