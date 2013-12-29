import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.util.Timer;
import java.util.TimerTask;


public class Temporizarsh extends Timer {
	
	int counter;
	String nombreOriginal;
	
	public Temporizarsh(int milisegundos, final JButton btn){
		counter = milisegundos/1000;
		nombreOriginal = btn.getText();
		this.schedule(new TimerTask() {	
			@Override
			public void run() {
				if(counter == 0){
					this.cancel();
					try {
						this.finalize();
					} catch (Throwable e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					btn.setEnabled(true);
					btn.setText(nombreOriginal);
					return;
					
				}
				
				// TODO Auto-generated method stub
				btn.setText(String.valueOf(counter));
				counter--;
				
			}
			
		}, 0, 1000);
		
		
		
		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		

		}



		}


