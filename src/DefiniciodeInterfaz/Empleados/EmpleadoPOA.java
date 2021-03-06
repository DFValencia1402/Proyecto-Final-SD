package Empleados;


/**
* Empleados/EmpleadoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Empleado.idl
* s�bado 3 de noviembre de 2018 04:07:40 PM COT
*/

public abstract class EmpleadoPOA extends org.omg.PortableServer.Servant
 implements Empleados.EmpleadoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarEmpleado", new java.lang.Integer (0));
    _methods.put ("actualizarEmpleado", new java.lang.Integer (1));
    _methods.put ("eliminarEmpleado", new java.lang.Integer (2));
    _methods.put ("consultarEmpleado", new java.lang.Integer (3));
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
       case 0:  // Empleados/Empleado/insertarEmpleado
       {
         int cedula = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String genero = in.read_wstring ();
         String cargo = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarEmpleado (cedula, nombre, apellido, telefono, genero, cargo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Empleados/Empleado/actualizarEmpleado
       {
         int cedula = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String genero = in.read_wstring ();
         String cargo = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarEmpleado (cedula, nombre, apellido, telefono, genero, cargo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Empleados/Empleado/eliminarEmpleado
       {
         int cedula = in.read_long ();
         boolean $result = false;
         $result = this.eliminarEmpleado (cedula);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Empleados/Empleado/consultarEmpleado
       {
         int cedula = in.read_long ();
         String $result = null;
         $result = this.consultarEmpleado (cedula);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Empleados/Empleado/shoutdown
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
    "IDL:Empleados/Empleado:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Empleado _this() 
  {
    return EmpleadoHelper.narrow(
    super._this_object());
  }

  public Empleado _this(org.omg.CORBA.ORB orb) 
  {
    return EmpleadoHelper.narrow(
    super._this_object(orb));
  }


} // class EmpleadoPOA
