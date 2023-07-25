@echo off

if "%1" == "" goto noarg

:paracheck
if "%1" == "" goto beendet

:filecheck
if exist %1 goto delloop

@echo Die Datei %1 ist nicht vorhanden.
goto shift

:delloop
copy %1 Temp\temp1 >nul
del %1
@echo Die Datei %1 wurde geloescht.
:shift
shift
goto paracheck


:noarg
@echo Keine Dateien angegeben.
goto ende

:beendet
@echo Dateiloeschprogramm beendet
goto ende

:ende
pause