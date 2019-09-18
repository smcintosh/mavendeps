package ca.mcgill.ecse437.mavendeps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  public static void main(String[] args) {
    final Logger logger = LogManager.getLogger(Main.class.getName());
    logger.info("Hello, world!");
  }
}
