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

class TestTest1INDvsSA():
  def setup_method(self, method):
    self.driver = webdriver.Chrome()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def test_test1INDvsSA(self):
    self.driver.get("https://www.cricbuzz.com/")
    self.driver.set_window_size(1440, 860)
    element = self.driver.find_element(By.CSS_SELECTOR, ".cb-view-all-ga:nth-child(3) .cb-mtch-crd-state")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, "body")
    actions = ActionChains(self.driver)
    actions.move_to_element(element, 0, 0).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, ".cb-view-all-ga:nth-child(3) .cb-hmscg-tm-bwl-scr")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, ".big-crd-main:nth-child(1) img")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    element = self.driver.find_element(By.CSS_SELECTOR, "body")
    actions = ActionChains(self.driver)
    actions.move_to_element(element, 0, 0).perform()
    self.driver.find_element(By.CSS_SELECTOR, ".cb-view-all-ga:nth-child(1) .cb-hmscg-bwl-txt .cb-col-50:nth-child(2)").click()
    self.driver.execute_script("window.scrollTo(0,1)")
    self.driver.execute_script("window.scrollTo(0,136)")
    self.driver.execute_script("window.scrollTo(0,1201)")
    self.driver.find_element(By.LINK_TEXT, "Scorecard").click()
    self.driver.execute_script("window.scrollTo(0,200)")
    self.driver.find_element(By.LINK_TEXT, "Squads").click()
    self.driver.find_element(By.LINK_TEXT, "Highlights").click()
    self.driver.find_element(By.LINK_TEXT, "Full Commentary").click()
    self.driver.find_element(By.LINK_TEXT, "Live Blog").click()
    self.driver.find_element(By.LINK_TEXT, "Match Facts").click()
    self.driver.find_element(By.CSS_SELECTOR, ".cb-nav-tab:nth-child(8)").click()
    self.driver.find_element(By.LINK_TEXT, "Photos").click()
    self.driver.find_element(By.CSS_SELECTOR, "img:nth-child(2)").click()
    self.driver.execute_script("window.scrollTo(0,200)")
  
