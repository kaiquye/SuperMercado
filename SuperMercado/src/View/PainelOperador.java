package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.BuscarEstoque;
import Controller.arrayBuscar;
import Model.Produto;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class PainelOperador extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txt_codigoProduto;
	private JTextField txt_codigoDeBarras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelOperador frame = new PainelOperador();
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
	public PainelOperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton_1_1_2 = new JButton("Buscar ");
		btnNewButton_1_1_2.setBackground(SystemColor.activeCaption);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				String codigoProduto = txt_codigoProduto.getText();
				ArrayList<Produto> list = new ArrayList<>();
				Produto produto = new Produto(); 
				DefaultTableModel model = (DefaultTableModel) table.getModel();
			try {
				
				list = arrayBuscar.listarProduto(codigoProduto);
				for (int i = 0; i < list.size(); i++) {
					produto = list.get(i);
					String s [] = { produto.getNome(), produto.getMarca(), produto.getValor() };
					
					model.addRow(s);
				}
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
				 
				
				
				
				
				
				
				
				
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		txt_codigoProduto = new JTextField();
		txt_codigoProduto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite Codigo de Barras do produto");
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBackground(SystemColor.activeCaption);
		
		JButton btn_buscarPorCodigodeBarras = new JButton("Buscar ");
		btn_buscarPorCodigodeBarras.setBackground(SystemColor.activeCaption);
		btn_buscarPorCodigodeBarras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codigoDeBarras =  txt_codigoDeBarras.getText();
				
				
				ArrayList<Produto> list = new ArrayList<>();
				Produto produto = new Produto(); 
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				try {
					BuscarEstoque buscar = new BuscarEstoque();
					list =  buscar.buscarEstoque(codigoDeBarras);
					
					
					for(int i = 0; i < list.size(); i++) {
						produto = list.get(i);
						String [] s= { produto.getMarca(), produto.getNome(), produto.getEstoque().getQuantidade() };
						
						model.addRow(s);
					}
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
				
				
			}
		});
		
		txt_codigoDeBarras = new JTextField();
		txt_codigoDeBarras.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Digite Codigo de Barras do produto");
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		btnNewButton_1_2_1.setBackground(SystemColor.activeCaption);
		
		JButton btnNewButton_1_2_2 = new JButton("New button");
		btnNewButton_1_2_2.setBackground(SystemColor.activeCaption);
		
		JButton btnNewButton_1_2_2_1 = new JButton("New button");
		btnNewButton_1_2_2_1.setBackground(SystemColor.activeCaption);
		
		JButton btnNewButton_1_2_3 = new JButton("New button");
		btnNewButton_1_2_3.setBackground(SystemColor.activeCaption);
		
		JButton btnNewButton_1_2_4 = new JButton("New button");
		btnNewButton_1_2_4.setBackground(SystemColor.activeCaption);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addGap(48)
							.addComponent(txt_codigoProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(82))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNewButton_1_2_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_1_2_3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_1_2_4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton_1_2_2_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
												.addComponent(txt_codigoDeBarras, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
												.addComponent(btn_buscarPorCodigodeBarras, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
							.addGap(66)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(scrollPane, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
						.addComponent(btnNewButton_1_2_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txt_codigoProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_1_2)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(btn_buscarPorCodigodeBarras)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txt_codigoDeBarras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(btnNewButton_1_2_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_2_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_2_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_2_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		
		table_1 = new JTable();
		table_1.setBackground(Color.GRAY);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Quantidade", "Marca", "Produto"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		table = new JTable();
		table.setBackground(Color.GREEN);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Marca", "Valor", "Nome"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
