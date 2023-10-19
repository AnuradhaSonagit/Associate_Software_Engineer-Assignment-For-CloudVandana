// Function to sort an array in descending order
function sortDescending(arr) {
    arr.sort(function(a, b) {
      return b - a;
    });
  }
  
  // Get user input for the array
  const userInput = prompt("Enter a list of numbers separated by spaces:");
  const inputArray = userInput.split(" ").map(Number);
  
  if (inputArray.length > 0) {
    // Sort the array in descending order
    sortDescending(inputArray);
  
    // Display the sorted array
    console.log("Sorted in descending order:", inputArray);
  } else {
    console.log("Please enter a valid list of numbers.");
  }
  