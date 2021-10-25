package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.arrayBuscar;
import Dao.CadastrarOperador;
import Dao.CadastrarProduto;
import Model.Operador;
import Model.Produto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txt_operador;
	private JTextField txt_caixa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 78, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(65, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txt_operador = new JTextField();
		txt_operador.setBounds(136, 75, 177, 20);
		contentPane.add(txt_operador);
		txt_operador.setColumns(10);
		
		txt_caixa = new JTextField();
		txt_caixa.setColumns(10);
		txt_caixa.setBounds(136, 115, 177, 20);
		contentPane.add(txt_caixa);
		
		JButton btn_cadastrar = new JButton("Cadastrar");
		btn_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CADASTRAR OPERADOR
				
		  ///////////////////////////////////////////////////////////////////////////////////
				
				CadastrarProduto cas = new CadastrarProduto();
				Produto produto = new Produto();
			//	produto  = cas.buscarProduto("312");
				
				try {
						ArrayList<Produto> pp = new ArrayList<>();
					
						pp = arrayBuscar.listarProduto("312");
						
						for(int i = 0; i < pp.size(); i++) {
							produto = pp.get(i);
							System.out.println("O resultado KAIC > "+ produto.getMarca()  + "   " + produto.getNome() + "   " + produto.getValor());
						}
					 
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
		 
				
				
				
				
			///////////////////////////////////////////////////////////////////////////////////
				
				String operador = txt_operador.getText();
				String caixa = txt_caixa.getText();
				
				 
				Operador operador_JB = new Operador();
				Estoque est = new Estoque();
				
				if(!operador.isEmpty() && caixa.isEmpty()) {
					 
					operador_JB.setNome(operador);
					operador_JB.setCaixa(caixa);
				
					CadastrarOperador cadastroOperador = new CadastrarOperador();
				
					cadastroOperador.CadastrarOperador(operador_JB);
					
					est = new Estoque();
					est.setVisible(true);
				}else { JOptionPane.showMessageDialog(null, "Erro. Preeencha todos os campos.");}
				
			
			}
			
			
			
		});
		btn_cadastrar.setBounds(136, 155, 177, 23);
		contentPane.add(btn_cadastrar);
	}

}
