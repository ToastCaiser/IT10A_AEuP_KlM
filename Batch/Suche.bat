echo off
if exist %1 goto vorhanden
goto nichtvorhanden

:vorhanden
echo: Datei %1 ist vorhanden
goto ende

:nichtvorhanden
echo: Datei %1 ist NICHT vorhanden

:ende
echo: Ende der Stapeldatei Suche.bat
pause