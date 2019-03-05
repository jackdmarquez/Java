namespace ProyectoLuisOspina
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.ctdadCreditos = new System.Windows.Forms.TextBox();
            this.button1 = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.tNombre = new System.Windows.Forms.TextBox();
            this.tIngreso = new System.Windows.Forms.TextBox();
            this.tCtdadSolicitada = new System.Windows.Forms.TextBox();
            this.tNroCuotas = new System.Windows.Forms.TextBox();
            this.tTipo = new System.Windows.Forms.ComboBox();
            this.button2 = new System.Windows.Forms.Button();
            this.resultados = new System.Windows.Forms.RichTextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(49, 39);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(151, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Cantidad de creditos a evaluar";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // ctdadCreditos
            // 
            this.ctdadCreditos.Location = new System.Drawing.Point(206, 36);
            this.ctdadCreditos.Name = "ctdadCreditos";
            this.ctdadCreditos.Size = new System.Drawing.Size(51, 20);
            this.ctdadCreditos.TabIndex = 1;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(273, 34);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 23);
            this.button1.TabIndex = 2;
            this.button1.Text = "Aceptar";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(49, 93);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Nombre";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(49, 132);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(42, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Ingreso";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(49, 166);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(96, 13);
            this.label4.TabIndex = 5;
            this.label4.Text = "Cantidad solicitada";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(50, 204);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(94, 13);
            this.label5.TabIndex = 6;
            this.label5.Text = "Numero de cuotas";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(50, 239);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(78, 13);
            this.label6.TabIndex = 7;
            this.label6.Text = "Tipo de credito";
            // 
            // tNombre
            // 
            this.tNombre.Location = new System.Drawing.Point(100, 90);
            this.tNombre.Name = "tNombre";
            this.tNombre.ReadOnly = true;
            this.tNombre.Size = new System.Drawing.Size(100, 20);
            this.tNombre.TabIndex = 8;
            // 
            // tIngreso
            // 
            this.tIngreso.Location = new System.Drawing.Point(100, 132);
            this.tIngreso.Name = "tIngreso";
            this.tIngreso.ReadOnly = true;
            this.tIngreso.Size = new System.Drawing.Size(100, 20);
            this.tIngreso.TabIndex = 9;
            // 
            // tCtdadSolicitada
            // 
            this.tCtdadSolicitada.Location = new System.Drawing.Point(151, 163);
            this.tCtdadSolicitada.Name = "tCtdadSolicitada";
            this.tCtdadSolicitada.ReadOnly = true;
            this.tCtdadSolicitada.Size = new System.Drawing.Size(100, 20);
            this.tCtdadSolicitada.TabIndex = 10;
            // 
            // tNroCuotas
            // 
            this.tNroCuotas.Location = new System.Drawing.Point(151, 201);
            this.tNroCuotas.Name = "tNroCuotas";
            this.tNroCuotas.ReadOnly = true;
            this.tNroCuotas.Size = new System.Drawing.Size(100, 20);
            this.tNroCuotas.TabIndex = 11;
            // 
            // tTipo
            // 
            this.tTipo.Enabled = false;
            this.tTipo.FormattingEnabled = true;
            this.tTipo.Items.AddRange(new object[] {
            "Libre Inversion",
            "Vehiculo",
            "Vivienda"});
            this.tTipo.Location = new System.Drawing.Point(136, 231);
            this.tTipo.Name = "tTipo";
            this.tTipo.Size = new System.Drawing.Size(121, 21);
            this.tTipo.TabIndex = 12;
            // 
            // button2
            // 
            this.button2.Enabled = false;
            this.button2.Location = new System.Drawing.Point(136, 267);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 13;
            this.button2.Text = "Registrar";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // resultados
            // 
            this.resultados.Location = new System.Drawing.Point(21, 335);
            this.resultados.Name = "resultados";
            this.resultados.Size = new System.Drawing.Size(311, 99);
            this.resultados.TabIndex = 14;
            this.resultados.Text = "";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(31, 319);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(60, 13);
            this.label7.TabIndex = 15;
            this.label7.Text = "Resultados";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(361, 450);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.resultados);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.tTipo);
            this.Controls.Add(this.tNroCuotas);
            this.Controls.Add(this.tCtdadSolicitada);
            this.Controls.Add(this.tIngreso);
            this.Controls.Add(this.tNombre);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.ctdadCreditos);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Creditos";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox ctdadCreditos;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox tNombre;
        private System.Windows.Forms.TextBox tIngreso;
        private System.Windows.Forms.TextBox tCtdadSolicitada;
        private System.Windows.Forms.TextBox tNroCuotas;
        private System.Windows.Forms.ComboBox tTipo;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.RichTextBox resultados;
        private System.Windows.Forms.Label label7;
    }
}

