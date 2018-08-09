cd src/
javac.exe $(find . -type f -name "*.java")
java dev/pacito/computerblocks/Launcher

rm src/dev/pacito/computerblocks/*.class src/dev/pacito/computerblocks/**/*.class