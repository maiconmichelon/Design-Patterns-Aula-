package observer2;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Painel extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	private Vector<Assinante> assinantes = new Vector<Assinante>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Painel frame = new Painel();
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
	public Painel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNovaEdio = new JButton("Nova Edi\u00E7\u00E3o");
		btnNovaEdio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Revista.getInstance().novaEdicao();
			}
		});
		GridBagConstraints gbc_btnNovaEdio = new GridBagConstraints();
		gbc_btnNovaEdio.gridwidth = 2;
		gbc_btnNovaEdio.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNovaEdio.anchor = GridBagConstraints.NORTH;
		gbc_btnNovaEdio.insets = new Insets(0, 0, 5, 0);
		gbc_btnNovaEdio.gridx = 0;
		gbc_btnNovaEdio.gridy = 0;
		contentPane.add(btnNovaEdio, gbc_btnNovaEdio);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNovoAssinante = new JButton("Novo Assinante");
		btnNovoAssinante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Assinante assinante = new Assinante(textField.getText());
				Revista.getInstance().addObserver(assinante);
				assinantes.add(assinante);
				System.out.println("Novo assinante - " + textField.getText());
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnNovoAssinante = new GridBagConstraints();
		gbc_btnNovoAssinante.insets = new Insets(0, 0, 5, 0);
		gbc_btnNovoAssinante.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNovoAssinante.gridx = 1;
		gbc_btnNovoAssinante.gridy = 1;
		contentPane.add(btnNovoAssinante, gbc_btnNovoAssinante);
		
		list = new JList();
		list.setListData(assinantes);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(list, popupMenu);
		
		JMenuItem mntmRemover = new JMenuItem("Remover");
		mntmRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Assinante selectedValue = (Assinante) list.getSelectedValue();
				Revista.getInstance().deleteObserver(selectedValue);
				assinantes.remove(selectedValue);
			}
		});
		popupMenu.add(mntmRemover);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 2;
		contentPane.add(list, gbc_list);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
