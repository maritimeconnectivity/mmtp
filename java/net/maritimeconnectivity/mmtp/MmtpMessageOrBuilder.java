// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mmtp.proto
// Protobuf Java Version: 4.28.3

package net.maritimeconnectivity.mmtp;

public interface MmtpMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MmtpMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MsgType msgType = 1;</code>
   * @return The enum numeric value on the wire for msgType.
   */
  int getMsgTypeValue();
  /**
   * <code>.MsgType msgType = 1;</code>
   * @return The msgType.
   */
  net.maritimeconnectivity.mmtp.MsgType getMsgType();

  /**
   * <code>string uuid = 2;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 2;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>.ProtocolMessage protocolMessage = 3;</code>
   * @return Whether the protocolMessage field is set.
   */
  boolean hasProtocolMessage();
  /**
   * <code>.ProtocolMessage protocolMessage = 3;</code>
   * @return The protocolMessage.
   */
  net.maritimeconnectivity.mmtp.ProtocolMessage getProtocolMessage();
  /**
   * <code>.ProtocolMessage protocolMessage = 3;</code>
   */
  net.maritimeconnectivity.mmtp.ProtocolMessageOrBuilder getProtocolMessageOrBuilder();

  /**
   * <code>.ResponseMessage responseMessage = 4;</code>
   * @return Whether the responseMessage field is set.
   */
  boolean hasResponseMessage();
  /**
   * <code>.ResponseMessage responseMessage = 4;</code>
   * @return The responseMessage.
   */
  net.maritimeconnectivity.mmtp.ResponseMessage getResponseMessage();
  /**
   * <code>.ResponseMessage responseMessage = 4;</code>
   */
  net.maritimeconnectivity.mmtp.ResponseMessageOrBuilder getResponseMessageOrBuilder();

  net.maritimeconnectivity.mmtp.MmtpMessage.BodyCase getBodyCase();
}
