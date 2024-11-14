// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mmtp.proto
// Protobuf Java Version: 4.28.3

package net.maritimeconnectivity.mmtp;

/**
 * Protobuf enum {@code ProtocolMessageType}
 */
public enum ProtocolMessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <code>SUBSCRIBE_MESSAGE = 1;</code>
   */
  SUBSCRIBE_MESSAGE(1),
  /**
   * <code>UNSUBSCRIBE_MESSAGE = 2;</code>
   */
  UNSUBSCRIBE_MESSAGE(2),
  /**
   * <code>SEND_MESSAGE = 3;</code>
   */
  SEND_MESSAGE(3),
  /**
   * <code>RECEIVE_MESSAGE = 4;</code>
   */
  RECEIVE_MESSAGE(4),
  /**
   * <code>FETCH_MESSAGE = 5;</code>
   */
  FETCH_MESSAGE(5),
  /**
   * <code>DISCONNECT_MESSAGE = 6;</code>
   */
  DISCONNECT_MESSAGE(6),
  /**
   * <code>CONNECT_MESSAGE = 7;</code>
   */
  CONNECT_MESSAGE(7),
  /**
   * <code>NOTIFY_MESSAGE = 8;</code>
   */
  NOTIFY_MESSAGE(8),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ProtocolMessageType.class.getName());
  }
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <code>SUBSCRIBE_MESSAGE = 1;</code>
   */
  public static final int SUBSCRIBE_MESSAGE_VALUE = 1;
  /**
   * <code>UNSUBSCRIBE_MESSAGE = 2;</code>
   */
  public static final int UNSUBSCRIBE_MESSAGE_VALUE = 2;
  /**
   * <code>SEND_MESSAGE = 3;</code>
   */
  public static final int SEND_MESSAGE_VALUE = 3;
  /**
   * <code>RECEIVE_MESSAGE = 4;</code>
   */
  public static final int RECEIVE_MESSAGE_VALUE = 4;
  /**
   * <code>FETCH_MESSAGE = 5;</code>
   */
  public static final int FETCH_MESSAGE_VALUE = 5;
  /**
   * <code>DISCONNECT_MESSAGE = 6;</code>
   */
  public static final int DISCONNECT_MESSAGE_VALUE = 6;
  /**
   * <code>CONNECT_MESSAGE = 7;</code>
   */
  public static final int CONNECT_MESSAGE_VALUE = 7;
  /**
   * <code>NOTIFY_MESSAGE = 8;</code>
   */
  public static final int NOTIFY_MESSAGE_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProtocolMessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProtocolMessageType forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return SUBSCRIBE_MESSAGE;
      case 2: return UNSUBSCRIBE_MESSAGE;
      case 3: return SEND_MESSAGE;
      case 4: return RECEIVE_MESSAGE;
      case 5: return FETCH_MESSAGE;
      case 6: return DISCONNECT_MESSAGE;
      case 7: return CONNECT_MESSAGE;
      case 8: return NOTIFY_MESSAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProtocolMessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProtocolMessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProtocolMessageType>() {
          public ProtocolMessageType findValueByNumber(int number) {
            return ProtocolMessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return net.maritimeconnectivity.mmtp.Mmtp.getDescriptor().getEnumTypes().get(1);
  }

  private static final ProtocolMessageType[] VALUES = values();

  public static ProtocolMessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProtocolMessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ProtocolMessageType)
}
