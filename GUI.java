import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

public class GUI extends JFrame{
	public DB data;
	private JTextField prenom;
	private JTextField nom;
	private JTextField nation;
	private JLabel label;
	Dimension text=new Dimension(100,20);
	
	public GUI(DB data){
		super();
		this.data=data;
		
		build();
	}
	
	private void build(){
		setTitle("Insertion de personnes"); 
		setSize(300,300); 
		setLocationRelativeTo(null); 
		setResizable(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JPanel l1 = new JPanel();
		l1.setLayout(new FlowLayout());
		JButton boutonH = new JButton(new GetActionH(this, "insert H"));
		JButton boutonF = new JButton(new GetActionH(this, "insert F"));
		l1.add(boutonH);
		l1.add(boutonF);
		
		JPanel l2 = new JPanel();
		//l2.setLayout(new BoxLayout(l2, BoxLayout.LINE_AXIS));
		l2.setLayout(new FlowLayout());
		JLabel l_prenom = new JLabel("Prenom");
		l2.add(l_prenom);
		prenom = new JTextField();
		prenom.setPreferredSize(text);
		prenom.setColumns(10);
		l2.add(prenom);
		
		JPanel l3 = new JPanel();
		//l3.setLayout(new BoxLayout(l3, BoxLayout.LINE_AXIS));
		l3.setLayout(new FlowLayout());
		JLabel l_nom = new JLabel("Nom   ");
		l3.add(l_nom);
		nom = new JTextField();
		nom.setPreferredSize(text);
		nom.setColumns(10);
		l3.add(nom);

		JPanel l4 = new JPanel();
		//l4.setLayout(new BoxLayout(l4, BoxLayout.LINE_AXIS));
		l4.setLayout(new FlowLayout());
		JLabel l_nation = new JLabel("Nation ");
		l4.add(l_nation);
		nation = new JTextField();
		nation.setPreferredSize(text);
		nation.setColumns(10);
		l4.add(nation);
		
		JPanel l5 = new JPanel();
		l5.setLayout(new BoxLayout(l5, BoxLayout.LINE_AXIS));
		label = new JLabel("---");
		l5.add(label);
				
		panel.add(l1);
				
		panel.add(l2);
		
		panel.add(l3);
		
		panel.add(l4);
				
		panel.add(l5);
		
		return panel;
	}
	
	public JTextField get_prenom(){
		return prenom;
	}
	
	public JTextField get_nom(){
		return nom;
	}
	
	public JTextField get_nation(){
		return nation;
	}
	
	public JLabel getLabel(){
		return label;
	}
}
