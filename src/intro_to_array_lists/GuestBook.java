package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	ArrayList<String> names = new ArrayList<String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button1 = new JButton("View Names");
	int a =1;
	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.setup();
	}
	void setup() {
		frame.setVisible(true);
		button.addActionListener(this);
		button1.addActionListener(this);
		panel.add(button);
		panel.add(button1);
		frame.add(panel);
		frame.pack();
	}

	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
String newName = JOptionPane.showInputDialog(null,"Enter a name to add to your Guest List");
names.add(newName);
		}
		if (e.getSource() == button1) {
for(int i=0;i<names.size();i++) {
	String s = names.get(i);
	System.out.println("Guest #" + a++ + ": " + s);
}
		}
	}
}
