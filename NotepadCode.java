package Notepad;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadCode implements ActionListener {
JFrame f;
JMenuBar m;
JMenu file, edit, help;
JMenuItem cut, copy, paste, selectAll;
JTextArea ta;

	NotepadCode(){
		f = new JFrame();
	cut = new JMenuItem("Cut");
	copy = new JMenuItem("Copy");
	paste = new JMenuItem("Paste");
	selectAll = new JMenuItem("Select All");
		
	cut.addActionListener(this);
	copy.addActionListener(this);
	paste.addActionListener(this);
	selectAll.addActionListener(this);
	
	m = new JMenuBar();
	m.setBounds(5,5,400,40);
	
	file = new JMenu("File");
	edit = new JMenu("Edit");
	help = new JMenu("Help");
	
	edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
	m.add(file);m.add(edit);m.add(help);
	
	JTextArea ta = new JTextArea();
	ta.setBounds(5,30,460,460);
	
	f.add(m);f.add(ta);
	
	f.setLayout(null);
	f.setSize(400, 400);
	f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==cut) {
		ta.cut();
	}else if(e.getSource()==copy) {
		ta.copy();
		
	}else if(e.getSource()==paste) {
		ta.paste();
	}else if(e.getSource()==selectAll) {
		ta.selectAll();
	}
		
	}
	public static void main(String []args) {
		new NotepadCode();
	}

}