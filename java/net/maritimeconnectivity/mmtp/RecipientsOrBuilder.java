// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: mmtp.proto
// Protobuf Java Version: 4.28.3

package net.maritimeconnectivity.mmtp;

public interface RecipientsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Recipients)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string recipients = 1;</code>
   * @return A list containing the recipients.
   */
  java.util.List<java.lang.String>
      getRecipientsList();
  /**
   * <code>repeated string recipients = 1;</code>
   * @return The count of recipients.
   */
  int getRecipientsCount();
  /**
   * <code>repeated string recipients = 1;</code>
   * @param index The index of the element to return.
   * @return The recipients at the given index.
   */
  java.lang.String getRecipients(int index);
  /**
   * <code>repeated string recipients = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the recipients at the given index.
   */
  com.google.protobuf.ByteString
      getRecipientsBytes(int index);
}