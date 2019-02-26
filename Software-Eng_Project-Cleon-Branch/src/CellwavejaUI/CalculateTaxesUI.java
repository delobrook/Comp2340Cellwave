package CellwavejaUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculateTaxesUI extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public CalculateTaxesUI() {
		setLayout(null);
		
		JLabel lblCalculateTaxes = new JLabel("Calculate Tax of a product");
		lblCalculateTaxes.setBounds(0, 0, 511, 22);
		lblCalculateTaxes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalculateTaxes.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCalculateTaxes);
		
		JLabel lblEnterCurrentPercentage = new JLabel("Enter current percentage of G.C.T:");
		lblEnterCurrentPercentage.setBounds(0, 188, 272, 30);
		lblEnterCurrentPercentage.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterCurrentPercentage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblEnterCurrentPercentage);
		
		textField = new JTextField();
		textField.setBounds(300, 190, 72, 30);
		add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Enter Model Number of product:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 151, 244, 30);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(256, 153, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);


		
		JButton btnNewButton = new JButton("Enter GCT");
		btnNewButton.setBounds(68, 245, 97, 25);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(363, 246, 116, 21);
		add(lblNewLabel_1);
		
		JLabel lblTax = new JLabel("TAX:");
		lblTax.setBounds(233, 249, 56, 16);
		add(lblTax);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_1.setText(String.valueOf(taxes(Double.parseDouble(textField.getText()),textField_1.getText())));
			}
		});
		
	}
	
	 public double taxes(double tax,String model) {
			

			double amount = 0;
			for (Core.Product p : addproductinformationGUI.newProducts) {
				if (p.equals(model)) {
					
					int item = p.getQuantity();

					return amount = item * p.getSellingPrice();
				}
			}


			return tax * amount;
		}
}
