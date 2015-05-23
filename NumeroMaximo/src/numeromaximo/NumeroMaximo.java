

package numeromaximo;

import javax.swing.JOptionPane;


public class NumeroMaximo {
    
     public static int calcularMaximo(int x, int y, int z)
        {
            int max=0;

                        if (x>y && x>z)
                        {
                            max = x;
                        }

                        else
                       {
                            if (z>y)
                              {
                                max = z;
                              }                         

                            else
                               {
                                max = y;
                                }
                        }
            return max;
        }

   
    public  static void main(String[] args) {
                   int  x,y,z;
                    
                    x=Integer.parseInt(JOptionPane.showInputDialog("intruduce Primer Número:") );
                    y=Integer.parseInt(JOptionPane.showInputDialog("intruduce Segundo Número:") );
                    z=Integer.parseInt(JOptionPane.showInputDialog("intruduce Tercer Número:") );
                   
                    int maximo=calcularMaximo(x, y,z);
                    
                    JOptionPane.showMessageDialog(null,"El número Mayor es:"+ maximo);
    }
    
}
