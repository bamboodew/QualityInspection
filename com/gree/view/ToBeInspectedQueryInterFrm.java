package com.gree.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ToBeInspectedQueryInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToBeInspectedQueryInterFrm frame = new ToBeInspectedQueryInterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ToBeInspectedQueryInterFrm() {
		setBounds(100, 100, 450, 300);

	}

}
