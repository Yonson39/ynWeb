// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `RpcCommon.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package YNRPC;

public class KeyValue implements Cloneable, java.io.Serializable
{
    public String name;

    public String val;

    public KeyValue()
    {
        name = "";
        val = "";
    }

    public KeyValue(String name, String val)
    {
        this.name = name;
        this.val = val;
    }

    public boolean
    equals(Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        KeyValue _r = null;
        if(rhs instanceof KeyValue)
        {
            _r = (KeyValue)rhs;
        }

        if(_r != null)
        {
            if(name != _r.name)
            {
                if(name == null || _r.name == null || !name.equals(_r.name))
                {
                    return false;
                }
            }
            if(val != _r.val)
            {
                if(val == null || _r.val == null || !val.equals(_r.val))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::YNRPC::KeyValue");
        __h = IceInternal.HashUtil.hashAdd(__h, name);
        __h = IceInternal.HashUtil.hashAdd(__h, val);
        return __h;
    }

    public KeyValue
    clone()
    {
        KeyValue c = null;
        try
        {
            c = (KeyValue)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(name);
        __os.writeString(val);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        name = __is.readString();
        val = __is.readString();
    }

    static public void
    __write(IceInternal.BasicStream __os, KeyValue __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public KeyValue
    __read(IceInternal.BasicStream __is, KeyValue __v)
    {
        if(__v == null)
        {
             __v = new KeyValue();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final KeyValue __nullMarshalValue = new KeyValue();

    public static final long serialVersionUID = -907100515L;
}
