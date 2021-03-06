// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
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

public enum DeviceState implements java.io.Serializable
{
    
    DSFAULT(0),
    
    DSSTOPPED(1),
    
    DSSTARTING(2),
    
    DSRUNNING(3);

    public int
    value()
    {
        return __value;
    }

    public static DeviceState
    valueOf(int __v)
    {
        switch(__v)
        {
        case 0:
            return DSFAULT;
        case 1:
            return DSSTOPPED;
        case 2:
            return DSSTARTING;
        case 3:
            return DSRUNNING;
        }
        return null;
    }

    private
    DeviceState(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 3);
    }

    public static void
    __write(IceInternal.BasicStream __os, DeviceState __v)
    {
        if(__v == null)
        {
            __os.writeEnum(DeviceState.DSFAULT.value(), 3);
        }
        else
        {
            __os.writeEnum(__v.value(), 3);
        }
    }

    public static DeviceState
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(3);
        return __validate(__v);
    }

    private static DeviceState
    __validate(int __v)
    {
        final DeviceState __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
