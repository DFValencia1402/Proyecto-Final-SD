package Productos;


/**
* Productos/ProductoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Productos.idl
* jueves 8 de noviembre de 2018 02:34:56 PM COT
*/

public abstract class ProductoPOA extends org.omg.PortableServer.Servant
 implements Productos.ProductoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarProductos", new java.lang.Integer (0));
    _methods.put ("actualizarProductos", new java.lang.Integer (1));
    _methods.put ("eliminarProductos", new java.lang.Integer (2));
    _methods.put ("consultarProductos", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Productos/Producto/insertarProductos
       {
         int Codigo = in.read_long ();
         String descripcion = in.read_wstring ();
         String tipo = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String valor = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarProductos (Codigo, descripcion, tipo, cantidad, valor);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Productos/Producto/actualizarProductos
       {
         int Codigo = in.read_long ();
         String descripcion = in.read_wstring ();
         String tipo = in.read_wstring ();
         String cantidad = in.read_wstring ();
         String valor = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarProductos (Codigo, descripcion, tipo, cantidad, valor);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Productos/Producto/eliminarProductos
       {
         int Codigo = in.read_long ();
         boolean $result = false;
         $result = this.eliminarProductos (Codigo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Productos/Producto/consultarProductos
       {
         int Codigo = in.read_long ();
         String $result = null;
         $result = this.consultarProductos (Codigo);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Productos/Producto/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Productos/Producto:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Producto _this() 
  {
    return ProductoHelper.narrow(
    super._this_object());
  }

  public Producto _this(org.omg.CORBA.ORB orb) 
  {
    return ProductoHelper.narrow(
    super._this_object(orb));
  }


} // class ProductoPOA