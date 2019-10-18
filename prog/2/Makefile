source_folder=PokemonLab/src/main/java/com/kupp/progLab2
bin_folder=PokemonLab/bin
expected_jar_name=Lab2.jar
dependaces=Pokemon.jar
manifest=MANIFEST.MF

all: clean class jar

.PHONY: clean
clean:
	-rm -rf $(bin_folder)/*

class:
	javac `find $(source_folder) -name "*.java"` -d $(bin_folder) -cp $(dependaces)
jar:
	jar cvmf $(manifest) $(expected_jar_name) -C $(bin_folder) .
