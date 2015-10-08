package fr.shortcircuit.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fr.shortcircuit.test.Main;

/** 
 * @author Dimitri Dean DARSEYNE (D3), 
 * Published by Short-Circuit under Creative Commons (CC) Licensing: 
 * Authorship/Paternity, NO Commercial Use, NO Derivative
 * Please check for more informations:
 * http://creativecommons.org/licenses/by-nc-nd/2.0/
 *
 * Auteur Dimitri Dean DARSEYNE (D3),
 * Publié par Short-Circuit sous license Creative Commons (CC):
 * Paternité, PAS d'Utilisation Commerciale, pas de Dérivés/Modifications
 * Pour plus d'informations, se rendre sur:
 * http://creativecommons.org/licenses/by-nc-nd/2.0/fr/ 
 * 
 * @since Short-Circuit 1999
 */

/*
 * Cette Classe hérite de la classe WindowAdapter (qui implémente à vide l'ensemble des méthodes spécifiées par l'interface WindowListener)
 * Nous avons donc uniquement à nous soucier de redéfinir les méthodes souhaitées...
 */
public class DesktopWindowControler extends WindowAdapter 
{
	private DesktopWindowView 		view;
	
	
	
	public DesktopWindowControler(DesktopWindowView view)		{setView(view);}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Window Events
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public DesktopWindowView getView() 				{return view;}

	public void setView(DesktopWindowView view) 	{this.view 	= view;}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Window Events: on redéfinie uniquement la méthode windowClosing, les autres méthodes issues de l'interface sont déja définies dans la classe mère
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void windowClosing (WindowEvent e) 
	{
		System.out.println("Bye !");

		view.setVisible(false);
		view.dispose();
		
		System.exit(0);
	}

}
