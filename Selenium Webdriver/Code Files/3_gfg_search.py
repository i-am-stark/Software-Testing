import time
from selenium import webdriver
from selenium.webdriver.common.by import By

chrome_driver_path = r"C:\Users\Admin\Desktop\chromedriver.exe"

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument(f"executable_path={chrome_driver_path}")

dv1 = webdriver.Chrome(options=chrome_options)

dv1.maximize_window()

dv1.set_page_load_timeout(40)
dv1.implicitly_wait(30)

dv1.get("https://www.geeksforgeeks.org/")

search_input = dv1.find_element(By.CLASS_NAME, "ant-input")
search_input.send_keys("Bootstrap")

search_button = dv1.find_element(By.CLASS_NAME, "ant-btn")
search_button.click()
time.sleep(60)
