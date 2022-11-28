# EjercicioGit3
<h1>1-Creo el repositorio en github con readme y gitignore</h1>

![a](img/Captura.PNG)

<h2>2-Creo proyecto en intellij</h2>

![b](img/Captura2.PNG)

git remote add origin https://github.com/DanielCamposRocha/EjercicioGit3.git
<h2>3-intento hacer un pull, fallo por tener dos ignore</h2>
<h2>4-aumento los fallos haciendo un git rm --cached -r .</h2>
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   .idea/workspace.xml

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)</p>
$ rm .gitignore

<h2>5-me cargo el ignore del remoto</h2>

![c](img/Captura3.PNG)

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)
$ git status
On branch master

No commits yet

Changes to be committed:<br>
(use "git rm --cached <file>..." to unstage)<br>
new file:   .gitignore<br>
new file:   .idea/misc.xml<br>
new file:   .idea/modules.xml<br>
new file:   .idea/vcs.xml<br>
new file:   .idea/workspace.xml<br>
new file:   EjercicioGit3.iml<br>
new file:   src/Main.java<br>

Changes not staged for commit:<br>
(use "git add/rm <file>..." to update what will be committed)<br>
(use "git restore <file>..." to discard changes in working directory)<br>
deleted:    .gitignore<br>
modified:   .idea/workspace.xml

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git pull origin main
From https://github.com/DanielCamposRocha/EjercicioGit3
* branch            main       -> FETCH_HEAD
  error: Your local changes to the following files would be overwritten by merge:
  .gitignore
  Please commit your changes or stash them before you merge.
  Aborting

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git add .
warning: in the working copy of '.idea/workspace.xml', LF will be replaced by CRLF the next time Git touches it

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git status
On branch master

No commits yet

Changes to be committed:
(use "git rm --cached <file>..." to unstage)<br>
new file:   .idea/misc.xml<br>
new file:   .idea/modules.xml<br>
new file:   .idea/vcs.xml<br>
new file:   .idea/workspace.xml<br>
new file:   EjercicioGit3.iml<br>
new file:   src/Main.java

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git pull origin main
From https://github.com/DanielCamposRocha/EjercicioGit3
* branch            main       -> FETCH_HEAD

<h2>6-Ya tenemos descargado lo que estaba en remoto (el README y el .gitignore de GitHub) en la rama main (rama por defecto en GitHub) a nuestra rama master local.</h2>

<h2>7-Ahora commiteamos el proyecto local y lo subimos al repositorio.</h2>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git add .
warning: in the working copy of '.idea/workspace.xml', LF will be replaced by CRLF the next time Git touches it

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git commit -m "commit local numero1"<br>
[master 37d9a98] commit local numero1<br>
6 files changed, 93 insertions(+)<br>
create mode 100644 .idea/misc.xml<br>
create mode 100644 .idea/modules.xml<br>
create mode 100644 .idea/vcs.xml<br>
create mode 100644 .idea/workspace.xml<br>
create mode 100644 EjercicioGit3.iml<br>
create mode 100644 src/Main.java<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git log --oneline<br>
37d9a98 (HEAD -> master) commit local numero1<br>
cbf891a (origin/main) Initial commit

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git push -u origin master<br>
Enumerating objects: 11, done.<br>
Counting objects: 100% (11/11), done.<br>
Delta compression using up to 4 threads<br>
Compressing objects: 100% (9/9), done.<br>
Writing objects: 100% (10/10), 2.30 KiB | 2.30 MiB/s, done.<br>
Total 10 (delta 0), reused 0 (delta 0), pack-reused 0<br>
remote:<br>
remote: Create a pull request for 'master' on GitHub by visiting:<br>
remote:      https://github.com/DanielCamposRocha/EjercicioGit3/pull/new/master
remote:
To https://github.com/DanielCamposRocha/EjercicioGit3.git
* [new branch]      master -> master
  branch 'master' set up to track 'origin/master'.

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git log --oneline<br>
37d9a98 (HEAD -> master, origin/master) commit local numero1<br>
cbf891a (origin/main) Initial commit

<h2>8-Observamos que se ha subido correctamente pero en la rama master (que era en la que estábamos trabajando en local),
mientras que la rama main se mantiene con su primer commit.</h2>

![d](img/Captura4.PNG)

![e](img/Captura5.PNG)

<h2>9-Se elimina la rama main en GitHub.


10- Nueva rama para arreglar un fixbug</h2>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git checkout -b bugfix1<br>
Switched to a new branch 'bugfix1'

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git status<br>
On branch bugfix1<br>
Changes not staged for commit:<br>
(use "git add <file>..." to update what will be committed)<br>
(use "git restore <file>..." to discard changes in working directory)<br>
modified:   src/Main.java<br>

no changes added to commit (use "git add" and/or "git commit -a")

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git add .
warning: in the working copy of 'src/Main.java', LF will be replaced by CRLF the next time Git touches it

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git status<br>
On branch bugfix1<br>
Changes to be committed:<br>
(use "git restore --staged <file>..." to unstage)<br>
modified:   src/Main.java<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git commit -m "se supone que el bug fue aplastado"<br>
[bugfix1 22d8ac8] se supone que el bug fue aplastado<br>
1 file changed, 2 insertions(+), 1 deletion(-)<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git log --oneline<br>
22d8ac8 (HEAD -> bugfix1) se supone que el bug fue aplastado<br>
fa153ca (master) commit numero 2 en local<br>
37d9a98 (origin/master) commit local numero1<br>
cbf891a (origin/main) Initial commit<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git push -u origin bugfix1<br>
Enumerating objects: 15, done.<br>
Counting objects: 100% (15/15), done.<br>
Delta compression using up to 4 threads<br>
Compressing objects: 100% (8/8), done.<br>
Writing objects: 100% (10/10), 981 bytes | 981.00 KiB/s, done.<br>
Total 10 (delta 5), reused 0 (delta 0), pack-reused 0<br>
remote: Resolving deltas: 100% (5/5), completed with 3 local objects.<br>
remote:<br>
remote: Create a pull request for 'bugfix1' on GitHub by visiting:<br>
remote:      https://github.com/DanielCamposRocha/EjercicioGit3/pull/new/bugfix1
remote:
To https://github.com/DanielCamposRocha/EjercicioGit3.git
* [new branch]      bugfix1 -> bugfix1
  branch 'bugfix1' set up to track 'origin/bugfix1'.

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (bugfix1)<br>
$ git checkout master<br>
Switched to branch 'master'<br>
Your branch is ahead of 'origin/master' by 1 commit.<br>
(use "git push" to publish your local commits)<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git log<br>
commit fa153ca409023afa9509a8e56b88e96fb3db8b3f (HEAD -> master)<br>
Author: a22danielcr <danielcamposrocha9@gmail.com><br>
Date:   Mon Nov 21 21:33:00 2022 +0100

    commit numero 2 en local

commit 37d9a988d5adbbe965c95e7ac66111f2f106e707 (origin/master)<br>
Author: a22danielcr <danielcamposrocha9@gmail.com><br>
Date:   Mon Nov 21 21:04:01 2022 +0100

    commit local numero1

commit cbf891a991082cff60135f90feb9c05fc83101e2 (origin/main)<br>
Author: DanielCamposRocha <114098301+DanielCamposRocha@users.noreply.github.com><br>
Date:   Mon Nov 21 20:35:50 2022 +0100

    Initial commit

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git status<br>
On branch master<br>
Your branch is ahead of 'origin/master' by 1 commit.<br>
(use "git push" to publish your local commits)<br>

Changes not staged for commit:<br>
(use "git add <file>..." to update what will be committed)<br>
(use "git restore <file>..." to discard changes in working directory)<br>
modified:   .idea/workspace.xml<br>

no changes added to commit (use "git add" and/or "git commit -a")<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git add .<br>
warning: in the working copy of '.idea/workspace.xml', LF will be replaced by CRLF the next time Git touches it

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git status<br>
On branch master<br>
Your branch is ahead of 'origin/master' by 1 commit.<br>
(use "git push" to publish your local commits)<br>

Changes to be committed:<br>
(use "git restore --staged <file>..." to unstage)<br>
modified:   .idea/workspace.xml

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git commit -m "ni yo se lo que hice"<br>
[master 291ed7d] ni yo se lo que hice<br>
1 file changed, 1 insertion(+), 4 deletions(-)<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git status<br>
On branch master<br>
Your branch is ahead of 'origin/master' by 2 commits.<br>
(use "git push" to publish your local commits)

nothing to commit, working tree clean

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git merge bugfix1<br>
Merge made by the 'ort' strategy.<br>
src/Main.java | 3 ++-<br>
1 file changed, 2 insertions(+), 1 deletion(-)<br>

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git status<br>
On branch master<br>
Your branch is ahead of 'origin/master' by 4 commits.<br>
(use "git push" to publish your local commits)<br>

nothing to commit, working tree clean

a22danielcr@W10N-I8E08 MINGW64 /e/Contornos/Intellij/EjercicioGit3 (master)<br>
$ git push<br>
Enumerating objects: 12, done.<br>
Counting objects: 100% (10/10), done.<br>
Delta compression using up to 4 threads<br>
Compressing objects: 100% (6/6), done.<br>
Writing objects: 100% (6/6), 610 bytes | 610.00 KiB/s, done.<br>
Total 6 (delta 4), reused 0 (delta 0), pack-reused 0<br>
remote: Resolving deltas: 100% (4/4), completed with 3 local objects.<br>
To https://github.com/DanielCamposRocha/EjercicioGit3.git<br>
37d9a98..d78ca1a  master -> master<br>

<h2>11- Finalmente con el proyecto "arreglado" paso toda la informacion a este readme y commiteo y lo subo a GitHub.</h2>
