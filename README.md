# Kabeja Library Project

[Kabeja](https://github.com/kabeja/kabeja) is a Java library for parsing, processing, and converting DXF entities to SVG, PDF, and other formats. This README provides guidelines on how to compile and use the Kabeja library in your own projects.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Building the Library](#building-the-library)
- [Using the Library](#using-the-library)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you start, make sure you have the following software installed on your system:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 or later)
- [Apache Ant](https://ant.apache.org/bindownload.cgi)

## Building the Library

To compile the Kabeja library, follow these steps:

1. Clone the repository:
    ```shell
    git clone https://github.com/jpgiance/Kabeja.git
    ```
2. Navigate to the project directory:
    ```shell
    cd kabeja
    ```
3. Build the project:
    ```shell
    ant
    ```
After successful compilation, you will find the compiled jar files in the `dist` directory.

## Using the Library

To use the Kabeja library in your Java project, you need to include the compiled jar files in your classpath. The primary library file is `kabeja-0.4.jar`. The other jar files in the `dist` directory provide support for different formats and additional features.

## License
Kabeja is open-source software, licensed under the Apache License 2.0
