package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LocalizarLivro {

	private JFrame frame;
	private JTextField textNomeLivro;
	private JTextField textAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalizarLivro window = new LocalizarLivro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalizarLivro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuLocaliza = new JMenuBar();
		frame.setJMenuBar(menuLocaliza);
		
		JMenu mnLocaliza = new JMenu("Menu");
		menuLocaliza.add(mnLocaliza);
		
		JMenuItem mntmLocaliza = new JMenuItem("Voltar");
		mnLocaliza.add(mntmLocaliza);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mnLocaliza.add(mntmAjuda);
		
		JLabel lblNewLabel = new JLabel("Localizar livro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JLabel lblNomeLivro = new JLabel("Nome do Livro:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 23, 89, 17);
		painelCampos.add(lblNomeLivro);
		
		textNomeLivro = new JTextField();
		textNomeLivro.setColumns(10);
		textNomeLivro.setBounds(96, 23, 259, 20);
		painelCampos.add(textNomeLivro);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 60, 60, 14);
		painelCampos.add(lblAutor);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(55, 57, 300, 20);
		painelCampos.add(textAutor);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(175, 108, 89, 23);
		painelCampos.add(btnBuscar);
	}

}
