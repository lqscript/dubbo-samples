// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeter.proto

package org.apache.dubbo.springboot.demo.idl;

public final class GreeterOuterClass {
  private GreeterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_GreeterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_GreeterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_test_GreeterReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_test_GreeterReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgreeter.proto\022\004test\"\036\n\016GreeterRequest\022" +
      "\014\n\004name\030\001 \001(\t\"\037\n\014GreeterReply\022\017\n\007message" +
      "\030\001 \001(\t2<\n\007Greeter\0221\n\005greet\022\024.test.Greete" +
      "rRequest\032\022.test.GreeterReplyB(\n$org.apac" +
      "he.dubbo.springboot.demo.idlP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_test_GreeterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_test_GreeterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_GreeterRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_test_GreeterReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_test_GreeterReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_test_GreeterReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
