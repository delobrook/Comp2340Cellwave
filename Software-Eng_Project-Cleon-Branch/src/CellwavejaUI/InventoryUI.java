package CellwavejaUI;
import Core.*;
import java.util.*;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.Popup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryUI extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTable table;
	ArrayList <String> productimagename;
	/**
	 * Create the panel.
	 */
	public InventoryUI() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		
		DefaultTableModel tmodel=new DefaultTableModel();

		tmodel.addColumn("Model#");
		tmodel.addColumn("Product Name");
		tmodel.addColumn("Product Type");
		tmodel.addColumn("Quantity");
		tmodel.addColumn("Colour");
		tmodel.addColumn("Cost Price");
		tmodel.addColumn("Selling Price");
		tmodel.addColumn("Description");
		for(int x=0; x<table.getRowCount();x++) {
			tmodel.removeRow(x);
			
		}
		addproductinformationGUI.newProducts.clear();
		if(ReadFile.readProductfile()==true) {
			productimagename =new ArrayList<String>();
			for(Product p:addproductinformationGUI.newProducts) {
				productimagename.add(p.getImageName());
			}
			for (int i=0; i<addproductinformationGUI.newProducts.size(); i++){
				tmodel.addRow(addproductinformationGUI.newProducts.get(i).print());
			}
		}
		table.setModel(tmodel);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
		
		JLabel lblProductInventory = new JLabel("Product Inventory");
		lblProductInventory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblProductInventory);
		
		JButton btnNewButton = new JButton("",new ImageIcon(InventoryUI.class.getResource("images\\add product.PNG")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removeAll();
				add(new addproductinformationGUI());
				revalidate();
			}
		});
		btnNewButton.setToolTipText("Add new product to inventory");	
		btnNewButton.setPreferredSize(new Dimension (30,30));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("",new ImageIcon(InventoryUI.class.getResource("\\images\\trashcanicon.PNG")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selrow=table.getSelectedRow();
				if (selrow>=0) {
					tmodel.removeRow(selrow);
					addproductinformationGUI.newProducts.remove(selrow);
					productimagename.remove(selrow);
					if(WriteFile.writeToProductFile()==true) {
						for (int i=0; i<addproductinformationGUI.newProducts.size(); i++){
							tmodel.addRow(addproductinformationGUI.newProducts.get(i).print());
						}
					}
				}
				
			}
		});
		btnNewButton_1.setToolTipText("Remove Product from inventory");
		btnNewButton_1.setPreferredSize(new Dimension(30,30));
		panel.add(btnNewButton_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addproductinformationGUI.newProducts.clear();
				for(int i=0; i<tmodel.getRowCount();i++) {
					Product.createProduct(tmodel.getValueAt(i, 0).toString(),tmodel.getValueAt(i, 1).toString() , tmodel.getValueAt(i, 2).toString(), tmodel.getValueAt(i, 7).toString(),
							Float.parseFloat(tmodel.getValueAt(i, 5).toString()),Float.parseFloat( tmodel.getValueAt(i, 6).toString()),Integer.parseInt(tmodel.getValueAt(i, 3).toString()),productimagename.get(i), tmodel.getValueAt(i, 4).toString());
				
				}
				if(WriteFile.writeToProductFile()==true) {
				System.out.println("updated");
					
				}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdate.setToolTipText("update file with changes you made");
		panel.add(btnUpdate);
		
		
		

	}

}

