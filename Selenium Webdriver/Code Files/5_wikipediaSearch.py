from selenium import webdriver
from selenium.webdriver.common.by import By
import time

chrome_driver_path = r"C:\Users\Admin\Desktop\chromedriver.exe"

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument(f"executable_path={chrome_driver_path}")

dv1 = webdriver.Chrome(options=chrome_options)

dv1.maximize_window()

dv1.set_page_load_timeout(40)
dv1.implicitly_wait(30)

dv1.get("https://www.wikipedia.org/")

search_input = dv1.find_element(By.NAME, "search")
search_input.send_keys("Ana De Armas")

search_button = dv1.find_element(By.CLASS_NAME, "pure-button")
search_button.click()

time.sleep(50)
