# covidWatch
<h1> Idea Behind the App </h1>
The idea behind the app was to make it so that people of different risks would be accounted for differently for and we would keep in mind this and how many people are around you and how close they are to you. The novelity of my idea is designed to help keep keep keep vulenerable people safe during Covid19! 
<h2> Calculating Social Distancing Score </h2> 
<h3> Health Survey </h3>
Before you begin using the app, we humbly request that you fill out a health survey, your data is not stored in the app but rather is used to calculate a health score. 
The health score will be used to assess risk levels and be factored into your overall social distancing score.
This survey was done in order for people who are at risk to take more precaution by seeing a social distancing score than other people who are healthier in order to ensure that they see less people since they may be more likely to die from COVID19.
<h2> Other Metrics used fro Score</h2>
Scanning for devices is done via Bluetooth and we gather two things from it, distance and number of people you are around. 
<h3> Distance </h3>
There is not a straightforward way to calculate distance with Bluetooth, however RSSI measures signal strength, which is what I used to get a rough estimate on if someone is within 6 feet of someone by extracting it from each of the bluetooth devices that were detected. I included this because staying 6 feet away from others is a major guideline for keeping yourself from getting COVID19.
<h3> Number of People </h3>
This was taken from the bluetooth devices by looking at the amount of unique entries in the list. I included this as a metric for calculate score because a person is at more risk for developing COVID19 if they are in an environment with a large amount of people.
<h1> UI/UX design </h1> 
One of the things I try to do is keep the amount of screens a user needs to go through small. The Welcome screen provides general overview of the app and allows for a user to skip past the health survey and go into the scan if a user wants to while still allowing for them to gain insight into the app while not being overwhelmed with choices. The stats page also displays how many people a user came in contact with at the time/date they ran the scan to inform them of how busy a location is.
<h1> Feature Engineering </h1>
For feature engineering I extracted the RSSI of each device that is discovered via Bluetooth, as well as this each time a user runs a scan I extract their location name and address as well as the time of day in order to display how many people a person comes in contact with at a location.  
<h1> Evaluation </h1>
For evaluation, since I was getting conflicting information on how RSSI corresponds to distance, I needed to do testing at 6 feet to figure out what number should be the 6 foot mark so anything more than that (due to RSSI being negative) would be counted in the social distancing score. I order to do this I had my family be 6 feet away from me with a tape measurer and I would record the RSSI, I also experimented with my Laptop and a ruler as well. 
<h1>Differentiating your Contribution</h1>
For this assignment I added the following:
  <ul> 
  <li> A welcome screen to greet users </li>
  <li> A health survey screen to get use in determine social distancing score </li>
  <li> Score screen that shows score based on the score metrics I calculated (health,number of people, and proximity) 
  <li> Stats screen which shows more detailed information about a scan </li>
  </ul>
