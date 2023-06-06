package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class SolicitarCompra {

	private JFrame frame;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditora;
	private JTextField textAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolicitarCompra window = new SolicitarCompra();
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
	public SolicitarCompra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mnMenu.add(mntmVoltar);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mnMenu.add(mntmAjuda);
		
		JLabel lblSolicitarCompra = new JLabel("Solicitar Compra de Livros");
		lblSolicitarCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitarCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblSolicitarCompra, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Solicita\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(10, 31, 46, 14);
		painelCampos.add(lblUsuario);
		
		JRadioButton rdbtnBibliotecario = new JRadioButton("Bibliotec\u00E1rio");
		rdbtnBibliotecario.setBounds(70, 27, 103, 23);
		painelCampos.add(rdbtnBibliotecario);
		
		JRadioButton rdbtnProfessor = new JRadioButton("Professor");
		rdbtnProfessor.setBounds(175, 27, 109, 23);
		painelCampos.add(rdbtnProfessor);
		
		JPanel painelCampos_1 = new JPanel();
		painelCampos_1.setLayout(null);
		painelCampos_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos_1.setBounds(10, 54, 414, 165);
		painelCampos.add(painelCampos_1);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(10, 23, 43, 17);
		painelCampos_1.add(lblTitulo);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(55, 21, 259, 20);
		painelCampos_1.add(textTitulo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 51, 60, 14);
		painelCampos_1.add(lblAutor);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(55, 51, 259, 20);
		painelCampos_1.add(textAutor);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(196, 132, 89, 23);
		painelCampos_1.add(btnCancelar);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditora.setBounds(10, 79, 60, 14);
		painelCampos_1.add(lblEditora);
		
		textEditora = new JTextField();
		textEditora.setColumns(10);
		textEditora.setBounds(55, 76, 259, 20);
		painelCampos_1.add(textEditora);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAno.setBounds(10, 104, 60, 14);
		painelCampos_1.add(lblAno);
		
		textAno = new JTextField();
		textAno.setColumns(10);
		textAno.setBounds(55, 101, 259, 20);
		painelCampos_1.add(textAno);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(92, 132, 89, 23);
		painelCampos_1.add(btnSalvar);
	}
}
