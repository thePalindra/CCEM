FROM rust:1.70-slim as builder

WORKDIR /app
ADD . /app

RUN apt update
RUN apt install -y pkg-config
RUN apt-get install libssl-dev
RUN cargo build --release

FROM gcr.io/distroless/cc
COPY --from=builder /app/target/release/rust /
CMD ["./rust"]