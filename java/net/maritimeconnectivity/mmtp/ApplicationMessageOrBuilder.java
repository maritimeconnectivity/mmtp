// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mmtp.proto
// Protobuf Java Version: 4.28.3

package net.maritimeconnectivity.mmtp;

public interface ApplicationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApplicationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ApplicationMessageHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.ApplicationMessageHeader header = 1;</code>
   * @return The header.
   */
  net.maritimeconnectivity.mmtp.ApplicationMessageHeader getHeader();
  /**
   * <code>.ApplicationMessageHeader header = 1;</code>
   */
  net.maritimeconnectivity.mmtp.ApplicationMessageHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>bytes body = 2;</code>
   * @return The body.
   */
  com.google.protobuf.ByteString getBody();

  /**
   * <code>bytes signature = 3;</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}