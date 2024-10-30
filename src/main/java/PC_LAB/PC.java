package PC_LAB;

public class PC {

        private Case theCase;
        private Motherboard motherBoard;
        private Monitor monitor;

        // Parameterized constructor "containing all of its instance variables"
        public PC(Case theCase, Motherboard motherBoard, Monitor monitor) {
            this.theCase = theCase;
            this.motherBoard = motherBoard;
            this.monitor = monitor;
        }

        // Private method to draw logo
        private void drawLogo() {
            // todo- Call the drawPixel method on the monitor [done]
            monitor.drawPixel(10, 10, "Blue");
        }

        //method to describe case, monitor, and motherboard (most concatenate)
        public void description() {
            System.out.println("Welcome to Worst Buy, below is the description of the PC on sale today:");
            System.out.println(theCase + "\n" + motherBoard + "\n" + monitor);
        }

        public void powerUp() {
            theCase.pressPowerButton();  //todo-(first mase case class) Call pressPowerButton ON the case [done]
            drawLogo();                  // Call drawLogo
            motherBoard.loadProgram("Operating System");
        }
    }

