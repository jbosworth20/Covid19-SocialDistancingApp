Things I added:
1) Welcome Screen
2) Health Survey Screen
3) Thank you! Screen
4) Score Screen

Health Survey
-------------
This app includes a health survey that asks questions in order to best assess risk levels so that social distancing scores are higher for those higher at risk
I came up with questions basked on what made a person at risk, and I looked at these website to find them:

https://www.statnews.com/2020/03/03/who-is-getting-sick-and-how-sick-a-breakdown-of-coronavirus-risk-by-demographic-factors/
https://www.statnews.com/2020/03/18/coronavirus-new-age-analysis-of-risk-confirms-young-adults-not-invincible/
https://www.healthline.com/health-news/covid-19-serious-effects-people-with-mental-health-disorders#Access-and-underlying-conditions
https://www.cdc.gov/coronavirus/2019-ncov/need-extra-precautions/people-at-higher-risk.html

The last link being what I based my final questions off of



Add-On Scores
------
While the survey asks questions on a user's health and demographics, this data is not stored rather a point accumulation happens where if a user experiences a risk factor their score goes up by a certain amount.
Higher risks factors (old age and preexisting conditions) have a higher score increment than things that are only a smaller risk factor such as being male.

While I use an algorithm to calculate score the health survey will determine how many points get addded on. This is so that people who are at higher risks are more dettered from doing risky activities.


Calcuting Score
---------------
Scores is based on three things in particular
1) Proximity to others (Good)
2) How many people are near (Good)
3) Location (Grocery store vs home for example)
4) Time of day
5) Health Survey (Good)


RSSI
----
In order to calculate distance I used RSSI which measures signal strength. While there is a formula 
for converting RSSI to distance, it was strange and I did not know how to do it so I took a testing
approach. What I did was set up a Short ArrayList to capture the RSSI scores. I then had score print
out the RSSI's of the devices. I know my bed is approximately 6 feet long so I set up my laptop to 
be at the head of the bed and then stood on the other side of my bed with my phone as well as did 
test with my family at exactly 6 feet distance, this gave me
roughly a 6 ft RSSI score which is how I calculate is someone is within 6th feet of a user.
I found that my scores were between -68 and -59, since -68 was the max I decided to make the bound -70

Things Extracted
-----
RSSI
Location Address
Location Name
Identifier