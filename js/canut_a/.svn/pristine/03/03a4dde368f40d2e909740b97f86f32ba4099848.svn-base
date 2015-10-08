package fr.shortcircuit.test;

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

import fr.shortcircuit.db.DbManager;
import fr.shortcircuit.gui.DesktopWindowView;
import fr.shortcircuit.gui.IDatabaseViewConstants;


public class Main implements IDatabaseViewConstants
{
	//Connecteur à la base de donnée
	public DbManager 				dbManager;
	
	//UI
	public DesktopWindowView		view;
	
	
	
	public static void main(String args[])
	{		
		Main newAppli			= new Main();
	}
	
	public Main()
	{
		callDataBase();
		
		buildUI();
	}	

	public void callDataBase()
	{
		dbManager 	= new DbManager();
		
		dbManager.dbConnect();
	}
	
	private void buildUI()
	{
		view 		= new DesktopWindowView(dbManager);
		
		view.setSize(INT_APPLI_WIDTH, INT_APPLI_HEIGHT);
		view.setLocation(150, 100);
		view.setVisible(true);
	}
	
}
