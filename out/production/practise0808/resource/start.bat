@echo off
color A

set BATPATH=D:\bat\utilbat

echo CommunicationLauncher开始启动！
start %BATPATH%\CommunicationLauncher.bat
echo 正在启动......
@echo off
ping 127.0.0.1 -n 8
::if errorlevel == 0 (echo CommunicationLauncher.bat运行结果:%errorlevel%;CommunicationLauncher.bat启动成功!) else (goto CommunicationLauncherEnd)


echo XmlCommunicationLauncher开始启动！
start %BATPATH%\XmlCommunicationLauncher.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo XmlCommunicationLauncher.bat运行结果:%errorlevel%;XmlCommunicationLauncher.bat启动成功!) else (goto XmlCommunicationLauncherEnd)

echo AsrsJobCenter开始启动！
start %BATPATH%\AsrsJobCenter.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo AsrsJobCenter.bat运行结果:%errorlevel%;AsrsJobCenter.bat启动成功!) else (goto AsrsJobCenterEnd)

echo StartBlockThread开始启动！
start %BATPATH%\StartBlockThread.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo StartBlockThread.bat运行结果:%errorlevel%;StartBlockThread.bat启动成功!) else (goto StartBlockThreadEnd)

echo Msg10Send开始启动！
start %BATPATH%\Msg10Send.bat 
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo Msg10Send.bat运行结果:%errorlevel%;Msg10Send.bat启动成功!) else (goto Msg10SendEnd)

echo Msg06Send开始启动！
start %BATPATH%\Msg06Send.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo Msg06Send.bat运行结果:%errorlevel%;Msg06Send.bat启动成功!) else (goto Msg06SendEnd)

echo AsrsJobClearThread开始启动！
start %BATPATH%\AsrsJobClearThread.bat
ping 127.0.0.1 -n 2

echo WMSXmlCommunicationLauncher开始启动！
start %BATPATH%\WMSXmlCommunicationLauncher.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo XmlCommunicationLauncher.bat运行结果:%errorlevel%;XmlCommunicationLauncher.bat启动成功!) else (goto XmlCommunicationLauncherEnd)

echo WMSAsrsJobCenter开始启动！
start %BATPATH%\WMSAsrsJobCenter.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo AsrsJobCenter.bat运行结果:%errorlevel%;WMSAsrsJobCenter.bat启动成功!) else (goto AsrsJobCenterEnd)

echo WMSAdjuestInventory开始启动！
start %BATPATH%\WMSAdjuestInventory.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo AdjuestInventory.bat运行结果:%errorlevel%;WMSAdjuestInventory.bat启动成功!) else (goto AdjuestInventoryEnd)


echo WMSQueryTransfer开始启动！
start %BATPATH%\WMSQueryTransfer.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo QueryTransfer.bat运行结果:%errorlevel%;WMSQueryTransfer.bat启动成功!) else (goto QueryTransferEnd)



echo WMSJobFinish开始启动！
start %BATPATH%\WMSJobFinish.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo JobFinish.bat运行结果:%errorlevel%;WMSJobFinish.bat启动成功!) else (goto JobFinishEnd)


echo EmptyPalletCaller开始启动！
start %BATPATH%\EmptyPalletCaller.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo EmptyPalletCaller.bat运行结果:%errorlevel%;EmptyPalletCaller.bat启动成功!) else (goto EmptyPalletCallerEnd)

echo LedCenter开始启动！
start %BATPATH%\LedCenter.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo LedCenter.bat运行结果:%errorlevel%;LedCenter.bat启动成功!) else (goto LedCenterEnd)

echo Msg03Resender开始启动！
start %BATPATH%\Msg03Resender.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo Msg03Resender.bat运行结果:%errorlevel%;Msg03Resender.bat启动成功!) else (goto Msg03ResenderEnd)

echo WMSCheckInv开始启动！
start %BATPATH%\WMSCheckInv.bat
ping 127.0.0.1 -n 2
::if errorlevel == 0 (echo WMSCheckInv.bat运行结果:%errorlevel%;WMSCheckInv.bat启动成功!) else (goto WMSCheckInvEnd)


echo 启动完成 & pause >nul
exit



