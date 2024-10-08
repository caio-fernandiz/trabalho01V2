package trabalho01V2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela {

	private JFrame frame;
	private JTextField digitaNome;
	private JTextField digitaDia;	
	private JTextField digitaMes;
	private JTextField digitaAno;
	private JTextField digitaEmail;
	private JTextField digitaCpf;
	private JLabel recebeNome;
	private JLabel recebeDia;
	private JLabel recebeMes;
	private JLabel recebeAno;
	private JLabel recebeEmail;
	private JLabel recebeCPF;
	private String nome, email, cpf, dia, mes, ano;
	private int resultadoIdade;
    private static final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,6}$";
    private static final Pattern emailPattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
    private static final Pattern nomePattern = Pattern.compile("^[a-zA-Z\\s]+$");
    
   
    
	
	 private boolean isValidEmail(String email) {
         String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
         Pattern pattern = Pattern.compile(emailRegex);
         return pattern.matcher(email).matches();
     }
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
		

		JLabel barra1 = new JLabel("/");
		barra1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		barra1.setBounds(73, 167, 16, 41);
		frame.getContentPane().add(barra1);
		
		digitaMes = new JTextField();
		digitaMes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaMes.setColumns(10);
		digitaMes.setBounds(99, 167, 43, 41);
		frame.getContentPane().add(digitaMes);
		
		JLabel barra2 = new JLabel("/");
		barra2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		barra2.setBounds(152, 167, 16, 41);
		frame.getContentPane().add(barra2);
		
		digitaAno = new JTextField();
		digitaAno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaAno.setColumns(10);
		digitaAno.setBounds(178, 167, 76, 41);
		frame.getContentPane().add(digitaAno);
		
		recebeDia = new JLabel("");
		recebeDia.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeDia.setBounds(327, 167, 43, 41);
		frame.getContentPane().add(recebeDia);
		
		JLabel barra3 = new JLabel("/");
		barra3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		barra3.setBounds(380, 167, 16, 41);
		frame.getContentPane().add(barra3);
		
		recebeMes = new JLabel("");
		recebeMes.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeMes.setBounds(406, 167, 43, 41);
		frame.getContentPane().add(recebeMes);
		
		JLabel barra4 = new JLabel("/");
		barra4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		barra4.setBounds(459, 167, 16, 41);
		frame.getContentPane().add(barra4);
		
		recebeAno = new JLabel("");
		recebeAno.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeAno.setBounds(485, 167, 76, 41);
		frame.getContentPane().add(recebeAno);
		
		recebeEmail = new JLabel("");
		recebeEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeEmail.setBounds(327, 271, 249, 41);
		frame.getContentPane().add(recebeEmail);
		
		recebeCPF = new JLabel("");
		recebeCPF.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeCPF.setBounds(327, 375, 249, 41);
		frame.getContentPane().add(recebeCPF);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 603, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel indicaNome = new JLabel("Nome");
		indicaNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaNome.setBounds(10, 11, 160, 41);
		frame.getContentPane().add(indicaNome);
		
		digitaNome = new JTextField();
		digitaNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaNome.setBounds(10, 63, 259, 41);
		frame.getContentPane().add(digitaNome);
		digitaNome.setColumns(10);
		
		recebeNome = new JLabel("");
		recebeNome.setFont(new Font("Tahoma", Font.PLAIN, 30));
		recebeNome.setBounds(327, 63, 249, 41);
		frame.getContentPane().add(recebeNome);
		
		JLabel indicaDataNascimento = new JLabel("Data De Nascimento");
		indicaDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaDataNascimento.setBounds(10, 115, 276, 41);
		frame.getContentPane().add(indicaDataNascimento);
		
		digitaDia = new JTextField();
		digitaDia.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaDia.setColumns(10);
		digitaDia.setBounds(20, 167, 43, 41);
		frame.getContentPane().add(digitaDia);
		
		JLabel indicaEmail = new JLabel("E-mail");
		indicaEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaEmail.setBounds(10, 219, 160, 41);
		frame.getContentPane().add(indicaEmail);
		
		digitaEmail = new JTextField();
		digitaEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaEmail.setColumns(10);
		digitaEmail.setBounds(10, 271, 259, 41);
		frame.getContentPane().add(digitaEmail);
		
		JLabel indicaCpf = new JLabel("CPF");
		indicaCpf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		indicaCpf.setBounds(10, 323, 160, 41);
		frame.getContentPane().add(indicaCpf);
		
		digitaCpf = new JTextField();
		digitaCpf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		digitaCpf.setColumns(10);
		digitaCpf.setBounds(10, 375, 242, 41);
		frame.getContentPane().add(digitaCpf);
		
		JButton btValidar = new JButton("Validar");
		btValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nome = digitaNome.getText();
		
				dia = digitaDia.getText();
				mes = digitaMes.getText();
				ano = digitaAno.getText();
				
			
				
				email = digitaEmail.getText();
				
				cpf = digitaCpf.getText();
				
				if(nome.equals("" ) || dia.equals("") || mes.equals("") || ano.equals("") || email.equals("") || cpf.equals("")) {
					
					JOptionPane.showMessageDialog(null, "Falta informação");
				}
				
				else {				
										
						if(!nome.matches("[\\p{L} ]+")) {
							
							JOptionPane.showMessageDialog(null, "Nome inválido");
						}
						
						if(!dia.matches("[0-9]+") || !mes.matches("[0-9]+") || !ano.matches("[0-9]+")) {
							
							JOptionPane.showMessageDialog(null, "Data inválida");
						}
						
						if(!isValidEmail(email)) {
							
							JOptionPane.showMessageDialog(null, "E-mail inválido");
						}
						
						if(!ValidaCPF.isCPF(cpf)) {
							JOptionPane.showMessageDialog(null, "CPF inválido");
						}
						
						else {
					
							int anoInt = Integer.valueOf(ano);
				
							resultadoIdade = 2024 - anoInt;
							
							if(resultadoIdade <18 || resultadoIdade >=90) {
								
								JOptionPane.showMessageDialog(null, "Data inválida");
							}
							
							else if(nome.matches("[\\p{L} ]+") 
									&& dia.matches("[0-9]+") && mes.matches("[0-9]+") && ano.matches("[0-9]+") && resultadoIdade >= 18 && resultadoIdade <90
									&& isValidEmail(email)
									&& ValidaCPF.isCPF(cpf)) {
							
								recebeNome.setText(nome);
							
								recebeDia.setText(dia);
								recebeMes.setText(mes);
								recebeAno.setText(ano);
							
								recebeEmail.setText(email);
							
								recebeCPF.setText(ValidaCPF.imprimeCPF(cpf));
							}
						}
	
				}
				
				
			}
		});
		btValidar.setBounds(109, 440, 109, 40);
		frame.getContentPane().add(btValidar);
		
		
	}
}
