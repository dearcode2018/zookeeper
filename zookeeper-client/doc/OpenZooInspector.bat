@ rem ----- ��Ϣ -----
@ rem @filename OpenZooInspector.bat
@ rem @version 1.0
@ rem @author qye.zheng
@ rem @description �� zooinspector

@ rem @warning Ϊ�˷�ֹ���Ļ������룬�����ļ���ʱ��Ӧ�ñ���ΪANSI�����ʽ.
@ rem ################################################################################
:: ��ȡbat�ļ����ڵĴ��������������� C:
set zooinspectorPath=D:\software\ZooInspector\build
:: set currentDriver=%~dp0
set targetDriver=%zooinspectorPath:~0,2%
:: ִ��������������ű������뵱ǰ�ű����ڵ�·��
%targetDriver%
cd %zooinspectorPath%

@ rem ����
@ title ����ZooInspector
@ rem ########## begin  ##########
java -jar zookeeper-dev-ZooInspector.jar
@ rem �ر���ʾ���ʹ��������ִ��ǰ����ʾ
@ rem @ echo off
@ echo off
@ rem ��������ʾ @ echo on

@ rem ----- ����������


@ rem ----- ���������

@ rem pause

@ rem

@ rem
@ rem �����ʾ��Ϣ

::
:: 1) 
:: 2)
:: 3)
:: 4)
:: 5)
:: 6)
:: 7)
:: 8)
:: 9)
:: 10)

:: �ڳ����ĩβ�����Ը���ִ�еĽ��(�ɹ���ʧ��) ������ʾ��Ϣ���ɹ�����ֱ��ִ��exit����ʧ��
:: ����ִ��pause��Ȼ�����ͨ������̨�����Ϣ�����ԡ���λ����.
:: �����ڳ���������һ���ɹ���ʧ�ܵı�־-����ֵ���������������ִ������.

@ rem echo
@ rem exit
@ rem ########## end of ##########

@ rem ע��˵��: @ rem ע������  ���� :: ע������
@ rem rem ������ð�� ���� ������дע��
