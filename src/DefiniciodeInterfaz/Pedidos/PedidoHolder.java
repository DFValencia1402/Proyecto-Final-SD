package Pedidos;

/**
* Pedidos/PedidoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Pedidos.idl
* mi�rcoles 7 de noviembre de 2018 11:35:09 AM COT
*/

public final class PedidoHolder implements org.omg.CORBA.portable.Streamable
{
  public Pedidos.Pedido value = null;

  public PedidoHolder ()
  {
  }

  public PedidoHolder (Pedidos.Pedido initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Pedidos.PedidoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Pedidos.PedidoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Pedidos.PedidoHelper.type ();
  }

}
