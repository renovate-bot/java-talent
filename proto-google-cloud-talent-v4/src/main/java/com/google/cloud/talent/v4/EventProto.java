/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/event.proto

package com.google.cloud.talent.v4;

public final class EventProto {
  private EventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_ClientEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_ClientEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4_JobEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4_JobEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/talent/v4/event.proto\022\026go"
          + "ogle.cloud.talent.v4\032\037google/api/field_b"
          + "ehavior.proto\032\037google/protobuf/timestamp"
          + ".proto\032\034google/api/annotations.proto\"\303\001\n"
          + "\013ClientEvent\022\022\n\nrequest_id\030\001 \001(\t\022\025\n\010even"
          + "t_id\030\002 \001(\tB\003\340A\002\0224\n\013create_time\030\004 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\002\0225\n\tjob_eve"
          + "nt\030\005 \001(\0132 .google.cloud.talent.v4.JobEve"
          + "ntH\000\022\023\n\013event_notes\030\t \001(\tB\007\n\005event\"\340\003\n\010J"
          + "obEvent\022@\n\004type\030\001 \001(\0162-.google.cloud.tal"
          + "ent.v4.JobEvent.JobEventTypeB\003\340A\002\022\021\n\004job"
          + "s\030\002 \003(\tB\003\340A\002\"\376\002\n\014JobEventType\022\036\n\032JOB_EVE"
          + "NT_TYPE_UNSPECIFIED\020\000\022\016\n\nIMPRESSION\020\001\022\010\n"
          + "\004VIEW\020\002\022\021\n\rVIEW_REDIRECT\020\003\022\025\n\021APPLICATIO"
          + "N_START\020\004\022\026\n\022APPLICATION_FINISH\020\005\022 \n\034APP"
          + "LICATION_QUICK_SUBMISSION\020\006\022\030\n\024APPLICATI"
          + "ON_REDIRECT\020\007\022!\n\035APPLICATION_START_FROM_"
          + "SEARCH\020\010\022$\n APPLICATION_REDIRECT_FROM_SE"
          + "ARCH\020\t\022\036\n\032APPLICATION_COMPANY_SUBMIT\020\n\022\014"
          + "\n\010BOOKMARK\020\013\022\020\n\014NOTIFICATION\020\014\022\t\n\005HIRED\020"
          + "\r\022\013\n\007SENT_CV\020\016\022\025\n\021INTERVIEW_GRANTED\020\017Bn\n"
          + "\032com.google.cloud.talent.v4B\nEventProtoP"
          + "\001Z<google.golang.org/genproto/googleapis"
          + "/cloud/talent/v4;talent\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4_ClientEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4_ClientEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_ClientEvent_descriptor,
            new java.lang.String[] {
              "RequestId", "EventId", "CreateTime", "JobEvent", "EventNotes", "Event",
            });
    internal_static_google_cloud_talent_v4_JobEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4_JobEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4_JobEvent_descriptor,
            new java.lang.String[] {
              "Type", "Jobs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
