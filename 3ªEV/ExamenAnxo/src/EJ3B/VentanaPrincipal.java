package EJ3B;

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
	private JButton alibras, aeuros;

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public VentanaPrincipal() {
		inicio();
		setTitle("Calcular Precio"); // Establece el título de la ventana
		setSize(500, 300); // Establece el tamaño de la ventana
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
		alibras = new JButton();
		alibras.setText("A libras");
		alibras.setBounds(20, 50, 80, 23);
		/*
		 * Agrega al botón un ActionListener para que gestione eventos del botón
		 */
		alibras.addActionListener(this);

		// Establece el botón de la esfera
		aeuros = new JButton();
		aeuros.setText("A euros");
		aeuros.setBounds(175, 50, 80, 23);
		/*
		 * Agrega al botón un ActionListener para que gestione eventos del botón
		 */
		aeuros.addActionListener(this);


		// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(alibras);
		contenedor.add(aeuros);
		
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == alibras) { // Si se pulsa el botón esfera
			VentanaALibras esfera = new VentanaALibras(); /* Crea la ventana de la esfera */
			esfera.setVisible(true);
		}
		if (evento.getSource() == aeuros) { /* Si se pulsa el botón cilindro */
			VentanaAEuros cilindro = new VentanaAEuros(); /* Crea la ventana del cilindro */
			cilindro.setVisible(true);
		}
		
	}

    

}
