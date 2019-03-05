using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        int contador = 0;
        
        string[] nombres;
        string[] apellidos;
        string[] generos;
        string[] nivelEstudios;
       

        public Form1()
        {
            InitializeComponent();         
            buscar.Enabled=false;
            primeraVez();
        }


        public string busqueda(string apellido, string[] nombres , string[] apellidos, string[] gener)
        {
            string msj = "No encontro a alguien con ese apellido";
            int primero = 0, ultimo = nombres.Length;
            int mitad = 0;
            bool encontrado = false;
           

            
            
                    while (primero <= ultimo && encontrado == false)
                    {
                        mitad = (primero + ultimo) / 2;                       
                            if (apellido.Equals(apellidos[mitad]))
                            {
                                encontrado = true;

                            }
                            if (apellidos[mitad].CompareTo(apellido) > 0)
                            {
                                ultimo = mitad - 1;
                            }
                            else
                            {
                                primero = mitad + 1;
                            }
                       

                    }
            if (encontrado == true)
            {
                if (radioBuscarPos.Checked)
                {
                    if (nivelEstudios[mitad].Equals("Posgrado"))
                    {
                        msj = "La persona es" + nombres[mitad] + " " + apellido + System.Environment.NewLine + "Genero: " + gener[mitad] + System.Environment.NewLine + " y si esta en prueba academica";
                    }
                }
                else {
                    if (nivelEstudios[mitad].Equals("Pregrado"))
                    {
                        msj = "La persona es" + nombres[mitad] + " " + apellido + System.Environment.NewLine + "Genero: " + gener[mitad] + System.Environment.NewLine + " y si esta en prueba academica";
                    }
                }
            }
            return msj;           
        }

        private void ordenar() {
            string temporal = "";
            for (int contador = 0; contador < apellidos.Length; contador++)
            {
                for (int cuenta = contador+1; cuenta < apellidos.Length; cuenta++)
                {
                   
                    if (apellidos[contador].CompareTo(apellidos[cuenta]) > 0) {
                        temporal = nombres[contador];
                        nombres[contador] = nombres[cuenta];
                        nombres[cuenta] = temporal;
                        temporal = apellidos[contador];
                        apellidos[contador] = apellidos[cuenta];
                        apellidos[cuenta] = temporal;
                        temporal = generos[contador];
                        generos[contador] = generos[cuenta];
                        generos[cuenta] = temporal;
                        temporal = nivelEstudios[contador];
                        nivelEstudios[contador] = nivelEstudios[cuenta];
                        nivelEstudios[cuenta] = temporal;
                    }
                }
            }
        
        }

        private void primeraVez()
        {
            nombres = new string[contador+1];
            apellidos = new string[contador + 1];
            generos = new string[contador + 1];
            nivelEstudios = new string[contador + 1];   
            registrar.Enabled = true;
        }

        private void button2_Click(object sender, EventArgs e)
        {
           
                nombres[contador] = nombre.Text;
                apellidos[contador] = apellido.Text;
                if (radioF.Checked)
                {
                    generos[contador] = "Femenino";
                }
                else
                {
                    generos[contador] = "Masculino";
                }
               
               
                    if (radioPre.Checked)
                    {
                        
                        nivelEstudios[contador]="Pregrado";
                        areaDetexto.Text = "Registro exitoso de pregrado";
                        contador++;
                        apellido.Text = "";
                        nombre.Text = "";
                        if (continua.Text.Equals("S"))
                        aumentarTamano(contador+1);

                    }
                    else if (radioPos.Checked)
                    {

                       nivelEstudios[contador]="Posgrado";
                        areaDetexto.Text = "Registro exitoso de posgrado";
                        contador++;
                        apellido.Text = "";
                        nombre.Text = "";
                        if (continua.Text.Equals("S"))
                            aumentarTamano( contador + 1);
                    }


                    else
                    {
                        areaDetexto.Text = "Seleccione el tipo de Alumno";

                    }
                
               

            if (continua.Text.Equals("N")) {
                registrar.Enabled = false;              
                nombre.Text = "";
                nombre.Enabled = false;
                apellido.Enabled = false;
                apellido.Text = "";               
                buscar.Enabled = true;
                areaDetexto.Text = "Registro exitoso" + System.Environment.NewLine +  "Ya esta lleno";
            }

        }
        private void buscar_Click(object sender, EventArgs e)
        {
           
            string apeBuscado=apellidoBuscado.Text;
          
               ordenar();
                areaDetexto.Text = busqueda(apeBuscado,nombres,apellidos, generos);
          
        }


        private void aumentarTamano(int cantidadDatos) {

            string[] copiaNombres = nombres;
            string[] copiaApellidos =apellidos;
            string[] copiaGenero= generos;
            string[] copiaNivelEstudios = nivelEstudios;

             nombres = new string[cantidadDatos];
             apellidos = new string[cantidadDatos];
             generos = new string[cantidadDatos];
             nivelEstudios = new string[cantidadDatos];

            for (int i = 0; i < copiaApellidos.Length; i++)
            {
                nombres[i] = copiaNombres[i];
                apellidos[i] = copiaApellidos[i];
                generos[i] = copiaGenero[i];
                nivelEstudios[i] = copiaNivelEstudios[i];
            }

        }


        


    }
}
