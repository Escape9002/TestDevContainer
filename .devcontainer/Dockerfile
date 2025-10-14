# Start from the latest official Alpine Linux image
FROM alpine:latest

RUN echo 'http://dl-cdn.alpinelinux.org/alpine/edge/testing' >> /etc/apk/repositories

# Install necessary dependencies
RUN apk update && apk add --no-cache \
    ca-certificates \
    bash \
    git \
    curl \
    wget

# Install OpenJDK 21 (LTS) and the latest Node.js + npm
RUN apk add --no-cache \
    openjdk25-jdk \
    nodejs \
    npm

# Set JAVA_HOME environment variable for Java 21
ENV JAVA_HOME=/usr/lib/jvm/java-25-openjdk
ENV PATH="$JAVA_HOME/bin:${PATH}"

# Verify installations (optional)
RUN java -version
RUN node -v
RUN npm -v

# --- Dev Container Specifics ---
# Create a non-root user 'vscode' for better security
RUN addgroup -g 1000 vscode && \
    adduser -u 1000 -G vscode -h /home/vscode -s /bin/bash -D vscode

# Switch to the non-root user
USER vscode

# Set the working directory
WORKDIR /home/vscode