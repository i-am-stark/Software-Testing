# -*- coding: utf-8 -*-
"""
Created on Thu Jan 18 14:24:22 2024

@author: iamstark
"""

from selenium import webdriver 
from selenium.webdriver.common.by import By
import time

browser = webdriver.Chrome()
website_URL = "https://cricbuzz.com"
browser.get(website_URL)
refresh_rate = int(5)

while True:
    time.sleep(refresh_rate)
    browser.refresh()