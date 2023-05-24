package capitulo5.ejemplo83;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {

	// Un contenedor de elementos gráficos
	private Container contenedor;
	// Botones para seleccionar una figura geométrica determinada
	private JButton cilindro, esfera, piramide;

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		inicio();
		setTitle("Figuras"); // Establece el título de la ventana
		setSize(350, 160); // Establece el tamaño de la ventana
		setLocationRelativeTo(null);
		// Establece que el botón de cerrar permitirá salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		// Establece el botón del cilindro
		cilindro = new JButton();
		cilindro.setText("Cilindro");
		cilindro.setBounds(20, 50, 80, 23);
		/*
		 * Agrega al botón un ActionListener para que gestione eventos del botón
		 */
		cilindro.addActionListener(this);

		// Establece el botón de la esfera
		esfera = new JButton();
		esfera.setText("Esfera");
		esfera.setBounds(125, 50, 80, 23);
		/*
		 * Agrega al botón un ActionListener para que gestione eventos del botón
		 */
		esfera.addActionListener(this);

		// Establece el botón de la pirámide
		piramide = new JButton();
		piramide.setText("Pirámide");
		piramide.setBounds(225, 50, 100, 23);
		/*
		 * Agrega al botón un ActionListener para que gestione eventos del botón
		 */
		piramide.addActionListener(this);

		// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(cilindro);
		contenedor.add(esfera);
		contenedor.add(piramide);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == esfera) { // Si se pulsa el botón esfera
			VentanaEsfera esfera = new VentanaEsfera(); /* Crea la ventana de la esfera */
			esfera.setVisible(true);
		}
		if (evento.getSource() == cilindro) { /* Si se pulsa el botón cilindro */
			VentanaCilindro cilindro = new VentanaCilindro(); /* Crea la ventana del cilindro */
			cilindro.setVisible(true);
		}
		if (evento.getSource() == piramide) { /* Si se pulsa el botón pirámide */
			VentanaPiramide piramide = new VentanaPiramide(); /* Crea la ventana de la pirámide */
			piramide.setVisible(true);
		}
	}

    

}