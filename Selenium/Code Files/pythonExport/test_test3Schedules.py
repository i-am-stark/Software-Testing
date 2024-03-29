# Generated by Selenium IDE
import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class TestTest3Schedules():
  def setup_method(self, method):
    self.driver = webdriver.Chrome()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_test3Schedules(self):
    self.driver.get("https://www.cricbuzz.com/")
    self.driver.set_window_size(1440, 860)
    element = self.driver.find_element(By.CSS_SELECTOR, ".cb-view-all-ga:nth-child(2) .cb-hmscg-bat-txt .cb-col-50:nth-child(2)")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, "body")
    actions = ActionChains(self.driver)
    actions.move_to_element(element, 0, 0).perform()
    element = self.driver.find_element(By.LINK_TEXT, "Dhananjaya de Silva named Sri Lanka\'s new Test captain")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, "body")
    actions = ActionChains(self.driver)
    actions.move_to_element(element, 0, 0).perform()
    self.driver.find_element(By.LINK_TEXT, "Live Scores").click()
    element = self.driver.find_element(By.LINK_TEXT, "RSA vs IND - Lunch")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    self.driver.find_element(By.LINK_TEXT, "Schedule").click()
    self.driver.execute_script("window.scrollTo(0,199)")
    self.driver.find_element(By.ID, "domestic-tab").click()
    self.driver.find_element(By.ID, "league-tab").click()
    self.driver.find_element(By.ID, "women-tab").click()
    self.driver.find_element(By.ID, "all-tab").click()
    self.driver.execute_script("window.scrollTo(0,2415)")
    self.driver.execute_script("window.scrollTo(0,7999)")
    self.driver.find_element(By.ID, "top-btn").click()
  
