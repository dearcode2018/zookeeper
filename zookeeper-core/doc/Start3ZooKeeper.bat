@ rem ----- ��Ϣ -----
@ rem @filename Start3ZooKeeper.bat
@ rem @version 1.0
@ rem @author qye.zheng
@ rem @description �� 3 �� ZooKeeper

@ rem @warning Ϊ�˷�ֹ���Ļ������룬�����ļ���ʱ��Ӧ�ñ���ΪANSI�����ʽ.
@ rem ################################################################################
:: ��ȡbat�ļ����ڵĴ��������������� C:
set ZooKeeperPath=D:\software\zookeeper-3.5.4-beta\bin
:: set currentDriver=%~dp0
set targetDriver=%ZooKeeperPath:~0,2%
:: ִ��������������ű������뵱ǰ�ű����ڵ�·��
%targetDriver%
cd %ZooKeeperPath%

@ rem ����
@ title ����ZooKeeper

call zkServer_01.cmd
call zkServer_02.cmd
call zkServer_03.cmd

@ rem ########## begin  ##########
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
