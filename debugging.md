# Debugging is an essential skill for any programmer. It involves identifying and fixing errors or bugs in your code. Here are some key points to keep in mind when it comes to debugging:

## Understanding the problem
![image](https://i.pinimg.com/474x/70/af/5f/70af5fd5816fbcf51c46f860a5bed205.jpg)
Before you start debugging, make sure you fully understand the problem you're trying to solve. Read the error messages carefully and analyze the code to identify the root cause of the issue. When reading error messages, look for the most localized messages (usually at the top of the recursive stack trace). Be aware of warnings as most code will run fine with warnings, but the warnings may be a cause of error in your program.

## Test cases
![]()
When debugging, you should be aware of your edge cases and common cases. Although it may not be possible to always perfectly predict your program inputs, think of different ways or extreme inputs that allow your code to fail. Failure can mean anything from unintended program behavior, crashes, or warnings.

Although you may not be familiar with this step, almost all professional environments, especially ones that deliver products have a system for making sure things dont break suddenly. One large portion of this is called Unit Testing, where engineers and test engineers use isolated and integrated chunks of code to test and make sure they work as expected. Usually the outputs are manually written such that tests will pass or fail based on whether the output is correct.

Examples of unit testing:
python - google test, pytest
Java - JUnit, TestNG
Web - Selenium, Puppeteer, playwright
C - CUnit, check()/Rolling out custom


For our cases, you can feel free to explore unit tests if you would like, but sometimes it may take some setting up to integrate into an existing project. Most of the time (99% because im too lazy and think too short term) I just test whichever given function with a number of different inputs to make sure it works with some edge cases and then let it be until it breaks. Better to test a little rather than assume it works though.

## Reproduce the error
![image](https://upload.wikimedia.org/wikipedia/commons/5/50/Krispy_Kreme_Doughnuts.jpg)
To effectively debug, you need to be able to reproduce the error consistently. This means creating a minimal test case that triggers the bug. By isolating the problem, you can focus your efforts on fixing it.

* COMMENT COMMENT COMMENT!

If you feel like you are going crazy, just remove(comment) the code. You need to first figure out where the problem starts. If its a problem I am stuck on for a while, I usually start with a sanity check by commenting the new code I added and making sure everything works without it.

## Use print statements
![image](https://web.williams.edu/wp-etc/acad-resources/survival_guide/Graphics/printer.png)

One of the simplest and most effective debugging techniques is using print statements to display the values of variables at different points in your code. This can help you track the flow of execution and identify where things go wrong. Be careful however of how print statements function within and outside of asynchronous/multithreaded code. Javascript prints on web may commonly have weird unexpected behavior due to this sometimes.

## Debugging tools
![image](https://scontent-lax3-1.xx.fbcdn.net/v/t1.6435-9/81017175_10157870305892710_2396677620449148928_n.png?stp=dst-png_p526x296&_nc_cat=104&ccb=1-7&_nc_sid=13d280&_nc_ohc=MJgz7kAIyy8Q7kNvgFp6yXq&_nc_ht=scontent-lax3-1.xx&oh=00_AYDd_oUVA9-6tH130La2hMWnArGs2oanhv0aHixlLGwBQg&oe=66F1B5B0)

Take advantage of debugging tools provided by your programming language or integrated development environment (IDE). These tools can help you step through your code, set breakpoints, and inspect variables, making the debugging process more efficient.

python - pdb
javascript - modern browsers
C/C++ - gdb
Java - jdb
etc....

other tools commonly used to help not only debugging but with quality of life:

prettify/code formatters
inline error linters
In IDE test runners

## Divide and conquer
![image](https://miro.medium.com/v2/resize:fit:1150/1*xjYT0Y3FT_K-xFEP-q_k_Q.gif)

If you're dealing with a complex issue, break it down into smaller parts. Test each part individually to identify which specific section of code is causing the problem. This approach can help you narrow down the issue and find a solution faster.

Similar to before on the section for reproducing the errors, chunk your code into their roles and track down where the error might occur.

## Isolate variables
![image](https://i.sstatic.net/iVlggm.png)

Isolate external variables you don't normally consider to affect your code!
Some examples are: 

Platform(operating system), compilation/build steps, modules/library/framework versions, network and network protocols, hardware(very rarely because software has a large layer of abstraction), runtime/executable version, last run corruption, memory/storage corruption, and much more.

## Read documentation and seek help
![image](https://i.imgur.com/BiEAzsL.png)

Finally, don't hesitate to consult the documentation or search for solutions online. Many programming languages and frameworks have extensive documentation and vibrant communities that can provide valuable insights and solutions to common debugging challenges. People around you will usually be glad to help someone that is newer or unfamilar with some concept, don't be afraid to bug another programmer unless they are busy.

Remember, debugging is a skill that improves with practice. By adopting a systematic approach, using the right tools, and seeking help when needed, you can become a proficient debugger and solve coding issues more effectively.

Online communities like stackoverflow, forums, discords, subreddits can sometimes be a good place to get specialized attention your code. Be careful of posting duplicate questions however, don't post before trying the minimum effort at searching up solutions.

Do note that documentation can often have many shortcomings, for example, in less official sources, documentation can be lacking at best or there might be none at all.

## Worst case scenario
![image](https://media1.giphy.com/media/26ybwvTX4DTkwst6U/200w.gif?cid=6c09b952a2tfuneqve7ykox3dsbcjiqn86ndsehz9fv8moww&ep=v1_gifs_search&rid=200w.gif&ct=g)

You've tried for hours and hours, asked other people directly for help, reset everything, cleared every cache and constricted all environments. Nothing works. In this case there could be a very small (<1% chance) of this being out of your control. In the case of languages bugs, very rarely besides new features, these bugs will be incredibly rare. For libraries and frameworks You may want to check something similar

Work around it, or submit your own pull request/issue on github! I have not personally done the latter out of doubts over my own compentence (And its usually me that is using something incorrectly), but if you are somewhat confident and have done a little reading into similar issues, you may want to either post your own fix to an open source project or a way for developers of that project to track that bug.

For fixes to external codebases, make sure you first understand the code you are fixing after pulling their project repo and building, then submit a pull request to merge your code into the main/fixes branch.

For issues, state your problem, how to reproduce it, and your machine details. This will help developers to debug your issue and figure out maybe where their programming went wrong.


### The problems of overgoogling/overusing ai
![image](https://preview.redd.it/seriouslywhatyouaregoodat-v0-bqg07bhh4s4d1.jpeg?auto=webp&s=8002b428392af82319061d6252958d759ed538d7)

People have used google for a long time to help with programming and nowadays ai, but there is one thing you should always keep in mind. Some thing are generally not too much of a problem if you understand like configuration, constant files, commands used to fix your work. However, it is advised to avoid the strategy of "spray and pray" where you just copy paste things from the internet until it works. Heres a problems with this strategy:

* If you are a new programmer, you will never grow if you rely too hard on googled answers or . If you are understanding the code before copy-pasting this is generally fine as long as you aren't relying soley on other peoples answers.

* AI can hallucinate. If you are a new programmer, these hallucinations will likely hurt you more than help.

* AI is Horrible at debugging. Sometimes it can correct more obvious mistakes, but with larger codebases that contain more and more dependent functions, it loses context very quickly.

### The dos of using google and ai:

![image](https://img.devrant.com/devrant/rant/r_2784450_NJgoc.jpg)

Yes, you can find good writeups on code examples you need or even straight up books on your topic of choice on google. Other good examples are just documentations almost all libraries and frameworks provide on the web.

Use it for bringing up documentation, explaining documentation, maybe some rough examples on the documenation if online resources are not sufficient enough.

Often, AI can be helpful for repetitive code structures(boilerplate as we call it), helping make predictive steps in your program, or with helping get something set up.

Look at others peoples code! It can be tempting to copy without realizing what you are doing because it is an upvoted answer or marked as correct on platforms like stackoverflow, but it can and will usually be rewarding later on to know what the code you copy is about.

Generally, places likes stackoverflow are pretty good for very specific error messages (especially with devops related configuration) but this is mostly my opinion. I usually don't care to look to understand configuration files too closely because I switch between different languages and framworks often. It definitely can be useful, I just personally think unless you are planning to use something for a long time, getting to know the configuration workflow can often be grueling and annoying.

Linux/terminal errors, definitely don't be afraid to look those up. Unless you are a hardened veteran, these will often take a way more specific command than just some `git reset` or `sudo apt install` to reset things.


Something more condensed and concise to check out? Could be good as an introduction.

[Check out relevant topics by week](https://ucsd-cse15l-w22.github.io/)