using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace ProyectoLuisOspina
{
    public partial class Form1 : Form
    {

        int ctdadCreditosAEvaluar = 0;
        int creditosEvaluados = 1;
        double totalCreditosAprobados = 0;
        double totalCreditosNoAprobados = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            ctdadCreditosAEvaluar = int.Parse(ctdadCreditos.Text);
            tNombre.ReadOnly = false;
            tIngreso.ReadOnly = false;
            tNroCuotas.ReadOnly = false;
            tCtdadSolicitada.ReadOnly = false;
            button2.Enabled = true;
            tTipo.Enabled = true;
            button1.Enabled = false;
            ctdadCreditos.ReadOnly = true;


        }

        private void button2_Click(object sender, EventArgs e)
        {
            string nombre = tNombre.Text;
            double ingreso = Double.Parse(tIngreso.Text);
            double ctdadSolicitada = Double.Parse(tCtdadSolicitada.Text);
            int nroCuotas = int.Parse(tNroCuotas.Text);
            string tipoCredito = tTipo.Text;
            

            //validaciones
            if (ctdadSolicitada  > 0 &&   ctdadSolicitada < 20000000)
            {
                if (nroCuotas >= 6 && nroCuotas <= 60)
                {
                    string clasificacion = calcularClasificacion(ctdadSolicitada, ingreso);
                    string msj = "Credito para: " + nombre.ToUpper() + ": " + clasificacion;

                    if (!clasificacion.Equals("No Aprobado"))
                    {
                        double cuotamensual = calcularCuotaMensual(clasificacion, ctdadSolicitada, tipoCredito, nroCuotas);
                        msj += Environment.NewLine + "Cuota mensual: " + cuotamensual; 
                    }                    
                    creditosEvaluados++;
                    resultados.Text = msj;

                    tNombre.Clear();
                        tIngreso.Clear();
                        tNroCuotas.Clear();
                        tCtdadSolicitada.Clear();

                    if (creditosEvaluados > ctdadCreditosAEvaluar) {
                        tNombre.ReadOnly = true;
                        tIngreso.ReadOnly = true;
                        tNroCuotas.ReadOnly = true;
                        tCtdadSolicitada.ReadOnly = true;
                        button2.Enabled = false;
                        tTipo.Enabled = false;

                        resultados.Text = resultados.Text + Environment.NewLine + "--------------------------------" + Environment.NewLine + "Total acumulado por creditos NO aprobados: " + totalCreditosNoAprobados + Environment.NewLine + "Total acumulado por creditos Aprobados:  " + totalCreditosAprobados;
                        totalCreditosAprobados = 0;
                        totalCreditosNoAprobados = 0;
                        button1.Enabled = true;
                        ctdadCreditos.ReadOnly = false;
                        ctdadCreditos.Text = "";
                        creditosEvaluados = 1;
                    }
                }
                else
                {
                    resultados.Text = "La cantidad de cuotas deben estar entre 6 y 60";
                }
            }
            else {
                resultados.Text = "La cantidad solicitada No debe ser mayor a $20.000.000";
            }

        }

        public string calcularClasificacion(double ctdadSolicitada, double ingreso) {
            string clasificacion = "";
            if (ctdadSolicitada < ingreso * 2) {
                clasificacion = "Aprobado AA";
                totalCreditosAprobados += ctdadSolicitada;
            }
            else if (ctdadSolicitada > ingreso * 2 && ctdadSolicitada < ingreso * 10)
            {
                clasificacion = "Aprobado A";
                totalCreditosAprobados += ctdadSolicitada;
            }
            else {
                clasificacion = "No Aprobado";
                totalCreditosNoAprobados += ctdadSolicitada;
            }

            return clasificacion;
        }

        public double calcularCuotaMensual(string clasificacion, double ctdadSolicitada, string tipoCredito, int nroCuotas) {
            double cuotamensual = 50000;
            cuotamensual += ctdadSolicitada / nroCuotas;
            if (clasificacion.Equals("Aprobada A"))
            {
                cuotamensual += ctdadSolicitada * 0.012;
            }
            else
            {
                if (tipoCredito.Equals("Vivienda"))
                {
                    cuotamensual += ctdadSolicitada * 0.09;
                }
                else
                {
                    cuotamensual += ctdadSolicitada * 0.011;
                }
            }
            return cuotamensual;
        }
    }
}
