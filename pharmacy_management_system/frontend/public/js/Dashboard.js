// dashboard.js

// Fetch user from session storage
/* const user = JSON.parse(sessionStorage.getItem('user'));

if (user) {
    document.getElementById('welcome-message').innerHTML = `Welcome, ${user.username}!`;

    // Show different content based on user role
    if (user.role === 'admin') {
        document.getElementById('admin-content').style.display = 'block';
        document.getElementById('pharmacist-content').style.display = 'none';
    } else if (user.role === 'pharmacist') {
        document.getElementById('admin-content').style.display = 'none';
        document.getElementById('pharmacist-content').style.display = 'block';
    }
} else {
    // If no user is logged in, redirect to login page
    window.location.href = 'login.html';
}

// Handle logout
document.getElementById('logout-btn').addEventListener('click', function () {
    sessionStorage.removeItem('user');
    window.location.href = 'login.html'; // Redirect to login page
}); 

*/

document.addEventListener('DOMContentLoaded', function () {
    fetchStats();
  });
  
  // Fetch statistics from the backend
  function fetchStats() {
    fetch('/api/stats') // Adjust the URL to match your Spring Boot endpoint
      .then(response => response.json())
      .then(data => displayStats(data))
      .catch(error => console.error('Error fetching stats:', error));
  }
  
  // Display stats in the dashboard
  function displayStats(data) {
    const statsContainer = document.getElementById('statsContainer');
    
    // Example data structure: { totalMedicines: 50, totalOrders: 100, totalCustomers: 200 }
    statsContainer.innerHTML = `
      <p>Total Medicines: ${data.totalMedicines}</p>
      <p>Total Orders: ${data.totalOrders}</p>
      <p>Total Customers: ${data.totalCustomers}</p>
    `;
  }
  