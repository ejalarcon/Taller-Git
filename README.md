Taller Git, 05/02/2016
------------------------------

Comandos básicos de GIT:

1) Ayuda, Versión GIT, Status, Configuracion, Mostrar historial

	git
	git help commit
	git --version
	git status
	git config -l
	git log

2) Creación proyecto Java con maven 3.5:

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

8) Consultar ramas, Creación de una rama, volver a rama master, merge, borrar rama, subir rama a repo
	
	git branch
	git checkout -b Alerta_C6
	git checkout master
	git merge Alerta_C6
	git branch -d Alerta_C6
	git push origin Alerta_C6

9) Etiquetas: anotada, firmada, ligera, subir etiqueta al repo

	git tag -a v1.0 -m 'Primera version Taller GIT 1.0, anotada'
	git tag -s v1.5 -m 'my signed 1.5 tag, firmada'
	git tag v1.4-lw
	git push origin v1.0


10) Subir cambios al repositorio remoto (con --all sube todo: ficheros, ramas, etiquetas)

	git push origin master

	git push https://username:password@github.com/ejalarcon/Taller-Git.git
	
	
11) Actualizar cambios de GitHub remoto

	git pull
	
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

- Configuración de Proxy:

	git config --global http.proxy http://user:password@host:puerto


	

