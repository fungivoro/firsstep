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
		 btnFlash.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				btnFlash.setEnabled(false);
				new Temporizarsh(300000, btnFlash);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

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
						new Temporizarsh(3000, btnIgnite);
					}
				});

		JFrame frm = new JFrame("LoL");
		frm.setSize(300, 300);

		frm.add(btnFlash);
		frm.add(btnIgnite);
		frm.setVisible(true);


	}

}
