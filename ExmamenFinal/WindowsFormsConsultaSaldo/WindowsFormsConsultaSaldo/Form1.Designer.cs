
namespace WindowsFormsConsultaSaldo
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
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
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.btnConsultarS = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.txtNCuenta = new System.Windows.Forms.TextBox();
            this.txtSaldo = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.Saldo = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(177, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(163, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "BANCO NACIONAL DE BOLIVIA";
            // 
            // btnConsultarS
            // 
            this.btnConsultarS.Location = new System.Drawing.Point(108, 115);
            this.btnConsultarS.Name = "btnConsultarS";
            this.btnConsultarS.Size = new System.Drawing.Size(73, 34);
            this.btnConsultarS.TabIndex = 1;
            this.btnConsultarS.Text = "Consultar Saldo";
            this.btnConsultarS.UseVisualStyleBackColor = true;
            this.btnConsultarS.Click += new System.EventHandler(this.btnConsultarS_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(35, 74);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(105, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Ingrese el N° Cuenta";
            // 
            // txtNCuenta
            // 
            this.txtNCuenta.Location = new System.Drawing.Point(146, 71);
            this.txtNCuenta.Name = "txtNCuenta";
            this.txtNCuenta.Size = new System.Drawing.Size(100, 20);
            this.txtNCuenta.TabIndex = 3;
            // 
            // txtSaldo
            // 
            this.txtSaldo.Location = new System.Drawing.Point(382, 97);
            this.txtSaldo.Name = "txtSaldo";
            this.txtSaldo.Size = new System.Drawing.Size(100, 20);
            this.txtSaldo.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(482, 100);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(22, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Bs.";
            // 
            // Saldo
            // 
            this.Saldo.AutoSize = true;
            this.Saldo.Location = new System.Drawing.Point(395, 71);
            this.Saldo.Name = "Saldo";
            this.Saldo.Size = new System.Drawing.Size(68, 13);
            this.Saldo.TabIndex = 7;
            this.Saldo.Text = "Su saldo es :";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(516, 200);
            this.Controls.Add(this.Saldo);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtSaldo);
            this.Controls.Add(this.txtNCuenta);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btnConsultarS);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnConsultarS;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtNCuenta;
        private System.Windows.Forms.TextBox txtSaldo;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label Saldo;
    }
}

