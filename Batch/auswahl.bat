@echo off

:topmenue

cls
echo: ECHO ist ausgeschaltet (off)
echo:    (a) Laufwerk anzeigen
echo:    (b) Alle Dateien des aktuellen Verzeichnisses nach temp2 kopieren
echo:    (c) Editor aufrufen
echo:    (d) ende
echo: 
echo:    Bitte waehlen sie:

set choice=
set /P choice= Bitte Eingeben (a bis d):

if "%choice%" == "a" goto drive
if "%choice%" == "b" goto copytemp1
if "%choice%" == "c" goto openeditor
if "%choice%" == "d" goto end

:keineangabe
echo: "%choice%" ist keine gueltige Eingabe!
pause
goto topmenue

:drive
cls
echo: Sollen die Dateien in Spalten (a) oder Breit(b) angegeben werden?
echo:
echo:
set /P choice= Bitte Eingeben (a oder b):

if "%choice%" == "a" goto dirpage
if "%choice%" == "b" goto dirbroad
goto keineangabe

:dirpage
cls
dir /P
pause
goto topmenue

:dirbroad
cls
dir  /W
pause
goto topmenue



:copytemp1
copy *.* Temp\temp2
echo: Kopiert nach Temp/temp2
echo:
echo:
pause
goto topmenue


:openeditor
notepad.exe
goto topmenue



:end
cls
echo: Programmende!
echo:
echo:
echo:
echo:
pause