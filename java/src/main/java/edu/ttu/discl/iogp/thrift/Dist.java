/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.ttu.discl.iogp.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2016-7-28")
public class Dist implements org.apache.thrift.TBase<Dist, Dist._Fields>, java.io.Serializable, Cloneable, Comparable<Dist> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Dist");

  private static final org.apache.thrift.protocol.TField SPLIT_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("splitNum", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VERTEX_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("vertexNum", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DistStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DistTupleSchemeFactory());
  }

  public int splitNum; // required
  public int vertexNum; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SPLIT_NUM((short)1, "splitNum"),
    VERTEX_NUM((short)2, "vertexNum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SPLIT_NUM
          return SPLIT_NUM;
        case 2: // VERTEX_NUM
          return VERTEX_NUM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SPLITNUM_ISSET_ID = 0;
  private static final int __VERTEXNUM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPLIT_NUM, new org.apache.thrift.meta_data.FieldMetaData("splitNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VERTEX_NUM, new org.apache.thrift.meta_data.FieldMetaData("vertexNum", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Dist.class, metaDataMap);
  }

  public Dist() {
  }

  public Dist(
    int splitNum,
    int vertexNum)
  {
    this();
    this.splitNum = splitNum;
    setSplitNumIsSet(true);
    this.vertexNum = vertexNum;
    setVertexNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Dist(Dist other) {
    __isset_bitfield = other.__isset_bitfield;
    this.splitNum = other.splitNum;
    this.vertexNum = other.vertexNum;
  }

  public Dist deepCopy() {
    return new Dist(this);
  }

  @Override
  public void clear() {
    setSplitNumIsSet(false);
    this.splitNum = 0;
    setVertexNumIsSet(false);
    this.vertexNum = 0;
  }

  public int getSplitNum() {
    return this.splitNum;
  }

  public Dist setSplitNum(int splitNum) {
    this.splitNum = splitNum;
    setSplitNumIsSet(true);
    return this;
  }

  public void unsetSplitNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPLITNUM_ISSET_ID);
  }

  /** Returns true if field splitNum is set (has been assigned a value) and false otherwise */
  public boolean isSetSplitNum() {
    return EncodingUtils.testBit(__isset_bitfield, __SPLITNUM_ISSET_ID);
  }

  public void setSplitNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPLITNUM_ISSET_ID, value);
  }

  public int getVertexNum() {
    return this.vertexNum;
  }

  public Dist setVertexNum(int vertexNum) {
    this.vertexNum = vertexNum;
    setVertexNumIsSet(true);
    return this;
  }

  public void unsetVertexNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERTEXNUM_ISSET_ID);
  }

  /** Returns true if field vertexNum is set (has been assigned a value) and false otherwise */
  public boolean isSetVertexNum() {
    return EncodingUtils.testBit(__isset_bitfield, __VERTEXNUM_ISSET_ID);
  }

  public void setVertexNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERTEXNUM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SPLIT_NUM:
      if (value == null) {
        unsetSplitNum();
      } else {
        setSplitNum((Integer)value);
      }
      break;

    case VERTEX_NUM:
      if (value == null) {
        unsetVertexNum();
      } else {
        setVertexNum((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SPLIT_NUM:
      return Integer.valueOf(getSplitNum());

    case VERTEX_NUM:
      return Integer.valueOf(getVertexNum());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SPLIT_NUM:
      return isSetSplitNum();
    case VERTEX_NUM:
      return isSetVertexNum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Dist)
      return this.equals((Dist)that);
    return false;
  }

  public boolean equals(Dist that) {
    if (that == null)
      return false;

    boolean this_present_splitNum = true;
    boolean that_present_splitNum = true;
    if (this_present_splitNum || that_present_splitNum) {
      if (!(this_present_splitNum && that_present_splitNum))
        return false;
      if (this.splitNum != that.splitNum)
        return false;
    }

    boolean this_present_vertexNum = true;
    boolean that_present_vertexNum = true;
    if (this_present_vertexNum || that_present_vertexNum) {
      if (!(this_present_vertexNum && that_present_vertexNum))
        return false;
      if (this.vertexNum != that.vertexNum)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_splitNum = true;
    list.add(present_splitNum);
    if (present_splitNum)
      list.add(splitNum);

    boolean present_vertexNum = true;
    list.add(present_vertexNum);
    if (present_vertexNum)
      list.add(vertexNum);

    return list.hashCode();
  }

  @Override
  public int compareTo(Dist other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSplitNum()).compareTo(other.isSetSplitNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplitNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.splitNum, other.splitNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVertexNum()).compareTo(other.isSetVertexNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVertexNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vertexNum, other.vertexNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Dist(");
    boolean first = true;

    sb.append("splitNum:");
    sb.append(this.splitNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("vertexNum:");
    sb.append(this.vertexNum);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'splitNum' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'vertexNum' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DistStandardSchemeFactory implements SchemeFactory {
    public DistStandardScheme getScheme() {
      return new DistStandardScheme();
    }
  }

  private static class DistStandardScheme extends StandardScheme<Dist> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Dist struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPLIT_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.splitNum = iprot.readI32();
              struct.setSplitNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERTEX_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.vertexNum = iprot.readI32();
              struct.setVertexNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSplitNum()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'splitNum' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetVertexNum()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'vertexNum' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Dist struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SPLIT_NUM_FIELD_DESC);
      oprot.writeI32(struct.splitNum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERTEX_NUM_FIELD_DESC);
      oprot.writeI32(struct.vertexNum);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DistTupleSchemeFactory implements SchemeFactory {
    public DistTupleScheme getScheme() {
      return new DistTupleScheme();
    }
  }

  private static class DistTupleScheme extends TupleScheme<Dist> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Dist struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.splitNum);
      oprot.writeI32(struct.vertexNum);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Dist struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.splitNum = iprot.readI32();
      struct.setSplitNumIsSet(true);
      struct.vertexNum = iprot.readI32();
      struct.setVertexNumIsSet(true);
    }
  }

}

