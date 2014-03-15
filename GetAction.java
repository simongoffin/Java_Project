import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class GetAction extends AbstractAction {
	private FenetreSaisie fenetre;
	
	public GetAction(FenetreSaisie fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		String prenom = fenetre.get_prenom().getText();
		String nom = fenetre.get_nom().getText();
		String nation = fenetre.get_nation().getText();
		fenetre.getLabel().setText(prenom+" "+nom+" "+nation);
		fenetre.data.insert_personne(new Homme(prenom,nom,nation));
	} 
}
