import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains

chrome_driver_path = r"C:\Users\Admin\Desktop\chromedriver.exe"

chrome_options = webdriver.ChromeOptions()
chrome_options.add_argument(f"executable_path={chrome_driver_path}")

dv1 = webdriver.Chrome(options=chrome_options)

dv1.maximize_window()

dv1.set_page_load_timeout(40)
dv1.implicitly_wait(30)

dv1.get("https://www.youtube.com/")

search_input = dv1.find_element(By.NAME, "search_query")
search_input.send_keys("Believer")

search_input.send_keys(Keys.ENTER)

video_result = dv1.find_element(By.CLASS_NAME, "ytd-video-renderer")
ActionChains(dv1).move_to_element(video_result).click().perform()

time.sleep(60)
