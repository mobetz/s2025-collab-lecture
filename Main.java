

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
        */
    }
}
