# Shopee Parser

This is a simple utility to parse basic order details from your Shopee account.  

Disclaimer: This utility is not affiliated officially with Shopee. 

## Purpose

This utility is useful for keeping track of your Shopee purchases, mainly for post-mortem
purpose where you run out of money and suddenly have the urge to find the culprit (based
on true story). 

## Input 

JSON files from Shopee website (steps are described below).

## Output

Excel and text file containing the order details from the JSON files. Columns:
Date, Amount and Items. 

## Usage 

Note that this utility requires Java installed in your machine. I'm sorry, I just don't
have time to compile it for OS-specific executables.

Steps:
1. Determine whether you have Java installed in your machine. Either check from application list in your OS, or run `java -v` in command prompt.
2. If Java is not installed, download Java installer and install it. This utility has been compiled with JDK 13, but I think it should work fine in any modern Java version.
3. Download the utility file from this Github release. 
4. Login to your Shopee account. 
5. Open the following url: https://shopee.com.my/api/v4/order/get_order_list?list_type=3. Then, download the output which is a JSON file.
6. The above url retrieves your first 20 completed order. To get more data and files, append `&offset=20` into the url, and subsequently in multiple of 20 (40, 60, 80 and so on).
7. Download these files into a folder in your machine. This is your input folder.
8. Create a new folder in your machine as output folder.
9. Double-click on the utility jar file. Then, select the input folder containing the JSON files, and the output folder.
10. Click Go. 
11. If there is no issue, the output text and Excel file are created in the output folder


## Support

If you run into issues or if you have any suggestion/comment, feel free to 
put into this repository's issue. 








