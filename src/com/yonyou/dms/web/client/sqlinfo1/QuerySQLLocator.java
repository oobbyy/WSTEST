/**
 * QuerySQLLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.yonyou.dms.web.client.sqlinfo1;

public class QuerySQLLocator extends org.apache.axis.client.Service implements com.yonyou.dms.web.client.sqlinfo1.QuerySQL {

    public QuerySQLLocator() {
    }


    public QuerySQLLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuerySQLLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for querySQLHttpSoap12Endpoint
    private java.lang.String querySQLHttpSoap12Endpoint_address = "http://localhost:8080/dms.web/services/querySQL.querySQLHttpSoap12Endpoint/";

    public java.lang.String getquerySQLHttpSoap12EndpointAddress() {
        return querySQLHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String querySQLHttpSoap12EndpointWSDDServiceName = "querySQLHttpSoap12Endpoint";

    public java.lang.String getquerySQLHttpSoap12EndpointWSDDServiceName() {
        return querySQLHttpSoap12EndpointWSDDServiceName;
    }

    public void setquerySQLHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        querySQLHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType getquerySQLHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(querySQLHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getquerySQLHttpSoap12Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType getquerySQLHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap12BindingStub _stub = new com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap12BindingStub(portAddress, this);
            _stub.setPortName(getquerySQLHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setquerySQLHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        querySQLHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for querySQLHttpSoap11Endpoint
    private java.lang.String querySQLHttpSoap11Endpoint_address = "http://localhost:8080/dms.web/services/querySQL.querySQLHttpSoap11Endpoint/";

    public java.lang.String getquerySQLHttpSoap11EndpointAddress() {
        return querySQLHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String querySQLHttpSoap11EndpointWSDDServiceName = "querySQLHttpSoap11Endpoint";

    public java.lang.String getquerySQLHttpSoap11EndpointWSDDServiceName() {
        return querySQLHttpSoap11EndpointWSDDServiceName;
    }

    public void setquerySQLHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        querySQLHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType getquerySQLHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(querySQLHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getquerySQLHttpSoap11Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType getquerySQLHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap11BindingStub _stub = new com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap11BindingStub(portAddress, this);
            _stub.setPortName(getquerySQLHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setquerySQLHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        querySQLHttpSoap11Endpoint_address = address;
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
            if (com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap12BindingStub _stub = new com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap12BindingStub(new java.net.URL(querySQLHttpSoap12Endpoint_address), this);
                _stub.setPortName(getquerySQLHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (com.yonyou.dms.web.client.sqlinfo1.QuerySQLPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap11BindingStub _stub = new com.yonyou.dms.web.client.sqlinfo1.QuerySQLSoap11BindingStub(new java.net.URL(querySQLHttpSoap11Endpoint_address), this);
                _stub.setPortName(getquerySQLHttpSoap11EndpointWSDDServiceName());
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
        if ("querySQLHttpSoap12Endpoint".equals(inputPortName)) {
            return getquerySQLHttpSoap12Endpoint();
        }
        else if ("querySQLHttpSoap11Endpoint".equals(inputPortName)) {
            return getquerySQLHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "querySQL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "querySQLHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "querySQLHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("querySQLHttpSoap12Endpoint".equals(portName)) {
            setquerySQLHttpSoap12EndpointEndpointAddress(address);
        }
        if ("querySQLHttpSoap11Endpoint".equals(portName)) {
            setquerySQLHttpSoap11EndpointEndpointAddress(address);
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
