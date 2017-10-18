/**
 * QueryDealerInfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.yonyou.dms.web.client.dealerInfo;

public class QueryDealerInfoLocator extends org.apache.axis.client.Service implements com.yonyou.dms.web.client.dealerInfo.QueryDealerInfo {

    public QueryDealerInfoLocator() {
    }


    public QueryDealerInfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryDealerInfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for queryDealerInfoHttpSoap11Endpoint
    private java.lang.String queryDealerInfoHttpSoap11Endpoint_address = "http://localhost:8080/dms.web/services/queryDealerInfo.queryDealerInfoHttpSoap11Endpoint/";

    public java.lang.String getqueryDealerInfoHttpSoap11EndpointAddress() {
        return queryDealerInfoHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryDealerInfoHttpSoap11EndpointWSDDServiceName = "queryDealerInfoHttpSoap11Endpoint";

    public java.lang.String getqueryDealerInfoHttpSoap11EndpointWSDDServiceName() {
        return queryDealerInfoHttpSoap11EndpointWSDDServiceName;
    }

    public void setqueryDealerInfoHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        queryDealerInfoHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType getqueryDealerInfoHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryDealerInfoHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryDealerInfoHttpSoap11Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType getqueryDealerInfoHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap11BindingStub _stub = new com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap11BindingStub(portAddress, this);
            _stub.setPortName(getqueryDealerInfoHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryDealerInfoHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        queryDealerInfoHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for queryDealerInfoHttpSoap12Endpoint
    private java.lang.String queryDealerInfoHttpSoap12Endpoint_address = "http://localhost:8080/dms.web/services/queryDealerInfo.queryDealerInfoHttpSoap12Endpoint/";

    public java.lang.String getqueryDealerInfoHttpSoap12EndpointAddress() {
        return queryDealerInfoHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryDealerInfoHttpSoap12EndpointWSDDServiceName = "queryDealerInfoHttpSoap12Endpoint";

    public java.lang.String getqueryDealerInfoHttpSoap12EndpointWSDDServiceName() {
        return queryDealerInfoHttpSoap12EndpointWSDDServiceName;
    }

    public void setqueryDealerInfoHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        queryDealerInfoHttpSoap12EndpointWSDDServiceName = name;
    }

    public com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType getqueryDealerInfoHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryDealerInfoHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryDealerInfoHttpSoap12Endpoint(endpoint);
    }

    public com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType getqueryDealerInfoHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap12BindingStub _stub = new com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap12BindingStub(portAddress, this);
            _stub.setPortName(getqueryDealerInfoHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryDealerInfoHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        queryDealerInfoHttpSoap12Endpoint_address = address;
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
            if (com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap11BindingStub _stub = new com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap11BindingStub(new java.net.URL(queryDealerInfoHttpSoap11Endpoint_address), this);
                _stub.setPortName(getqueryDealerInfoHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap12BindingStub _stub = new com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoSoap12BindingStub(new java.net.URL(queryDealerInfoHttpSoap12Endpoint_address), this);
                _stub.setPortName(getqueryDealerInfoHttpSoap12EndpointWSDDServiceName());
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
        if ("queryDealerInfoHttpSoap11Endpoint".equals(inputPortName)) {
            return getqueryDealerInfoHttpSoap11Endpoint();
        }
        else if ("queryDealerInfoHttpSoap12Endpoint".equals(inputPortName)) {
            return getqueryDealerInfoHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "queryDealerInfo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "queryDealerInfoHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "queryDealerInfoHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("queryDealerInfoHttpSoap11Endpoint".equals(portName)) {
            setqueryDealerInfoHttpSoap11EndpointEndpointAddress(address);
        }
        if ("queryDealerInfoHttpSoap12Endpoint".equals(portName)) {
            setqueryDealerInfoHttpSoap12EndpointEndpointAddress(address);
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
