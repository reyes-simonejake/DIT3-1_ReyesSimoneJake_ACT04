#🖱️ How did you implement event handling for user actions?

I used Kotlin’s setOnClickListener to handle the button click event.
When the user presses Submit, the app gets the text from the name and age fields and displays it inside the output card. If the fields are empty or invalid, a Toast message appears to remind the user to fill everything in correctly.
This approach keeps the app simple, responsive, and easy to follow.

⚙️ What techniques ensured smooth and stable interaction?

To make sure the app feels smooth and works properly, I used a few key techniques:

Used Material Design components for consistent and professional UI elements.

Organized everything inside a ConstraintLayout for better responsiveness.

Added validation checks to prevent crashes and handle empty inputs.

Controlled visibility of the output card to make the interaction cleaner.

Wrote clear and structured Kotlin code to keep the logic easy to maintain.

🚀 What improvements would you add in future versions?

If I continue developing this app, I’d like to:

Add a way to save user data using Room Database or SharedPreferences.

Show real-time input validation instead of waiting for the button click.

Include a Reset button so users can easily clear their inputs.

Add animations or transitions to make the experience more lively and engaging.
