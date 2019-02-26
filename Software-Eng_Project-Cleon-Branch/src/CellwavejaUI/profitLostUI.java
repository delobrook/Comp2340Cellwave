package CellwavejaUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import Core.Product;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class profitLostUI extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public profitLostUI() {
		setLayout(null);
		
		JLabel lblCalculateProfitloss = new JLabel("Calculate Profit/Loss");
		lblCalculateProfitloss.setBounds(0, 0, 450, 22);
		lblCalculateProfitloss.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculateProfitloss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblCalculateProfitloss);
		
		JLabel lblEnterSerialNumber = new JLabel("Enter Model number:");
		lblEnterSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterSerialNumber.setBounds(12, 69, 168, 30);
		add(lblEnterSerialNumber);
		
		textField = new JTextField();
		textField.setBounds(183, 71, 116, 30);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblProfitloss = new JLabel("Profit/Loss =");
		lblProfitloss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProfitloss.setBounds(12, 122, 133, 30);
		add(lblProfitloss);
		
		JLabel lblresult = new JLabel("\"Result\"");
		lblresult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblresult.setBounds(145, 122, 133, 30);
		add(lblresult);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblresult.setText(String.valueOf(profit_Loss(textField.getText())));
			}
		});
		btnCalculate.setBounds(341, 74, 97, 25);
		add(btnCalculate);

	}
	 public  float profit_Loss(String model) {
			
			float pL = 0;
			for ( int i =0;i<addproductinformationGUI.newProducts.size(); i++) {
				String m = addproductinformationGUI.newProducts.get(i).getModelNumber();
				if (m.equals(model)) {
					pL =  addproductinformationGUI.newProducts.get(i).getSellingPrice()- addproductinformationGUI.newProducts.get(i).getSellingPrice();
					return pL;
				} else {
					
					System.out.println("Product not found!");
					return pL = 0;
				}

			}
			return pL;
		}
}