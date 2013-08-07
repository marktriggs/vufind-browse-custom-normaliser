# Building it

You'll need to tell Ant where to find your VuFind directory:

     ant -Dvufind=/path/to/vufind-1.4

This process will produce a `.jar` file that you can copy into your
VuFind directory:

     cp vufind-custom-normaliser.jar /path/to/vufind-1.4/solr/lib

With that in place, you just need to arrange for the browse indexing
and browse handlers to use your custom class.  Both need to use it
since they need to apply normalisation rules consistently.

You can run the browse indexing with:

     NORMALISER="com.teaspoonconsulting.vufind.CustomNormaliser" ./index-alphabetic-browse.sh

and the custom normaliser class will be used in place of the default.

To have Solr also use the normaliser, you can add a line to the top of
your `vufind.sh` find (after `#!/bin/sh`) like:

     export NORMALISER="com.teaspoonconsulting.vufind.CustomNormaliser" 

and now the user's `from` parameter will have the custom normaliser
applied to it too.


# Author

Mark Triggs <mark@teaspoon-consulting.com>
