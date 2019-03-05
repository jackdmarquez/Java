namespace WindowsFormsApplication1
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben eliminar; false en caso contrario, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.continua = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.nombre = new System.Windows.Forms.TextBox();
            this.apellido = new System.Windows.Forms.TextBox();
            this.registrar = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.apellidoBuscado = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.buscar = new System.Windows.Forms.Button();
            this.areaDetexto = new System.Windows.Forms.TextBox();
            this.radioPre = new System.Windows.Forms.RadioButton();
            this.radioPos = new System.Windows.Forms.RadioButton();
            this.panel1 = new System.Windows.Forms.Panel();
            this.radioF = new System.Windows.Forms.RadioButton();
            this.radioM = new System.Windows.Forms.RadioButton();
            this.panel2 = new System.Windows.Forms.Panel();
            this.radioBuscarPos = new System.Windows.Forms.RadioButton();
            this.radioBuscarPre = new System.Windows.Forms.RadioButton();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 40);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(78, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Continua? S/N";
            // 
            // continua
            // 
            this.continua.Location = new System.Drawing.Point(114, 37);
            this.continua.Name = "continua";
            this.continua.Size = new System.Drawing.Size(100, 20);
            this.continua.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 74);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(47, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Nombre:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 109);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(47, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Apellido:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(12, 146);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(69, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "Tipo Alumno:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(12, 178);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(42, 13);
            this.label5.TabIndex = 5;
            this.label5.Text = "Genero";
            // 
            // nombre
            // 
            this.nombre.Location = new System.Drawing.Point(87, 74);
            this.nombre.Name = "nombre";
            this.nombre.Size = new System.Drawing.Size(100, 20);
            this.nombre.TabIndex = 6;
            // 
            // apellido
            // 
            this.apellido.Location = new System.Drawing.Point(87, 106);
            this.apellido.Name = "apellido";
            this.apellido.Size = new System.Drawing.Size(100, 20);
            this.apellido.TabIndex = 7;
            // 
            // registrar
            // 
            this.registrar.Location = new System.Drawing.Point(139, 232);
            this.registrar.Name = "registrar";
            this.registrar.Size = new System.Drawing.Size(75, 23);
            this.registrar.TabIndex = 11;
            this.registrar.Text = "Registrar";
            this.registrar.UseVisualStyleBackColor = true;
            this.registrar.Click += new System.EventHandler(this.button2_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(12, 270);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(91, 13);
            this.label6.TabIndex = 13;
            this.label6.Text = "Apellido a buscar:";
            // 
            // apellidoBuscado
            // 
            this.apellidoBuscado.Location = new System.Drawing.Point(121, 270);
            this.apellidoBuscado.Name = "apellidoBuscado";
            this.apellidoBuscado.Size = new System.Drawing.Size(100, 20);
            this.apellidoBuscado.TabIndex = 14;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(12, 306);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(69, 13);
            this.label7.TabIndex = 15;
            this.label7.Text = "Tipo Alumno:";
            // 
            // buscar
            // 
            this.buscar.Location = new System.Drawing.Point(229, 333);
            this.buscar.Name = "buscar";
            this.buscar.Size = new System.Drawing.Size(75, 23);
            this.buscar.TabIndex = 17;
            this.buscar.Text = "Buscar";
            this.buscar.UseVisualStyleBackColor = true;
            this.buscar.Click += new System.EventHandler(this.buscar_Click);
            // 
            // areaDetexto
            // 
            this.areaDetexto.Location = new System.Drawing.Point(62, 362);
            this.areaDetexto.Multiline = true;
            this.areaDetexto.Name = "areaDetexto";
            this.areaDetexto.Size = new System.Drawing.Size(185, 101);
            this.areaDetexto.TabIndex = 18;
            // 
            // radioPre
            // 
            this.radioPre.AutoSize = true;
            this.radioPre.Location = new System.Drawing.Point(88, 146);
            this.radioPre.Name = "radioPre";
            this.radioPre.Size = new System.Drawing.Size(68, 17);
            this.radioPre.TabIndex = 19;
            this.radioPre.TabStop = true;
            this.radioPre.Text = "Pregrado";
            this.radioPre.UseVisualStyleBackColor = true;
            // 
            // radioPos
            // 
            this.radioPos.AutoSize = true;
            this.radioPos.Location = new System.Drawing.Point(162, 146);
            this.radioPos.Name = "radioPos";
            this.radioPos.Size = new System.Drawing.Size(70, 17);
            this.radioPos.TabIndex = 20;
            this.radioPos.TabStop = true;
            this.radioPos.Text = "Posgrado";
            this.radioPos.UseVisualStyleBackColor = true;
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.radioF);
            this.panel1.Controls.Add(this.radioM);
            this.panel1.Location = new System.Drawing.Point(87, 178);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(172, 48);
            this.panel1.TabIndex = 21;
            // 
            // radioF
            // 
            this.radioF.AutoSize = true;
            this.radioF.Location = new System.Drawing.Point(3, 28);
            this.radioF.Name = "radioF";
            this.radioF.Size = new System.Drawing.Size(71, 17);
            this.radioF.TabIndex = 1;
            this.radioF.TabStop = true;
            this.radioF.Text = "Femenino";
            this.radioF.UseVisualStyleBackColor = true;
            // 
            // radioM
            // 
            this.radioM.AutoSize = true;
            this.radioM.Location = new System.Drawing.Point(3, 2);
            this.radioM.Name = "radioM";
            this.radioM.Size = new System.Drawing.Size(73, 17);
            this.radioM.TabIndex = 0;
            this.radioM.TabStop = true;
            this.radioM.Text = "Masculino";
            this.radioM.UseVisualStyleBackColor = true;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.radioBuscarPos);
            this.panel2.Controls.Add(this.radioBuscarPre);
            this.panel2.Location = new System.Drawing.Point(87, 296);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(157, 35);
            this.panel2.TabIndex = 22;
            // 
            // radioBuscarPos
            // 
            this.radioBuscarPos.AutoSize = true;
            this.radioBuscarPos.Location = new System.Drawing.Point(84, 6);
            this.radioBuscarPos.Name = "radioBuscarPos";
            this.radioBuscarPos.Size = new System.Drawing.Size(70, 17);
            this.radioBuscarPos.TabIndex = 25;
            this.radioBuscarPos.TabStop = true;
            this.radioBuscarPos.Text = "Posgrado";
            this.radioBuscarPos.UseVisualStyleBackColor = true;
            // 
            // radioBuscarPre
            // 
            this.radioBuscarPre.AutoSize = true;
            this.radioBuscarPre.Location = new System.Drawing.Point(10, 8);
            this.radioBuscarPre.Name = "radioBuscarPre";
            this.radioBuscarPre.Size = new System.Drawing.Size(68, 17);
            this.radioBuscarPre.TabIndex = 24;
            this.radioBuscarPre.TabStop = true;
            this.radioBuscarPre.Text = "Pregrado";
            this.radioBuscarPre.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(316, 475);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.radioPos);
            this.Controls.Add(this.radioPre);
            this.Controls.Add(this.areaDetexto);
            this.Controls.Add(this.buscar);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.apellidoBuscado);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.registrar);
            this.Controls.Add(this.apellido);
            this.Controls.Add(this.nombre);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.continua);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Proyecto";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox continua;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox nombre;
        private System.Windows.Forms.TextBox apellido;
        private System.Windows.Forms.Button registrar;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox apellidoBuscado;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Button buscar;
        private System.Windows.Forms.TextBox areaDetexto;
        private System.Windows.Forms.RadioButton radioPre;
        private System.Windows.Forms.RadioButton radioPos;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.RadioButton radioF;
        private System.Windows.Forms.RadioButton radioM;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.RadioButton radioBuscarPos;
        private System.Windows.Forms.RadioButton radioBuscarPre;
    }
}

