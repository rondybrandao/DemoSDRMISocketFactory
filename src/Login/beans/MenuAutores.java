package Login.beans;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuAutores {
    
    
    public static void lista(){
        int autor;
        autor = Integer.parseInt( JOptionPane.showInputDialog("Escolha um autor:"+
              "\n1.Neil Gaiman"+
              "\n1.Ricardo Lecheta"+
              "\n2.J.J. Benitez"+
              "\n3.Deitel"+
              "\n4.Ilana Casoy"+
              "\n5.Alan Poe"));
        
        switch(autor){
            case 1:
                Autor a1 = new Autor();
                JOptionPane.showMessageDialog(null, a1.lista1());
                break;
                
            case 2:
                Autor a2 = new Autor();
                JOptionPane.showMessageDialog(null, a2.lista2());
                break;
                
            case 3:
                Autor a3 = new Autor();
                JOptionPane.showMessageDialog(null, a3.lista3());
                break;
                
            case 4:
                Autor a4 = new Autor();
                JOptionPane.showMessageDialog(null, a4.lista4());
                break;
         
            case 5:
                Autor a5 = new Autor();
                JOptionPane.showMessageDialog(null, a5.lista5());
                break;
            
            default:
                System.out.println("Opção inválida.");
        }
    }   
}
