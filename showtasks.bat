call runcrud.bat
if "%ERRORLEVEL%" == "0" goto runbrowser
echo.
echo runcrud has encountered errors - breaking work
goto fail


:runbrowser
call start chrome http://localhost:8080/crud/v1/tasks
if "%ERRORLEVEL%" == "0" goto end
echo.
echo failed starting Chrome - breaking work
goto fail


:fail
echo.
echo There were errors

:end
echo.
echo Work is finished.
