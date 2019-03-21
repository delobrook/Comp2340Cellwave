package CellwavejaUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Core.Product;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TransactionInformationUI extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TransactionInformationUI() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JTable table = new JTable();
		
		DefaultTableModel tmodel=new DefaultTableModel();
			
			tmodel.addColumn("Transaction #");
			tmodel.addColumn("Customer ID");
			tmodel.addColumn("Product Model #");
			tmodel.addColumn("Product Name");
			tmodel.addColumn("Product Type");
			tmodel.addColumn("Product Colour");
			tmodel.addColumn("Date & Time");
			tmodel.addColumn("Cash tendered");
			tmodel.addColumn("Cash || Card");
			
		for(int x=0; x<table.getRowCount();x++) {
				tmodel.removeRow(x);
				
		}
		AddnewTransactiontofile.newTransactions.clear();	
		if(ReadFile.readTransactionfile()==true) {
			for (int i=0; i<AddnewTransactiontofile.newTransactions.size(); i++){
				tmodel.addRow(AddnewTransactiontofile.newTransactions.get(i).print());
			}
		}
		table.setModel(tmodel);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
		
		JLabel lblProductInventory = new JLabel("Transactions");
		lblProductInventory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblProductInventory);
		
		JButton btnNewButton = new JButton("",new ImageIcon(InventoryUI.class.getResource("\\images\\add product.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new AddnewTransactiontofile(),BorderLayout.CENTER);
				revalidate();
			}
		});
		btnNewButton.setToolTipText("Add new transaction");	
		btnNewButton.setPreferredSize(new Dimension (30,30));
		panel.add(btnNewButton);
	}
		
}
