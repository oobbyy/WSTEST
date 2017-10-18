/**
 * HttpGetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.yonyou.dms.web.client.sqlinfo;

public class HttpGetResponse  implements java.io.Serializable {
    private com.yonyou.dms.web.client.sqlinfo.Map1 _return;

    public HttpGetResponse() {
    }

    public HttpGetResponse(
           com.yonyou.dms.web.client.sqlinfo.Map1 _return) {
           this._return = _return;
    }


    /**
     * Gets the _return value for this HttpGetResponse.
     * 
     * @return _return
     */
    public com.yonyou.dms.web.client.sqlinfo.Map1 get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this HttpGetResponse.
     * 
     * @param _return
     */
    public void set_return(com.yonyou.dms.web.client.sqlinfo.Map1 _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HttpGetResponse)) return false;
        HttpGetResponse other = (HttpGetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HttpGetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", ">httpGetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("http://inter.web.dms.yonyou.com", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.apache.org/namespaces/axis2/map", "map1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
