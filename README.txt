1. Download Jabuti master.
2. Download Apache ant.
3. Copy path of bin of apache ant and add to path.
4. Open cmd in Jabuti-master. Use command "ant jar".
5. use command "java -cp ./build/jar/jabuti.jar br.jabuti.gui.JabutiGUI
6. Click on file -> Open Class
7. Seperately goto Jabutimaster->vending->test->vending Copy both files to vending->src->vending
8. Use cmd to compile the 4 files in vending-src->vending : "javac Dispenser.java VendingMachine.java"
9. Now go to Jabuti Application. Go again to vending->src. Now select VendingMachine. Untick CFG module hide.
10. Add "C:\Users\Admin\Desktop\iamstark\ST\Jabuti\JaBUTi-master\vending\src" in the classpath. Click Open.
11. Now select Dispenser and click on third arrow. Again select VendingMachine and click on third arrow.
12. Select a project name. Click on OK (if new window doesn't appear, close the GUI by pressing ctrl+C in running cmd).
13. 