# stainless-project.g8

A [Giter8][g8] template for Stainless-enabled projects!

## Requirements

- sbt >= 0.13.1 or sbt 1.2.x

## Usage

1. Create a new project from the command line with:

    ```
    $ sbt new epfl-lara/stainless-project.g8
    ```

2. Put you verified code within the `verified` project, and your regular Scala code within the `core` project.

3. Launch sbt at the root of the project:

    ```
    $ sbt
    ```

4. Run the application, while also verifying your code:

    ```
    > core/run
    ```

5. Alternatively you can just compile and verify your code with:

    ```
    > verified/compile
    ```

## Configuration

You can configure Stainless by editing the `stainless.conf` file at the root of the project.
[See the online documentation](https://epfl-lara.github.io/stainless/options.html) for available options.

## Template license

Written in 2019 by Romain Ruetschi <romain.ruetschi@epfl.ch>, EPFL-LARA.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
