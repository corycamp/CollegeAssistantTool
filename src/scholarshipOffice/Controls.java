package scholarshipOffice;

import javax.swing.JFileChooser;

public class Controls {
	
	String file1;
	String file2;
	
	public void getFile(String fileName) {
		System.out.println("reading file");
		JFileChooser filePicker = new JFileChooser();
		filePicker.showSaveDialog(null);
		System.out.printf("Using file %s",filePicker.getSelectedFile());
		if(fileName.equals("file1")) {
			this.file1 = filePicker.getSelectedFile().getAbsolutePath();
		}else {
			this.file2 = filePicker.getSelectedFile().getAbsolutePath();
		}
	}
}
