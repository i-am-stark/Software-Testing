from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait as wait
from selenium.webdriver.support import expected_conditions

url = "https://eapplication.nitrkl.ac.in/nitris/Login.aspx"

def getBrowser():
    options = webdriver.ChromeOptions()
    options.add_argument("--start-maximized")
    options.add_experimental_option("detach", True)
    return webdriver.Chrome(options=options)

def login(browser, username, password):
    try:
        # enter username
        browser.find_element(By.ID, "txtUserName").send_keys(username)

        #enter password
        browser.find_element(By.ID, "txtPassword").send_keys(password)

        # click login
        browser.find_element(By.ID, "btnLogin").click()

        #wait for login to complete
        wait(browser, 30).until(
            expected_conditions.title_contains("NITRIS")
        )
    except:
        return False

    return True



def downloadResult(username, password):
    browser = getBrowser()
    browser.get(url)

    if url == browser.current_url:
       if not login(browser, username, password):
           return False
    
    browser.find_element(By.ID, "Academic").click()

    wait(browser, 30).until(
        expected_conditions.element_to_be_clickable((By.XPATH, "//header/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[5]"))
    )

    browser.find_element(By.XPATH, "//header/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[5]").click()

    wait(browser, 30).until(
        expected_conditions.presence_of_element_located((By.XPATH, "//body/form[@id='form1']/div[@id='main-wrapper']/aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"))
    )

    browser.find_element(By.XPATH, "//body/form[@id='form1']/div[@id='main-wrapper']/aside[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]").click()

    wait(browser, 30).until(
        expected_conditions.element_to_be_clickable((By.XPATH, "//body/form[@id='form1']/div[@id='main-wrapper']/aside[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]"))
    )

    grade_card = browser.find_element(By.XPATH, "//body/form[@id='form1']/div[@id='main-wrapper']/aside[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]")

    grade_card.click()
    
username = "223CS3153"
password = "#Crash99"
downloadResult(username, password)
