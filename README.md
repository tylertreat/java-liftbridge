# java-liftbridge [![CircleCI](https://circleci.com/gh/liftbridge-io/java-liftbridge.svg?style=svg)](https://circleci.com/gh/liftbridge-io/java-liftbridge)

**This project is under development**

Java client for [Liftbridge](https://github.com/liftbridge-io/liftbridge), a system that provides lightweight, fault-tolerant message streams for [NATS](https://nats.io).

Liftbridge provides the following high-level features:

- Log-based API for NATS
- Replicated for fault-tolerance
- Horizontally scalable
- Wildcard subscription support
- At-least-once delivery support and message replay
- Message key-value support
- Log compaction by key

This project is under active development and changing rapidly. For basic usage, for now refer to [the tests](src/test/java/io/liftbridge).

## Testing

To run the tests, first start the standalone dev image:

```
$ docker run -t -p 4222:4222 -p 9292:9292 -p 8222:8222 -p 6222:6222 liftbridge/standalone-dev:latest
```

Then, go to the project's root dir and run `./gradlew test`.

## Feature list

- [X] Create Streams
- [X] Subscribe to stream / subject
- [X] Publish to stream
- [X] Publish to subject API
- [X] Metadata API
- [X] Subscribe to partition leader
- [ ] Partitioner by key
- [ ] Round-robin partitioner

