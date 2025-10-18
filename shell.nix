{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = with pkgs; [
    gradle_7
    zulu17
  ];

  shellHook = ''
    export JAVA_HOME=${pkgs.openjdk17}
    export GRADLE_HOME=${pkgs.gradle_8}
    export PATH=$GRADLE_HOME/bin:$JAVA_HOME/bin:$PATH

    echo "JAVA_HOME set to $JAVA_HOME"
    echo "GRADLE_HOME set to $GRADLE_HOME"
    java -version
    gradle -v | head -n 1
  '';
}
