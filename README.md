<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>


# Industrial Vaadin - V8 and a preview/migration to V10
In this workshop we will start with V8 from scratch and 
will go strait forward to the industrial parts of an project.
You will learn how to work with Vaadin, how to test your app
and much more. 

Last part will be a migration of the example app
to V10 preview.


## Preparation List the attendees
Please read the Wiki, for the list of software that should be installed on your machine.
[Wiki - Requirements for the Workshop](https://github.com/Java-Workshops/Industrial-Vaadin/wiki#requirements-for-this-workshop)

If you want to read a few things before to be better prepared you can find 
a list of documents and webpages at the 
[Wiki - Aditional Documentation List](https://github.com/Java-Workshops/Industrial-Vaadin/wiki/Additional-Documentation)

## Preparation List for the organizers
This workshop is designed to be done in around 8h.
For this there are a few preparations needed.

### Proper Internet
The internet connection should be good enough, that all attendees 
can use maven and git. If this is not guaranteed I recommend to use 
the [Vaadin Developer Environment](https://github.com/vaadin-developer/vaadin-dev-environment)
you can find on github. For a group of 15 attendees you can use a machine
with 8GB Memory and a proper actual CPU (min. 4 Cores).
Linux is recommended, OSX is running well, about Windows I have no infos.

Don´t use Raspi´s !!!

Prepare the Nexus and fill the local caching repos before the workshop.
An easy way is a ```mvn clean install``` of this project using this Nexus as a mirror.

### github Accounts or accounts on your git Server
To interact with your attendees easy it is good if every one of the attendees will have 
an account at github or on your internal git-server.
prepare it before to make sure there will be no delay.

### git repo
Don´t work with your attendees on the same git repo. Everybody should have it´s own repo.
So everybody can do what ever he want´ts and the re will be no merge conflict
during the workshop. This is sometimes very time consuming to bring 
the attendees workspace up and running again.

Changes from you are pushed to your repo, attendees should fork this repo
and merge changes from you into the personal repo.
If something is going wrong, the attendee can fork your repo again.

