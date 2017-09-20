import  javax.swing.JOptionPane ;



Todos los derechos reservados
 
 * @author junior loor
 
la  clase  pública MenuPrincipal  extiende  javax.swing . JFrame {

    static  Objeto  TXTimprimirprimerelemeto ;

    / * * Crea el nuevo formulario MenuPrincipal * /
    public  MenuPrincipal () {
        initComponents ();
    }
    
    NodoPila Pila =  nulo ;
    private  void  TXTimprimirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
    }                                           

    private  void  BTNinsertarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
        if ( TXTinsertar . getText () . length () ==  0 ) {
            JOptionPane . showMessageDialog ( nulo , " Ingrese un Dato " );
        } else {
        String dato =  TXTinsertar . getText ();
        Pila  =  NodoPila . insertarPila ( Pila , dato);
        TXTinsertar . setText ( " " );           
        JOptionPane . showMessageDialog ( null , " Elemento ingresado " );
        }
        
    }                                           

    private  void  BNTbuscarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                          
        // TODO agregue su código de manejo aquí:
        if ( TXTbuscar . getText () . length () ==  0 ) {
            JOptionPane . showMessageDialog ( null , " Ingrese Dato a Buscar " );
        } else {
        String dato =  TXTbuscar . getText ();
        NodoPila . buscarPila ( Pila , dato);
        TXTbuscar . setText ( " " );  
        
        }

    }                                         

    private  void  BTNimprimirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
        NodoPila . imprimirPila ( Pila );
    }                                           

    private  void  TXTeliminarActionPerformed ( java.awt.event . ActionEvent  evt ) {                                            
        // TODO agregue su código de manejo aquí:
       
        Pila = NodoPila . eliminarPila ( Pila );
    }                                           

    private  void  BTNsalirActionPerformed ( java.awt.event . ActionEvent  evt ) {                                         
        // TODO agregue su código de manejo aquí:
        disponer();
    }                                        

    private  void  BTNimprimirprimerelementoActionPerformed ( java.awt.event . ActionEvent  evt ) {                                                          
        // TODO agregue su código de manejo aquí:
       
       NodoPila . imprimirprimerelementodelaPila ( Pila );
    }    