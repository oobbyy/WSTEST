/**
 * SyncOrgInfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.yonyou.dms.web.client.syncorg;

public class SyncOrgInfoLocator extends org.apache.axis.client.Service implements com.yonyou.dms.web.client.syncorg.SyncOrgInfo {

    public SyncOrgInfoLocator() {
    }


    public SyncOrgInfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SyncOrgInfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for syncOrgInfoHttpSoap12Endpoint
    private java.lang.String syncOrgInfoHttpSoap12Endpoint_address = "http://localhost:8080/dms.web/services/syncOrgInfo.syncOrgInfoHttpSoap12Endpoint/";

    public java.lang.String getsyncOrgInfoHttpSoap12EndpointAddress() {
        return syncOrgInfoHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String syncOrgInfoHttpSoap12EndpointWSDDServiceName = "syncOrgInfoHttpSoap12Endpoint";

    public java.lang.String getsyncOrgInfoHttpSoap12EndpointWSDDServiceName() {
        return syncOrgInfoHttpSoap12EndpointWSDDServiceName;
    }

    public void setsyncOrgInfoHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        syncOrgInfoHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType getsyncOrgInfoHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(syncOrgInfoHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsyncOrgInfoHttpSoap12Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType getsyncOrgInfoHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap12BindingStub _stub = new com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap12BindingStub(portAddress, this);
            _stub.setPortName(getsyncOrgInfoHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsyncOrgInfoHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        syncOrgInfoHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for syncOrgInfoHttpSoap11Endpoint
    private java.lang.String syncOrgInfoHttpSoap11Endpoint_address = "http://localhost:8080/dms.web/services/syncOrgInfo.syncOrgInfoHttpSoap11Endpoint/";

    public java.lang.String getsyncOrgInfoHttpSoap11EndpointAddress() {
        return syncOrgInfoHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String syncOrgInfoHttpSoap11EndpointWSDDServiceName = "syncOrgInfoHttpSoap11Endpoint";

    public java.lang.String getsyncOrgInfoHttpSoap11EndpointWSDDServiceName() {
        return syncOrgInfoHttpSoap11EndpointWSDDServiceName;
    }

    public void setsyncOrgInfoHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        syncOrgInfoHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType getsyncOrgInfoHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(syncOrgInfoHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsyncOrgInfoHttpSoap11Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType getsyncOrgInfoHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap11BindingStub _stub = new com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap11BindingStub(portAddress, this);
            _stub.setPortName(getsyncOrgInfoHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsyncOrgInfoHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        syncOrgInfoHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap12BindingStub _stub = new com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap12BindingStub(new java.net.URL(syncOrgInfoHttpSoap12Endpoint_address), this);
                _stub.setPortName(getsyncOrgInfoHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (com.yonyou.dms.web.client.syncorg.SyncOrgInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap11BindingStub _stub = new com.yonyou.dms.web.client.syncorg.SyncOrgInfoSoap11BindingStub(new java.net.URL(syncOrgInfoHttpSoap11Endpoint_address), this);
                _stub.setPortName(getsyncOrgInfoHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("syncOrgInfoHttpSoap12Endpoint".equals(inputPortName)) {
            return getsyncOrgInfoHttpSoap12Endpoint();
        }
        else if ("syncOrgInfoHttpSoap11Endpoint".equals(inputPortName)) {
            return getsyncOrgInfoHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "syncOrgInfo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "syncOrgInfoHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "syncOrgInfoHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("syncOrgInfoHttpSoap12Endpoint".equals(portName)) {
            setsyncOrgInfoHttpSoap12EndpointEndpointAddress(address);
        }
        if ("syncOrgInfoHttpSoap11Endpoint".equals(portName)) {
            setsyncOrgInfoHttpSoap11EndpointEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
