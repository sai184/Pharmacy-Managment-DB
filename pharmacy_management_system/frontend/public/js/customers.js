document.addEventListener('DOMContentLoaded', function () {
    fetchCustomers();
  });
  
  // Fetch customers from the backend
  function fetchCustomers() {
    fetch('/api/customers') // Adjust the URL to match your Spring Boot endpoint
      .then(response => response.json())
      .then(data => displayCustomers(data))
      .catch(error => console.error('Error fetching customers:', error));
  }
  
  // Display customers in the table
  function displayCustomers(customers) {
    const tableBody = document.getElementById('customerTable').getElementsByTagName('tbody')[0];
    customers.forEach(customer => {
      const row = tableBody.insertRow();
      row.innerHTML = `
        <td>${customer.customerID}</td>
        <td>${customer.name}</td>
        <td>${customer.email}</td>
        <td>${customer.phone}</td>
      `;
    });
  }
  