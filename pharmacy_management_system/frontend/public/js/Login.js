

// Dummy users replace with actual API call to backend
const users = [
    { username: 'admin', password: 'admin123', role: 'admin' },
    { username: 'pharmacist', password: 'pharma123', role: 'pharmacist' }
];

// Handle form submission
document.getElementById('login-form').addEventListener('submit', function (e) {
    e.preventDefault();
    
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    const user = users.find(u => u.username === username && u.password === password);

    if (user) {
        // Simulate user authentication success
        sessionStorage.setItem('user', JSON.stringify(user)); // Store user data in session
        window.location.href = 'dashboard.html';  // Redirect to dashboard
    } else {
        alert('Invalid username or password');
    }
});
