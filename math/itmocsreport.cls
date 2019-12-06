\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{itmocsreport}[2019/11/04 LaTeX class for ITMO students]


\LoadClass[11pt]{article}

\RequirePackage[utf8]{inputenc}
\RequirePackage[T1]{fontenc}
\RequirePackage[a4paper,
                                 left=3cm,
                                 top=2cm,
                                 right=1.5cm,
                                 bottom=2cm,
                                 marginparsep=7pt,
                                 marginparwidth=.6in]{geometry}
\RequirePackage[english,russian]{babel}
\RequirePackage{indentfirst}
\RequirePackage{graphicx}

\renewcommand*{\maketitle}{
	\large
	\thispagestyle{empty}
	\begin{center}
		\textbf{Национальный Исследовательский Университет ИТМО}\\
		\textbf{Факультет Программной Инженерии и Компьютерной Техники}\\
	\end{center}
	\vspace{1em}
	\begin{center}
		\includegraphics[width=120px]{../itmo-logo.png}
	\end{center}
	\LARGE
	\vspace{5em}
	\begin{center}
		\textbf{Вариант № 9005}\\
		\textbf{Лабораторная работа № 1}\\
		\Large
		\textbf{по дисциплине}\\
		\LARGE
		\textbf{\emph{'Основы профессиональной деятельности'}}\\
	\end{center}
	\vspace{11em}
	\large
	\begin{flushright}
		\textbf{Выполнил:}\\
		\textbf{Студент группы P3113}\\
		\textbf{\emph{Куперштейн Дмитрий;} : 269359}\\
		\textbf{Преподаватель:}\\
		\textbf{\emph{ПЕРМИНОВ ИЛЬЯ ВАЛЕНТИНОВИЧ}}\\
	\end{flushright}
	\vspace{4em}
	\large
	\begin{center}
		\textbf{Санкт-Петербург 2019 г.}
	\end{center}
	\pagebreak{}
	\tableofcontents
	\vspace{2em}
	\pagebreak{}
}