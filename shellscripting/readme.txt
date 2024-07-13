What is Shell?
A shell is a special user program that provides an interface for the user to use operating system services. Shell accepts human-readable commands from users and converts them into something which the kernel can understand. It is a command language interpreter that executes commands read from input devices such as keyboards or from files. The shell gets started when the user logs in or starts the terminal.


In Simple words a shell reads and validates all given commands in terminal, then it gives instructions to kernel to process those commands(With help of system hardware components ) if commands are not valid syntactially then shell through error msg.  

>>Here, kernel work as a mediator in between kernel and user.

>> kernel works as a mediator between shell and sys hardware




Shell is broadly classified into two categories –

Command Line Shell
Graphical shell

Command Line Shell
Shell can be accessed by users using a command line interface. A special program called Terminal in Linux/macOS, or Command Prompt in Windows OS is provided to type in the human-readable commands such as “cat”, “ls” etc. and then it is being executed. The result is then displayed on the terminal to the user.



Graphical Shells
Graphical shells provide means for manipulating programs based on the graphical user interface (GUI), by allowing for operations such as opening, closing, moving, and resizing windows, as well as switching focus between windows. 




There are several shells are available for Linux systems like –

BASH (Bourne Again SHell) – It is the most widely used shell in Linux systems. It is used as default login shell in Linux systems and in macOS. It can also be installed on Windows OS.
CSH (C SHell) – The C shell’s syntax and its usage are very similar to the C programming language.
KSH (Korn SHell) – The Korn Shell was also the base for the POSIX Shell standard specifications etc.
TSH
ZSH




What is a terminal?
A program which is responsible for providing an interface to a user so that he/she can access the shell. It basically allows users to enter commands and see the output of those commands in a text-based interface. Large scripts that are written to automate and perform complex tasks are executed in the terminal.



what is scripting -------
a set of commands written in a file calling scripting or a script file.

Shell Scripting--------

Usually, shells are interactive, which means they accept commands as input from users and execute them. However, sometimes we want to execute a bunch of commands routinely, so we have to type in all commands each time in the terminal.

As a shell can also take commands as input from file, we can write these commands in a file and can execute them in shell to avoid this repetitive work. These files are called Shell Scripts or Shell Programs. Shell scripts are similar to the batch file in MS-DOS. Each shell script is saved with `.sh` file extension e.g., myscript.sh.

It is needed to automate a routine work.



How to view default shell?

$  echo $SHELL


How to check how many shells are there in your linux os ?

$ cat /etc/shells
