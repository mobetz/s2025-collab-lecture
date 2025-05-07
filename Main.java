

/*
Objectives for Today

By the end of today, you will:
   * Understand how we can store a git repository on a remote hosting service.
   * Identify the commands to:
        * sync remote changes to our local files
        * sync our local changes to the remote files
        * make a new local copy of a remote repository
   * Describe good practices for committing to repositories shared by multiple users.
 */


public class Main {

    public static void main(String[] args) {


        /*

        We've seen all semester how when we're trying to save changes to code, we can use a git repository in order
        to make those changes.

        So far, we've always used an existing repo that was built for us. However, git has the ability to create a repo
        in any folder on your computer without starting from a template. We can do this by navigating to any folder in
        our command line, and running the command

                git init

        Doing this immediately gives us an empty repository with zero files tracked. However, from there we can use the
        commands that we discussed for adding new files and creating individual commits:

                git add * //<- to add all the files in our folder
                git commit -m "SOME MESSAGE" //<- to make a commit

        Once we do this, we can see all the changes in our log with `git log` and review who made them, and add future
        commits exactly the way we always have.



        However... when we make a repository with git init, it's not associated with any remote copy. What this means is
        I do not inherently have the ability to run a git push:


        $ git push
            fatal: No configured push destination.
            Either specify the URL from the command-line or configure a remote repository using

                git remote add <name> <url>

            and then push using the remote name

                git push <name>


        If we do want to take advantage of the remote 'cloud storage' features of git then we need to define some Remote
        repository that will store the copy of our git history on the internet. Services like GitHub, GitLab, Forgero, and
        BitBucket are all just websites that have the tools to set up a URL that we can point to for our git repos.


        For any of these remote repos, the first step of using them is logging in to a user account. On the site once you
        are logged in, you can create a remote copy of the repo by clicking the New Repository button, and this will let you
        create a remote name for your project, and then you can set the URL that github gives you using the `git remote` command.

        To associate our local copy of the code with the URL given, we use git remote:

                git remote add <name_of_repo> <URL>

        Note: only files and changes that are part of a commit get pushed when you use the git push command. So we need to make
        sure to save our files and check `git status` to see if there are ever any pending changes that haven't been committed
        before pushing.



        Pushing and pulling works well when there's only a single developer making changes, but if we have multiple people
        (or even just multiple workstations for the same person) it's very likely that when you're making changes, the local
        copies of your code will get out of sync with one another.


        ...but the second push will fail because the "remote contains work you do not have locally".

        The command to do a merge is git merge. This will allow us to take our branching histories (the changes
        we made locally and the other changes that happened on the server) and 'merge' those two timelines back
        together. This is typically a fairly delicate process, so it's encouraged to use a graphical tool
        that can help you do the merge visually instead of just relying on the command line. Many IDEs like
        VSCode have these tools integrated directly into your same editor window you used to write the program.

        Once I complete the merge, I can commit and push like any other change, and at that point the change 
        should be visible for all users the next time they pull (but, if they do make changes at the same time,
        they'll need to merge your merge into their changes.)
        */
    }
}
