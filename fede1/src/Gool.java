import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.corba.se.spi.orbutil.fsm.Action;


public class Gool {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		 final JButton btnFlash = new JButton("flash");
		 btnFlash.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					// TODO Auto-generated method stub
					btnFlash.setEnabled(false);
					new Temporizarsh(210000, btnFlash);
				}
			});


				final JButton btnIgnite = new JButton("ignite");
				btnIgnite.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						// TODO Auto-generated method stub
						btnIgnite.setEnabled(false);
						System.out.print(btnIgnite.isEnabled());
						new Temporizarsh(300000, btnIgnite);
					}
				});

		JFrame frm = new JFrame("LoL");
		frm.setLayout(new FlowLayout());
		frm.add(btnFlash);
		frm.add(btnIgnite);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.pack();
		frm.setVisible(true);


	}

}
