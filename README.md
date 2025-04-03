# MMTP Protobuf definitions

This repository contains the normative Protobuf Structure for The Maritime Messaging Transfer Protocol (MMTP) as defined in [RTCM Standard 13900.0, Maritime Messaging Service Architecture and Protocol](https://rtcm.myshopify.com/collections/maritime-communication-standards/products/rtcm-13900-0-for-maritime-messaging-service-architecture-protocol).

Furthermore the repository contains the language specific Protobuf bindings, compiled using [Protoc](https://protobuf.dev/installation/).

## How to recompile language bindings
To compile language bindings for golang to a folder `go` execute the following command from the root directory
```
protoc -I=. --go_out=go mmtp.proto
```