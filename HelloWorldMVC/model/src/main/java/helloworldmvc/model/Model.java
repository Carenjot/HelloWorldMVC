package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		File f=new File(Model.class.getResource("message.txt").getFile());
		
		try(BufferedReader br = new BufferedReader(new FileReader(f)))
		{
		
		String st = br.readLine();
		
		return st;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
