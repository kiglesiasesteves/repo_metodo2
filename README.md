# Ejercicio de clase

## modificación de clase

Esto es una modificacion del README.md hecha en local despues de clonar el repositorio para posteriormente subirlo a un repositorio personal.

Estos han sido los pasos realizados durante el ejercicio:

1. Navegar al directorio donde quiero clonar el repositorio ( `cd /...` )

2. Clonar el repositorio:

   -   `git clone https://github.com/danielcastelao/pruebasReadme.git`

3. Crear nuevo repositorio en github llamado _repo_metodo2_

4. Cambiar la ruta remota donde se subirán los cambios:

   - `git remote set-url origin https://github.com/kiglesiasesteves/repo_metodo2.git`

5. Realizar estos cambios en el README.md

6. Seleccionar los cambios que queremos añadir al commit:

   - `git add README.md`

7. Hacer el commit con los cambios seleccionados:

   - `git commit -m 'Cambios en el README.md hechos junto con los pasos explicados'`

8. Hacer push del commit:

   - `git push origin main`