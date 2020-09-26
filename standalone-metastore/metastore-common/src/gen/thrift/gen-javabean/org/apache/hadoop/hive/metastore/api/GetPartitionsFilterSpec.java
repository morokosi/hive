/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetPartitionsFilterSpec implements org.apache.thrift.TBase<GetPartitionsFilterSpec, GetPartitionsFilterSpec._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionsFilterSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetPartitionsFilterSpec");

  private static final org.apache.thrift.protocol.TField FILTER_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("filterMode", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField FILTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("filters", org.apache.thrift.protocol.TType.LIST, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetPartitionsFilterSpecStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetPartitionsFilterSpecTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable PartitionFilterMode filterMode; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> filters; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PartitionFilterMode
     */
    FILTER_MODE((short)7, "filterMode"),
    FILTERS((short)8, "filters");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 7: // FILTER_MODE
          return FILTER_MODE;
        case 8: // FILTERS
          return FILTERS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.FILTER_MODE,_Fields.FILTERS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILTER_MODE, new org.apache.thrift.meta_data.FieldMetaData("filterMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PartitionFilterMode.class)));
    tmpMap.put(_Fields.FILTERS, new org.apache.thrift.meta_data.FieldMetaData("filters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionsFilterSpec.class, metaDataMap);
  }

  public GetPartitionsFilterSpec() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionsFilterSpec(GetPartitionsFilterSpec other) {
    if (other.isSetFilterMode()) {
      this.filterMode = other.filterMode;
    }
    if (other.isSetFilters()) {
      java.util.List<java.lang.String> __this__filters = new java.util.ArrayList<java.lang.String>(other.filters);
      this.filters = __this__filters;
    }
  }

  public GetPartitionsFilterSpec deepCopy() {
    return new GetPartitionsFilterSpec(this);
  }

  @Override
  public void clear() {
    this.filterMode = null;
    this.filters = null;
  }

  /**
   * 
   * @see PartitionFilterMode
   */
  @org.apache.thrift.annotation.Nullable
  public PartitionFilterMode getFilterMode() {
    return this.filterMode;
  }

  /**
   * 
   * @see PartitionFilterMode
   */
  public void setFilterMode(@org.apache.thrift.annotation.Nullable PartitionFilterMode filterMode) {
    this.filterMode = filterMode;
  }

  public void unsetFilterMode() {
    this.filterMode = null;
  }

  /** Returns true if field filterMode is set (has been assigned a value) and false otherwise */
  public boolean isSetFilterMode() {
    return this.filterMode != null;
  }

  public void setFilterModeIsSet(boolean value) {
    if (!value) {
      this.filterMode = null;
    }
  }

  public int getFiltersSize() {
    return (this.filters == null) ? 0 : this.filters.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getFiltersIterator() {
    return (this.filters == null) ? null : this.filters.iterator();
  }

  public void addToFilters(java.lang.String elem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<java.lang.String>();
    }
    this.filters.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getFilters() {
    return this.filters;
  }

  public void setFilters(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> filters) {
    this.filters = filters;
  }

  public void unsetFilters() {
    this.filters = null;
  }

  /** Returns true if field filters is set (has been assigned a value) and false otherwise */
  public boolean isSetFilters() {
    return this.filters != null;
  }

  public void setFiltersIsSet(boolean value) {
    if (!value) {
      this.filters = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FILTER_MODE:
      if (value == null) {
        unsetFilterMode();
      } else {
        setFilterMode((PartitionFilterMode)value);
      }
      break;

    case FILTERS:
      if (value == null) {
        unsetFilters();
      } else {
        setFilters((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FILTER_MODE:
      return getFilterMode();

    case FILTERS:
      return getFilters();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FILTER_MODE:
      return isSetFilterMode();
    case FILTERS:
      return isSetFilters();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPartitionsFilterSpec)
      return this.equals((GetPartitionsFilterSpec)that);
    return false;
  }

  public boolean equals(GetPartitionsFilterSpec that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_filterMode = true && this.isSetFilterMode();
    boolean that_present_filterMode = true && that.isSetFilterMode();
    if (this_present_filterMode || that_present_filterMode) {
      if (!(this_present_filterMode && that_present_filterMode))
        return false;
      if (!this.filterMode.equals(that.filterMode))
        return false;
    }

    boolean this_present_filters = true && this.isSetFilters();
    boolean that_present_filters = true && that.isSetFilters();
    if (this_present_filters || that_present_filters) {
      if (!(this_present_filters && that_present_filters))
        return false;
      if (!this.filters.equals(that.filters))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFilterMode()) ? 131071 : 524287);
    if (isSetFilterMode())
      hashCode = hashCode * 8191 + filterMode.getValue();

    hashCode = hashCode * 8191 + ((isSetFilters()) ? 131071 : 524287);
    if (isSetFilters())
      hashCode = hashCode * 8191 + filters.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetPartitionsFilterSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFilterMode()).compareTo(other.isSetFilterMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilterMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filterMode, other.filterMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFilters()).compareTo(other.isSetFilters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filters, other.filters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPartitionsFilterSpec(");
    boolean first = true;

    if (isSetFilterMode()) {
      sb.append("filterMode:");
      if (this.filterMode == null) {
        sb.append("null");
      } else {
        sb.append(this.filterMode);
      }
      first = false;
    }
    if (isSetFilters()) {
      if (!first) sb.append(", ");
      sb.append("filters:");
      if (this.filters == null) {
        sb.append("null");
      } else {
        sb.append(this.filters);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetPartitionsFilterSpecStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetPartitionsFilterSpecStandardScheme getScheme() {
      return new GetPartitionsFilterSpecStandardScheme();
    }
  }

  private static class GetPartitionsFilterSpecStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetPartitionsFilterSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetPartitionsFilterSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 7: // FILTER_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.filterMode = org.apache.hadoop.hive.metastore.api.PartitionFilterMode.findByValue(iprot.readI32());
              struct.setFilterModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // FILTERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1224 = iprot.readListBegin();
                struct.filters = new java.util.ArrayList<java.lang.String>(_list1224.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1225;
                for (int _i1226 = 0; _i1226 < _list1224.size; ++_i1226)
                {
                  _elem1225 = iprot.readString();
                  struct.filters.add(_elem1225);
                }
                iprot.readListEnd();
              }
              struct.setFiltersIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetPartitionsFilterSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.filterMode != null) {
        if (struct.isSetFilterMode()) {
          oprot.writeFieldBegin(FILTER_MODE_FIELD_DESC);
          oprot.writeI32(struct.filterMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.filters != null) {
        if (struct.isSetFilters()) {
          oprot.writeFieldBegin(FILTERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.filters.size()));
            for (java.lang.String _iter1227 : struct.filters)
            {
              oprot.writeString(_iter1227);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionsFilterSpecTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetPartitionsFilterSpecTupleScheme getScheme() {
      return new GetPartitionsFilterSpecTupleScheme();
    }
  }

  private static class GetPartitionsFilterSpecTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetPartitionsFilterSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetPartitionsFilterSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFilterMode()) {
        optionals.set(0);
      }
      if (struct.isSetFilters()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFilterMode()) {
        oprot.writeI32(struct.filterMode.getValue());
      }
      if (struct.isSetFilters()) {
        {
          oprot.writeI32(struct.filters.size());
          for (java.lang.String _iter1228 : struct.filters)
          {
            oprot.writeString(_iter1228);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetPartitionsFilterSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.filterMode = org.apache.hadoop.hive.metastore.api.PartitionFilterMode.findByValue(iprot.readI32());
        struct.setFilterModeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list1229 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.filters = new java.util.ArrayList<java.lang.String>(_list1229.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem1230;
          for (int _i1231 = 0; _i1231 < _list1229.size; ++_i1231)
          {
            _elem1230 = iprot.readString();
            struct.filters.add(_elem1230);
          }
        }
        struct.setFiltersIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

