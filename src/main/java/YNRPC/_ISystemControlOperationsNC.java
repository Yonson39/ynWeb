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

public interface _ISystemControlOperationsNC
{
    /**
     * Description: 创建新工程
     * Input:
     * Output: 
     * Return:
     * Others:
     **/
    Result newProject();

    /**
     * Description: 保存新工程
     * Input:
     * Output: 
     * Return:
     * Others:
     **/
    Result saveProject();

    /**
     * Description: 导出工程到文件
     * Input:
     * Output: fileName 导出后工程文件名，全路径
     * Return:
     * Others: 
     **/
    Result exportProject(Ice.StringHolder fileName);

    /**
     * Description: 从文件导入工程
     * Input: fileName 导入工程的文件名，全路径
     * Output: 
     * Return:
     * Others: 当前工程将被覆盖
     **/
    Result importProject(String fileName);

    /**
     * Description: 启动工程
     * Input: 
     * Output: 
     * Return:
     * Others: 如有工程在运行将返回错误
     **/
    Result startProject();

    /**
     * Description: 停止当前运行工程
     * Input: 
     * Output: 
     * Return:
     * Others: 停止当前运行工程
     **/
    Result stopProject();

    /**
     * Description: 重启盒子系统
     * Input: 
     * Output: 
     * Return:
     * Others: 
     **/
    Result rebootBox();

    /**
     * Description: 启动单个设备
     * Input: deviceName设备名称
     * Output: 
     * Return:
     * Others: 如工程配置此设备为非激状态，启动将失败。
     **/
    Result startDevice(String deviceName);

    /**
     * Description: 停止单个设备
     * Input: deviceName设备名称
     * Output: 
     * Return:
     * Others: 
     **/
    Result stopDevice(String deviceName);
}