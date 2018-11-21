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
// Generated from file `RpcService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package YNRPC;

public abstract class _IServiceDisp extends Ice.ObjectImpl implements IService
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::YNRPC::IService"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    /**
     * Description: 获得数据监视接口
     * Input:
     * Output: dm 返回接口对象
     * Return:
     * Others:
     **/
    public final Result getDataMonitor(IDataMonitorPrxHolder dm)
    {
        return getDataMonitor(dm, null);
    }

    /**
     * Description: 获得系统控制接口
     * Input:
     * Output: sc 返回接口对象
     * Return:
     * Others:
     **/
    public final Result getSystemControl(ISystemControlPrxHolder sc)
    {
        return getSystemControl(sc, null);
    }

    /**
     * Description: 获得系统信息接口
     * Input:
     * Output: dm 返回接口对象
     * Return:
     * Others:
     **/
    public final Result getSystemInformation(ISystemInformationPrxHolder si)
    {
        return getSystemInformation(si, null);
    }

    public static Ice.DispatchStatus ___getSystemControl(IService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.readEmptyParams();
        ISystemControlPrxHolder sc = new ISystemControlPrxHolder();
        Result __ret = __obj.getSystemControl(sc, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        ISystemControlPrxHelper.__write(__os, sc.value);
        Result.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___getDataMonitor(IService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.readEmptyParams();
        IDataMonitorPrxHolder dm = new IDataMonitorPrxHolder();
        Result __ret = __obj.getDataMonitor(dm, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        IDataMonitorPrxHelper.__write(__os, dm.value);
        Result.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___getSystemInformation(IService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        __inS.readEmptyParams();
        ISystemInformationPrxHolder si = new ISystemInformationPrxHolder();
        Result __ret = __obj.getSystemInformation(si, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        ISystemInformationPrxHelper.__write(__os, si.value);
        Result.__write(__os, __ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "getDataMonitor",
        "getSystemControl",
        "getSystemInformation",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___getDataMonitor(this, in, __current);
            }
            case 1:
            {
                return ___getSystemControl(this, in, __current);
            }
            case 2:
            {
                return ___getSystemInformation(this, in, __current);
            }
            case 3:
            {
                return ___ice_id(this, in, __current);
            }
            case 4:
            {
                return ___ice_ids(this, in, __current);
            }
            case 5:
            {
                return ___ice_isA(this, in, __current);
            }
            case 6:
            {
                return ___ice_ping(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
