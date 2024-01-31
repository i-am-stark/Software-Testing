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

dv1.get("https://www.yahoo.com/")

search_input = dv1.find_element(By.NAME, "_yb_fsw74")
search_input.send_keys("Luffy")

search_button = dv1.find_element(By.NAME, "btnK")
search_button.click()
dv1.implicitly_wait(1500)
time.sleep(60)
