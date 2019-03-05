using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.VisualBasic;

namespace ProyectoJuanReina
{
    public partial class Form1 : Form

       
    {
        public Form1()
        {
            InitializeComponent();
        }

        int[] numerosCuentas;
        String[] nombres;
        double[] saldosActuales;
        int[] cantidadBoletas;

        private void button1_Click(object sender, EventArgs e)
        {
            principal();
        }

        private void principal()
        {            

            String reporte = "";           

            int cantidadCuentas = int.Parse(Interaction.InputBox("Digite el nro de cuentas de ahorro"));
            numerosCuentas = new int[cantidadCuentas];
            nombres = new String[cantidadCuentas];
            saldosActuales = new double[cantidadCuentas];
            cantidadBoletas = new int[cantidadCuentas];
             
            for (int contador = 0; contador < cantidadCuentas ; contador++)
            {
                numerosCuentas[contador] = int.Parse(Interaction.InputBox("Digite el numero de la cuenta"));
                nombres[contador] = Interaction.InputBox("Digite el nombre");
                saldosActuales[contador] = double.Parse(Interaction.InputBox("Digite el saldo actual"));
                if (saldosActuales[contador] >= 1400000) {
                    cantidadBoletas[contador] = 2;
                }
                else if (saldosActuales[contador] > 500000 && saldosActuales[contador] < 1400000)
                {
                    cantidadBoletas[contador] = 1;
                }
                else {
                    cantidadBoletas[contador] = 0;
                }

                textBox1.Text = numerosCuentas[contador].ToString();
                textBox2.Text = nombres[contador];
                textBox3.Text = saldosActuales[contador].ToString();
                textBox4.Text = cantidadBoletas[contador].ToString();
            }

            reporte = ordenadoAlfabeticamenteAhorradoresSinBoletas(numerosCuentas, nombres, saldosActuales, cantidadBoletas);
            richTextBox1.Text = reporte;
        }

        private string ordenadoAlfabeticamenteAhorradoresSinBoletas(int[] numerosCuentas, string[] nombres, double[] saldosActuales, int[] cantidadBoletas)
        {
            int auxi = 0;
            String auxs = "";
            double auxd = 0;
            String reporte = "Personas sin boletas:\n";
            for (int contador = 0; contador < nombres.Length; contador++)
            {
                for (int contador2 = contador+1; contador2 < nombres.Length; contador2++)
                {
                    if (nombres[contador2].CompareTo(nombres[contador]) < 0) {
                        auxi = numerosCuentas[contador2];
                        numerosCuentas[contador2] = numerosCuentas[contador];
                        numerosCuentas[contador] = auxi;

                        auxs = nombres[contador2];
                        nombres[contador2] = nombres[contador];
                        nombres[contador] = auxs;

                        auxd = saldosActuales[contador2];
                        saldosActuales[contador2] = saldosActuales[contador];
                        saldosActuales[contador] = auxd;


                        auxi = cantidadBoletas[contador];
                        cantidadBoletas[contador2] = cantidadBoletas[contador];
                        cantidadBoletas[contador] = auxi;
                    }
                }
            }

            for (int contador = 0; contador < nombres.Length; contador++)
            {
                if (cantidadBoletas[contador] == 0) {
                    reporte += numerosCuentas[contador] + "\t" + nombres[contador] + "\t" + saldosActuales[contador] + "\t" + cantidadBoletas[contador] + "\n";
                }
            }
            return reporte;  
        }

        private void button4_Click(object sender, EventArgs e)
        {
            int cuentaBuscada = 0;
            String buscado = "";
            cuentaBuscada = int.Parse(Interaction.InputBox("Digite el numero de la cuenta buscada"));
            buscado = buscarDatosDeUnaCuenta(cuentaBuscada, numerosCuentas, nombres, saldosActuales, cantidadBoletas);
            richTextBox1.Text = buscado;
            
        }

        private string buscarDatosDeUnaCuenta(int cuentaBuscada, int[] numerosCuentas, string[] nombres, double[] saldosActuales, int[] cantidadBoletas)
        {
            String buscado="No se encuentra, no existe un ahorrador con ese numero";
            for (int contador = 0; contador < numerosCuentas.Length; contador++)
            {
                if (numerosCuentas[contador] == cuentaBuscada) {
                    buscado = numerosCuentas[contador] + "\t" + nombres[contador] + "\t" + saldosActuales[contador] + "\t" + cantidadBoletas[contador] + "\n";
                }
            }
            return buscado;
        }
    }
}
