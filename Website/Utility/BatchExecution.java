package Utility;

import java.io.IOException;
import java.io.OutputStream;

public class BatchExecution {

	public static void batchExecution() 
	{
		try {
			String command="cmd /c start "+"E:\\OrangeHRM\\OrangeHRMS\\Website\\Batch\\BatchFile.bat";
			Process child=Runtime.getRuntime().exec(command);
			OutputStream out=child.getOutputStream();
			out.write("cd E:/ /r/n".getBytes());
			out.flush();
			out.write("cd E:/ /r/n".getBytes());
			out.flush();
			
			child = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	
	
}
