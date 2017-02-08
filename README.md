# Programming Assignment 1 - Submission & Comment System

- Instructor: John Foley
- CS341BD - Building a Digital Library
- Spring 2017, Mount Holyoke College

## What's in the repository now:
*Writr*, a guestbook-style web app, the suggested starter code for this project.

## Motivation & Learning Goals

This programming assignment is designed to be a fairly simple chance to program something open-ended. It will introduce web technologies from the server side, through the use of the embedded Jetty HTTP library. Since the web service loses its data every time it restarts, we will be introduced to the ideas of serving web content without mixing in databases just yet. We will see the challenges of building a testable system in this domain, and work on ways to overcome them.

## Introduction

Imagine you are part of a startup, *Writr*. You can tell it's a startup because it's almost a real word, but they lost a letter somewhere. This app allows users to anonymously contribute to a stream of messages online. A link to a running version is in our Moodle.

Having built this app, now the investors (me) want you to turn it a platform people might actually want to use. This *is* somewhat open-ended, but the core of the assignment will be making some specific changes.

## Required Changes

### Writr will have the concept of a user.
You will not do any authentication or passwords at this time, you'll just add a user field and trust users not to impersonate each other (haha). We'll discuss authentication and passwords in a future assignment.

### Writr will have the concept of posts.
The new Writr will support "Submission of Posts" which are analagous to top-level messages, except, they have a user associated with them, a title, a body, and sometimes an external link.

### Writr's posts will have their own "pages"
Everytime a post is submitted, you will create a unique id. Going to "writr/uid" will bring up that post in the browser. This is important, because...

### Writr will have the concept of comments, which are associated with a particular post.
Comments will again be posted by a specific user. They will not show up on the main page, except maybe as a count, but they will show up on a posts individual page.
