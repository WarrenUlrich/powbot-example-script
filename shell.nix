{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = with pkgs; [
    gradle
    zulu17
  ];

  shellHook = ''
    export JAVA_HOME=${pkgs.zulu17}
    export PATH=$JAVA_HOME/bin:$PATH

    echo "JAVA_HOME set to $JAVA_HOME"
    java -version

    cat > $PWD/gradle.properties <<EOF
org.gradle.java.home=$JAVA_HOME
EOF
  '';
}
