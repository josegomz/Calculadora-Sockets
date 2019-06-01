/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceRemoto;

import Interface.*;
import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author macbookair
 */
public class customFont {
    Font mifont = null;
    public customFont(){
        String fuente="Calculator.ttf";
        try{
            //cargar la fuente
            InputStream is = getClass().getResourceAsStream(fuente);
            mifont=Font.createFont(Font.TRUETYPE_FONT,is);
        }catch(Exception e){
            System.out.println("no se cargó la fuente");
            mifont=new Font("Arial",Font.PLAIN,14);
        }
    }
    public Font MyFont(int estilo,float tamaño){
        Font tfont = mifont.deriveFont(estilo, tamaño);
        return tfont;
    }
}
