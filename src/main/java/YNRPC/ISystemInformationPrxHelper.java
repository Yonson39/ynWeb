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

/**
 * Provides type-specific helper functions.
 **/
public final class ISystemInformationPrxHelper extends Ice.ObjectPrxHelperBase implements ISystemInformationPrx
{
    private static final String __getAppRunState_name = "getAppRunState";

    public Result getAppRunState(KeyValueListHolder values)
    {
        return getAppRunState(values, null, false);
    }

    public Result getAppRunState(KeyValueListHolder values, java.util.Map<String, String> __ctx)
    {
        return getAppRunState(values, __ctx, true);
    }

    private Result getAppRunState(KeyValueListHolder values, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getAppRunState_name);
        return end_getAppRunState(values, begin_getAppRunState(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getAppRunState()
    {
        return begin_getAppRunState(null, false, false, null);
    }

    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx)
    {
        return begin_getAppRunState(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getAppRunState(Ice.Callback __cb)
    {
        return begin_getAppRunState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getAppRunState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getAppRunState(Callback_ISystemInformation_getAppRunState __cb)
    {
        return begin_getAppRunState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getAppRunState __cb)
    {
        return begin_getAppRunState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getAppRunState(FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getAppRunState(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getAppRunState(FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getAppRunState(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, 
                                                FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getAppRunState(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, 
                                                FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getAppRunState(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements _Callback_ISystemInformation_getAppRunState
        {
            public CB(FunctionalCallback_ISystemInformation_getAppRunState_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(Result __ret, KeyValue[] values)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, values);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                ISystemInformationPrxHelper.__getAppRunState_completed(this, __result);
            }

            private final FunctionalCallback_ISystemInformation_getAppRunState_Response __responseCb;
        }
        return begin_getAppRunState(__ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getAppRunState(java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getAppRunState_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getAppRunState_name, __cb);
        try
        {
            __result.prepare(__getAppRunState_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public Result end_getAppRunState(KeyValueListHolder values, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getAppRunState_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            values.value = KeyValueListHelper.read(__is);
            Result __ret;
            __ret = Result.__read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getAppRunState_completed(_Callback_ISystemInformation_getAppRunState __cb, Ice.AsyncResult __result)
    {
        ISystemInformationPrx __proxy = (ISystemInformationPrx)__result.getProxy();
        Result __ret = null;
        KeyValueListHolder values = new KeyValueListHolder();
        try
        {
            __ret = __proxy.end_getAppRunState(values, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, values.value);
    }

    private static final String __getComportsState_name = "getComportsState";

    public Result getComportsState(DeviceInfoListHolder states)
    {
        return getComportsState(states, null, false);
    }

    public Result getComportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx)
    {
        return getComportsState(states, __ctx, true);
    }

    private Result getComportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getComportsState_name);
        return end_getComportsState(states, begin_getComportsState(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getComportsState()
    {
        return begin_getComportsState(null, false, false, null);
    }

    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx)
    {
        return begin_getComportsState(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getComportsState(Ice.Callback __cb)
    {
        return begin_getComportsState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getComportsState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getComportsState(Callback_ISystemInformation_getComportsState __cb)
    {
        return begin_getComportsState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getComportsState __cb)
    {
        return begin_getComportsState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getComportsState(FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getComportsState(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getComportsState(FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getComportsState(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, 
                                                  FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getComportsState(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, 
                                                  FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getComportsState(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, 
                                                   boolean __explicitCtx, 
                                                   boolean __synchronous, 
                                                   FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                   IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements _Callback_ISystemInformation_getComportsState
        {
            public CB(FunctionalCallback_ISystemInformation_getComportsState_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(Result __ret, DeviceInfo[] states)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, states);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                ISystemInformationPrxHelper.__getComportsState_completed(this, __result);
            }

            private final FunctionalCallback_ISystemInformation_getComportsState_Response __responseCb;
        }
        return begin_getComportsState(__ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getComportsState(java.util.Map<String, String> __ctx, 
                                                   boolean __explicitCtx, 
                                                   boolean __synchronous, 
                                                   IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getComportsState_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getComportsState_name, __cb);
        try
        {
            __result.prepare(__getComportsState_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public Result end_getComportsState(DeviceInfoListHolder states, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getComportsState_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            states.value = DeviceInfoListHelper.read(__is);
            Result __ret;
            __ret = Result.__read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getComportsState_completed(_Callback_ISystemInformation_getComportsState __cb, Ice.AsyncResult __result)
    {
        ISystemInformationPrx __proxy = (ISystemInformationPrx)__result.getProxy();
        Result __ret = null;
        DeviceInfoListHolder states = new DeviceInfoListHolder();
        try
        {
            __ret = __proxy.end_getComportsState(states, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, states.value);
    }

    private static final String __getNetportsState_name = "getNetportsState";

    public Result getNetportsState(DeviceInfoListHolder states)
    {
        return getNetportsState(states, null, false);
    }

    public Result getNetportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx)
    {
        return getNetportsState(states, __ctx, true);
    }

    private Result getNetportsState(DeviceInfoListHolder states, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getNetportsState_name);
        return end_getNetportsState(states, begin_getNetportsState(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getNetportsState()
    {
        return begin_getNetportsState(null, false, false, null);
    }

    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx)
    {
        return begin_getNetportsState(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getNetportsState(Ice.Callback __cb)
    {
        return begin_getNetportsState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getNetportsState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getNetportsState(Callback_ISystemInformation_getNetportsState __cb)
    {
        return begin_getNetportsState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getNetportsState __cb)
    {
        return begin_getNetportsState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getNetportsState(FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getNetportsState(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getNetportsState(FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getNetportsState(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, 
                                                  FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getNetportsState(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, 
                                                  FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getNetportsState(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, 
                                                   boolean __explicitCtx, 
                                                   boolean __synchronous, 
                                                   FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                   IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements _Callback_ISystemInformation_getNetportsState
        {
            public CB(FunctionalCallback_ISystemInformation_getNetportsState_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(Result __ret, DeviceInfo[] states)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, states);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                ISystemInformationPrxHelper.__getNetportsState_completed(this, __result);
            }

            private final FunctionalCallback_ISystemInformation_getNetportsState_Response __responseCb;
        }
        return begin_getNetportsState(__ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getNetportsState(java.util.Map<String, String> __ctx, 
                                                   boolean __explicitCtx, 
                                                   boolean __synchronous, 
                                                   IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getNetportsState_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getNetportsState_name, __cb);
        try
        {
            __result.prepare(__getNetportsState_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public Result end_getNetportsState(DeviceInfoListHolder states, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getNetportsState_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            states.value = DeviceInfoListHelper.read(__is);
            Result __ret;
            __ret = Result.__read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getNetportsState_completed(_Callback_ISystemInformation_getNetportsState __cb, Ice.AsyncResult __result)
    {
        ISystemInformationPrx __proxy = (ISystemInformationPrx)__result.getProxy();
        Result __ret = null;
        DeviceInfoListHolder states = new DeviceInfoListHolder();
        try
        {
            __ret = __proxy.end_getNetportsState(states, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, states.value);
    }

    private static final String __getSystemResourcesState_name = "getSystemResourcesState";

    public Result getSystemResourcesState(KeyValueListHolder values)
    {
        return getSystemResourcesState(values, null, false);
    }

    public Result getSystemResourcesState(KeyValueListHolder values, java.util.Map<String, String> __ctx)
    {
        return getSystemResourcesState(values, __ctx, true);
    }

    private Result getSystemResourcesState(KeyValueListHolder values, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getSystemResourcesState_name);
        return end_getSystemResourcesState(values, begin_getSystemResourcesState(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getSystemResourcesState()
    {
        return begin_getSystemResourcesState(null, false, false, null);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx)
    {
        return begin_getSystemResourcesState(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(Ice.Callback __cb)
    {
        return begin_getSystemResourcesState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getSystemResourcesState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(Callback_ISystemInformation_getSystemResourcesState __cb)
    {
        return begin_getSystemResourcesState(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, Callback_ISystemInformation_getSystemResourcesState __cb)
    {
        return begin_getSystemResourcesState(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getSystemResourcesState(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getSystemResourcesState(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, 
                                                         FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getSystemResourcesState(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, 
                                                         FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb, 
                                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getSystemResourcesState(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, 
                                                          boolean __explicitCtx, 
                                                          boolean __synchronous, 
                                                          FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb, 
                                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements _Callback_ISystemInformation_getSystemResourcesState
        {
            public CB(FunctionalCallback_ISystemInformation_getSystemResourcesState_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(Result __ret, KeyValue[] values)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, values);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                ISystemInformationPrxHelper.__getSystemResourcesState_completed(this, __result);
            }

            private final FunctionalCallback_ISystemInformation_getSystemResourcesState_Response __responseCb;
        }
        return begin_getSystemResourcesState(__ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getSystemResourcesState(java.util.Map<String, String> __ctx, 
                                                          boolean __explicitCtx, 
                                                          boolean __synchronous, 
                                                          IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getSystemResourcesState_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getSystemResourcesState_name, __cb);
        try
        {
            __result.prepare(__getSystemResourcesState_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public Result end_getSystemResourcesState(KeyValueListHolder values, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getSystemResourcesState_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            values.value = KeyValueListHelper.read(__is);
            Result __ret;
            __ret = Result.__read(__is);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getSystemResourcesState_completed(_Callback_ISystemInformation_getSystemResourcesState __cb, Ice.AsyncResult __result)
    {
        ISystemInformationPrx __proxy = (ISystemInformationPrx)__result.getProxy();
        Result __ret = null;
        KeyValueListHolder values = new KeyValueListHolder();
        try
        {
            __ret = __proxy.end_getSystemResourcesState(values, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, values.value);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ISystemInformationPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ISystemInformationPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ISystemInformationPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ISystemInformationPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static ISystemInformationPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static ISystemInformationPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ISystemInformationPrx.class, ISystemInformationPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::YNRPC::ISystemInformation"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, ISystemInformationPrx v)
    {
        __os.writeProxy(v);
    }

    public static ISystemInformationPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ISystemInformationPrxHelper result = new ISystemInformationPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
