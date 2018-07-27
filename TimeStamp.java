//TimeStamp.ijm
//Written by Arne Seitz; based on a Macro from Curtis Rueden (planeTimings.txt)
//Last updated on 2013 April 17

//Uses Bio-Formats to print the chosen file's plane timings to the Log. 

run("Bio-Formats Macro Extensions")

macro "TimeStamp" {
	id = File.openDialog("Choose a file");
	print("Image path: " + id);
	open(id); w=getWidth;
	h=getHeight; 
	run("RGB Color");
	run("Colors...", "foreground=red background=green selection=orange");
	Ext.setId(id); 
	Ext.getImageCount(imageCount);
	print("Plane count: " + imageCount);
	creationDate = "";
	Ext.getImageCreationDate(creationDate);
	print("Creation date: " + creationDate);
	deltaT = newArray(imageCount);
	exposureTime = newArray(imageCount);
	print("Plane deltas (seconds since experiment began):");
	for (no=0; no ;
	}