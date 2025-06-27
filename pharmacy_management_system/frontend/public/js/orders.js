document.addEventListener('DOMContentLoaded', function () {
    fetchOrders();
  });
  
  // Fetch orders from the backend
  function fetchOrders() {
    fetch('/api/orders') // Adjust the URL to match your Spring Boot endpoint
      .then(response => response.json())
      .then(data => displayOrders(data))
      .catch(error => console.error('Error fetching orders:', error));
  }
  
  // Display orders in the table
  function displayOrders(orders) {
    const tableBody = document.getElementById('orderTable').getElementsByTagName('tbody')[0];
    orders.forEach(order => {
      const row = tableBody.insertRow();
      row.innerHTML = `
        <td>${order.orderID}</td>
        <td>${order.customerName}</td>
        <td>${order.orderDate}</td>
        <td>${order.totalAmount}</td>
      `;
    });
  }
  