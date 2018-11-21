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
 * Description: 获得系统控制接口
 * Input:
 * Output: sc 返回接口对象
 * Return:
 * Others:
 **/

public interface _Callback_IService_getSystemControl extends Ice.TwowayCallback
{
    public void response(Result __ret, ISystemControlPrx sc);
}
