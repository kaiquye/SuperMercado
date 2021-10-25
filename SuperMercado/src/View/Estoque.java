package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.CadastrarProduto;
import Model.EstoqueProduto;
import Model.Produto;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Estoque extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nameProduct;
	private JTextField txt_marcaProduto;
	private JTextField txt_validadeProduto;
	private JTextField txt_valorProduto;
	private JTextField txt_codigoProduto;
	private JTextField textField_5;
	private JTextField txt_quantidadeProduto_1;
	private JTextField txt_valortotalProduto;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque frame = new Estoque();
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
	public Estoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_nameProduct = new JTextField();
		txt_nameProduct.setBounds(270, 27, 495, 20);
		contentPane.add(txt_nameProduct);
		txt_nameProduct.setColumns(10);
		
		txt_marcaProduto = new JTextField();
		txt_marcaProduto.setColumns(10);
		txt_marcaProduto.setBounds(270, 58, 495, 20);
		contentPane.add(txt_marcaProduto);
		
		txt_validadeProduto = new JTextField();
		txt_validadeProduto.setColumns(10);
		txt_validadeProduto.setBounds(270, 90, 495, 20);
		contentPane.add(txt_validadeProduto);
		
		txt_valorProduto = new JTextField();
		txt_valorProduto.setColumns(10);
		txt_valorProduto.setBounds(270, 121, 74, 20);
		contentPane.add(txt_valorProduto);
		
		JLabel lblNewLabel = new JLabel("Nome do Produto : ");
		lblNewLabel.setBounds(28, 27, 232, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarcaDoProduto = new JLabel("Marca do produto  : ");
		lblMarcaDoProduto.setBounds(28, 58, 232, 17);
		contentPane.add(lblMarcaDoProduto);
		
		JLabel asdaslblNewLabel_1_1 = new JLabel("Validade do produto\r\n : ");
		asdaslblNewLabel_1_1.setBounds(28, 90, 232, 17);
		contentPane.add(asdaslblNewLabel_1_1);
		
		JLabel asd123asdtxt_validadeProduto_1 = new JLabel("Valor por produto :\r\n");
		asd123asdtxt_validadeProduto_1.setBounds(28, 123, 232, 17);
		contentPane.add(asd123asdtxt_validadeProduto_1);
		
		txt_codigoProduto = new JTextField();
		txt_codigoProduto.setColumns(10);
		txt_codigoProduto.setBounds(270, 152, 495, 20);
		contentPane.add(txt_codigoProduto);
		
		JLabel dassatxt_codigodebarrasProduto = new JLabel("Codigo de Barras\r\n :");
		dassatxt_codigodebarrasProduto.setBounds(28, 155, 232, 17);
		contentPane.add(dassatxt_codigodebarrasProduto);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Descri\u00E7\u00E3o do produto :");
		lblNewLabel_1_1_1_1.setBounds(28, 182, 232, 116);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(270, 183, 495, 115);
		contentPane.add(textField_5);
		
		txt_quantidadeProduto_1 = new JTextField();
		txt_quantidadeProduto_1.setColumns(10);
		txt_quantidadeProduto_1.setBounds(270, 309, 74, 20);
		contentPane.add(txt_quantidadeProduto_1);
		
		JLabel das = new JLabel("Quantidade : \r\n");
		das.setBounds(28, 309, 232, 17);
		contentPane.add(das);
		
		JButton btn_cadastrarProduto = new JButton("Cadastrar produto");
		btn_cadastrarProduto.addActionListener(new ActionListener() {
			
			
			//cadastrar produto no banco de dados
			public void actionPerformed(ActionEvent e) {
					
				
			String quantidade  = txt_quantidadeProduto_1.getText();
			String validade = txt_validadeProduto.getText();
			String valorTotal = txt_valortotalProduto.getText();
			String valor = txt_valorProduto.getText();
			String marca = txt_marcaProduto.getText();
			String nome = txt_nameProduct.getText();
			String codigoProduto_ = txt_codigoProduto.getText();
			
			
			EstoqueProduto estoqueProduto = new EstoqueProduto();			
			CadastrarProduto cadastrarProduto = new CadastrarProduto();
			
			
			Produto produto = new Produto();
			
			if(true) {
				//CRIANDO UM NOVO PRODUTO
			 
				estoqueProduto.setQuantidade(quantidade);
				estoqueProduto.setValidade(validade);
				estoqueProduto.setValorTotal(valorTotal);
				estoqueProduto.setId(codigoProduto_);
				
				
				produto.setEstoque(estoqueProduto);
				produto.setNome(nome);
				produto.setValor(valor);
				produto.setMarca(marca);
				 
				
				
				 
				cadastrarProduto.cadastrarEstoque(produto);
				cadastrarProduto.cadastrarProduto(produto); 	
			}else { JOptionPane.showMessageDialog(null, "Erro. Preeencha todos os campos !!! ."); }
			
			 
				
			}
		});
		btn_cadastrarProduto.setBounds(10, 386, 847, 44);
		contentPane.add(btn_cadastrarProduto);
		
		JButton btnNewButton_1_1_3 = new JButton("PAINEL DO OPERADOR");
		btnNewButton_1_1_3.setBounds(34, 484, 192, 49);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_3_1 = new JButton("PAINEL DE VENDAS ");
		btnNewButton_1_1_3_1.setBounds(236, 484, 192, 49);
		contentPane.add(btnNewButton_1_1_3_1);
		
		JButton btnNewButton_1_1_3_2 = new JButton("PAINEL DE CADASTRO");
		btnNewButton_1_1_3_2.setBounds(438, 484, 192, 49);
		contentPane.add(btnNewButton_1_1_3_2);
		
		JButton btnNewButton_1_1_3_3 = new JButton("PAINEL DE ESTOQUE");
		btnNewButton_1_1_3_3.setBounds(640, 484, 192, 49);
		contentPane.add(btnNewButton_1_1_3_3);
		
		txt_valortotalProduto = new JTextField();
		txt_valortotalProduto.setColumns(10);
		txt_valortotalProduto.setBounds(523, 121, 74, 20);
		contentPane.add(txt_valortotalProduto);
		
		JLabel asd123asdtxt_validadeProduto_1_1 = new JLabel("Valor por produto :\r\n");
		asd123asdtxt_validadeProduto_1_1.setBounds(354, 124, 232, 17);
		contentPane.add(asd123asdtxt_validadeProduto_1_1);
		
		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(377, 312, 232, 17);
		contentPane.add(lblCodigo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(559, 309, 74, 20);
		contentPane.add(textField);
	}
}
