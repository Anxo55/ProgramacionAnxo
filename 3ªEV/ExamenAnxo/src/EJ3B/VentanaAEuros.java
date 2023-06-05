package EJ3B;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaAEuros extends JFrame implements ActionListener {

	private Container contenedor;

	private JLabel radio, altura, volumen, superficie, dinero;
	// Campos de texto a ingresar
	private JTextField campoRadio, campoAltura, campoDinero;
	// Botón para realizar los cálculos numéricos
	private JButton calcular;

	/**
	 * Constructor de la clase VentanaCilindro
	 */
	public VentanaAEuros() {
		inicio();
		setTitle("A euros"); // Establece el título de la ventana
		setSize(280, 210); // Establece el tamaño de la ventana
		setLocationRelativeTo(null);
		setResizable(false);
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		// Establece la etiqueta y campo de texto para el radio del cilindro
		dinero = new JLabel();
		dinero.setText("Radio (cms):");
		dinero.setBounds(20, 1000, 175, 300);

		campoDinero = new JTextField();
		// Establece la posición del campo de texto de radio del cilindro
		campoDinero.setBounds(100, 20, 135, 23);
		// Establece la etiqueta y campo de texto para la altura del cilindro


		// Establece la etiqueta y el valor de la superficie del cilindro
		superficie = new JLabel();
		superficie.setText("Superficie (cm2):");
		// Establece la posición de la etiqueta de superficie del cilindro
		superficie.setBounds(20, 140, 135, 23);

		// Se añade cada componente gráfico al contenedor de la ventana
		
		contenedor.add(dinero);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana del cilindro throws
	 * Exception Excepción al ingresar un campo nulo o error en formato de número
	 */
	public void actionPerformed(ActionEvent event) {
		// Se inicializan el radio y la altura del cilindro
		boolean error = false; /* Se inicializa variable para determinar si ocurre un error */
		double radio = 0;
		double altura = 0;
		try {
			// Se obtiene el radio del cilindro ingresado
			radio = Double.parseDouble(campoRadio.getText());
			// Se obtiene la altura del cilindro ingresada
			altura = Double.parseDouble(campoAltura.getText());
			AEuros aeuros = new AEuros(altura, ALLBITS, ABORT);
			// Se calcula y muestra el volumen
			dinero.setText("Volumen (cm3): " + String.format("%.2f", aeuros.calcularPrecio()));
			
			error = true; // Si ocurre una excepción
		} finally {
			if (error) { /* Si ocurre una excepción, se muestra un mensaje de error */
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
