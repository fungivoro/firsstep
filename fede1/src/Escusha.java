import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.Timer;


public class Escusha implements ActionListener  {

	JButton btn;
	int segundos;
	
	public Escusha(JButton btn, int segundos){

		this.btn = btn;
		this.segundos = segundos;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("dsd");
		Timer t =  (Timer) e.getSource();
		if(t.getDelay()==0)
			btn.setEnabled(true);
		

	}


}
