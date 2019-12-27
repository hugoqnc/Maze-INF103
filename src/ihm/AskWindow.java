package ihm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AskWindow extends JFrame {

private int length;
private int width;
private String filePath;
	
	public AskWindow() {
		super();

		Integer[] values = new Integer[98];
		for (int i =0; i<values.length; i++) {
			values[i] = i+2;
		}
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Name your new maze");
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
		//FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files","txt");
	    //fileChooser.setFileFilter(filter);		 
		int userSelection = fileChooser.showSaveDialog(this);

		try {
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File file = fileChooser.getSelectedFile();
		    String name = file.getName();
		    int extension = 0; //vaut 0 pour un nom de fichier donné finissant par .txt, vaut 1 sinon
		    if (name.contains(".txt") == false) {
		    	extension = 1;
		    	//new ErrorWindow("File Error", "Please start again and make sure that your new file name finishes with \".txt\".");
		    	//throw new RuntimeException("The new file is not a text file");
		    }
		    
		    if (extension == 0) {
		    	if (file.exists()==false) {
		    		this.filePath = file.getAbsolutePath();
		    	}
		    	else {
			    	new ErrorWindow("File Error", "This file already exists. Choose another name.");
			    	throw new RuntimeException("This file already exists");
		    	}
		    }
		    if (extension == 1) {
		    	File filetxt = new File(file.getAbsolutePath() + ".txt");
		    	if (filetxt.exists()==false) {
		    		this.filePath = filetxt.getAbsolutePath();
		    	}
		    	else {
			    	new ErrorWindow("File Error", "This file already exists. Try again and choose another name.");
			    	throw new RuntimeException("This file already exists");
		    	}
		    }
		    
		}
		else {
			//new ErrorWindow("Ignored Input Dialog", "Please start again and make sure to fill all the dialogs.");
			throw new RuntimeException("The file chooser dialog has been ignored");
		}
		}
		//catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		catch(RuntimeException rte){
			//rte.printStackTrace();
			throw new RuntimeException("Exception to stop the current process");
		}
		


		Object o1 = JOptionPane.showInputDialog(null, "Length : ", "Choose length (2/3)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		Object o2 = JOptionPane.showInputDialog(null, "Width : ", "Choose width (3/3)", JOptionPane.INFORMATION_MESSAGE, null, values, values[0]);
		try {
			if (o1 == null || o2 == null) {
				throw new RuntimeException("An input dialog has been ignored");
			}
			
		}
		catch(RuntimeException rte){
			//rte.printStackTrace();
			new ErrorWindow("Ignored Input Dialog", "Please start again and make sure to fill all the dialogs.");
		}
		
		length = (int) o1;
		width = (int) o2;

	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public String getFilePath() {
		return filePath;
	}
}
