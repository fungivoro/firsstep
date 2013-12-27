import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.util.Timer;
import java.util.TimerTask;


public class Temporizarsh extends Timer {

	public Temporizarsh(int segundos, JButton btn){
		Escusha escuc = new Escusha(btn, segundos);
		
		this.scheduleAtFixedRate(new TimerTask() {	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.print("dsdsd");
				
			}
		}, segundos, 1000);
		
//		addActionListener(escuc);
//		this.start();
		
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		

		}



		}


