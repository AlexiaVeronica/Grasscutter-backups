// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunchBoxData.proto

package emu.grasscutter.net.proto;

public final class LunchBoxDataOuterClass {
  private LunchBoxDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunchBoxDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunchBoxData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    int getSlotMaterialMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    boolean containsSlotMaterialMap(
        int key);
    /**
     * Use {@link #getSlotMaterialMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSlotMaterialMap();
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSlotMaterialMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */

    int getSlotMaterialMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */

    int getSlotMaterialMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code LunchBoxData}
   */
  public static final class LunchBoxData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunchBoxData)
      LunchBoxDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunchBoxData.newBuilder() to construct.
    private LunchBoxData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunchBoxData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunchBoxData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunchBoxData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                slotMaterialMap_ = com.google.protobuf.MapField.newMapField(
                    SlotMaterialMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              slotMaterialMap__ = input.readMessage(
                  SlotMaterialMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              slotMaterialMap_.getMutableMap().put(
                  slotMaterialMap__.getKey(), slotMaterialMap__.getValue());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetSlotMaterialMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.class, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder.class);
    }

    public static final int SLOT_MATERIAL_MAP_FIELD_NUMBER = 3;
    private static final class SlotMaterialMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> slotMaterialMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetSlotMaterialMap() {
      if (slotMaterialMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SlotMaterialMapDefaultEntryHolder.defaultEntry);
      }
      return slotMaterialMap_;
    }

    public int getSlotMaterialMapCount() {
      return internalGetSlotMaterialMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */

    @java.lang.Override
    public boolean containsSlotMaterialMap(
        int key) {
      
      return internalGetSlotMaterialMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSlotMaterialMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMaterialMap() {
      return getSlotMaterialMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMaterialMapMap() {
      return internalGetSlotMaterialMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    @java.lang.Override

    public int getSlotMaterialMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSlotMaterialMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
     */
    @java.lang.Override

    public int getSlotMaterialMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSlotMaterialMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSlotMaterialMap(),
          SlotMaterialMapDefaultEntryHolder.defaultEntry,
          3);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetSlotMaterialMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        slotMaterialMap__ = SlotMaterialMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, slotMaterialMap__);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData other = (emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData) obj;

      if (!internalGetSlotMaterialMap().equals(
          other.internalGetSlotMaterialMap())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetSlotMaterialMap().getMap().isEmpty()) {
        hash = (37 * hash) + SLOT_MATERIAL_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSlotMaterialMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LunchBoxData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunchBoxData)
        emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetSlotMaterialMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableSlotMaterialMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.class, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableSlotMaterialMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LunchBoxDataOuterClass.internal_static_LunchBoxData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData build() {
        emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData buildPartial() {
        emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData result = new emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData(this);
        int from_bitField0_ = bitField0_;
        result.slotMaterialMap_ = internalGetSlotMaterialMap();
        result.slotMaterialMap_.makeImmutable();
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData) {
          return mergeFrom((emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData other) {
        if (other == emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance()) return this;
        internalGetMutableSlotMaterialMap().mergeFrom(
            other.internalGetSlotMaterialMap());
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> slotMaterialMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetSlotMaterialMap() {
        if (slotMaterialMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SlotMaterialMapDefaultEntryHolder.defaultEntry);
        }
        return slotMaterialMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableSlotMaterialMap() {
        onChanged();;
        if (slotMaterialMap_ == null) {
          slotMaterialMap_ = com.google.protobuf.MapField.newMapField(
              SlotMaterialMapDefaultEntryHolder.defaultEntry);
        }
        if (!slotMaterialMap_.isMutable()) {
          slotMaterialMap_ = slotMaterialMap_.copy();
        }
        return slotMaterialMap_;
      }

      public int getSlotMaterialMapCount() {
        return internalGetSlotMaterialMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */

      @java.lang.Override
      public boolean containsSlotMaterialMap(
          int key) {
        
        return internalGetSlotMaterialMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSlotMaterialMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMaterialMap() {
        return getSlotMaterialMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getSlotMaterialMapMap() {
        return internalGetSlotMaterialMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */
      @java.lang.Override

      public int getSlotMaterialMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSlotMaterialMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */
      @java.lang.Override

      public int getSlotMaterialMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSlotMaterialMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSlotMaterialMap() {
        internalGetMutableSlotMaterialMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */

      public Builder removeSlotMaterialMap(
          int key) {
        
        internalGetMutableSlotMaterialMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableSlotMaterialMap() {
        return internalGetMutableSlotMaterialMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */
      public Builder putSlotMaterialMap(
          int key,
          int value) {
        
        
        internalGetMutableSlotMaterialMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; slot_material_map = 3;</code>
       */

      public Builder putAllSlotMaterialMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableSlotMaterialMap().getMutableMap()
            .putAll(values);
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LunchBoxData)
    }

    // @@protoc_insertion_point(class_scope:LunchBoxData)
    private static final emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData();
    }

    public static emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunchBoxData>
        PARSER = new com.google.protobuf.AbstractParser<LunchBoxData>() {
      @java.lang.Override
      public LunchBoxData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunchBoxData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunchBoxData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunchBoxData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunchBoxData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunchBoxData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunchBoxData_SlotMaterialMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LunchBoxData.proto\"\205\001\n\014LunchBoxData\022=\n" +
      "\021slot_material_map\030\003 \003(\0132\".LunchBoxData." +
      "SlotMaterialMapEntry\0326\n\024SlotMaterialMapE" +
      "ntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunchBoxData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunchBoxData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunchBoxData_descriptor,
        new java.lang.String[] { "SlotMaterialMap", });
    internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor =
      internal_static_LunchBoxData_descriptor.getNestedTypes().get(0);
    internal_static_LunchBoxData_SlotMaterialMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunchBoxData_SlotMaterialMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}