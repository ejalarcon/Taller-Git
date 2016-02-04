Taller Git, 05/02/2016
------------------------------

Comandos basico de GIT:

1) Ayuda, Versión GIT, Status, Configuracion, Mostrar historial
	git
	git help commit
	git --version
	git status
	git config -l
	git log

2) Creación proyecto Java con maven:

mvn archetype:generate -DgroupId=com.bbva.kata1 -DartifactId=emilio  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn eclipse:clean eclipse:eclipse clean install

3) Añadir todos los ficheros

git add .

4) Commit de ficheros añadidos

git commit -m "Primera subida"
git commit -a -m "Subida sin pasar por Staged/Index"

5) Eliminar fichero de control de versiones

git rm nombreFichero

6) Deshacer cambios realizados en un fichero

git checkout -- nombreFichero

7) Deshacer todos los cambios

git fetch origin
git reset --hard origin/master

8) Creación de una rama, volver a rama master, merge, borrar rama, subir rama a repo

git checkout -b Alerta_C6
git checkout master
git merge Alerta_C6
git branch -d Alerta_C6
git push origin Alerta_C6

9) Subir cambios al repositorio remoto

git push origin master

Configuraciones adicionales:
------------------------------

- Ignorar ficheros para GIT

Mac:

	git config --global core.excludesfile '~/.gitignore'

Windows:

	git config --global core.excludesfile "%USERPROFILE%\.gitignore"

Por ejemplo, para proyectos Java:	

.classpath
.project
.settings/
target/
*.class

	

