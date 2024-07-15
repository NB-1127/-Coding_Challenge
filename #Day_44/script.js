document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('eventForm');
    const addEventButton = document.getElementById('addEvent');
    const eventList = document.getElementById('eventList');
    const noEventsMsg = document.getElementById('noEventsMsg');
    const resultSection = document.getElementById('result');

    addEventButton.addEventListener('click', function() {
        const name = document.getElementById('name').value;
        const venue = document.getElementById('venue').value;
        const date = document.getElementById('date').value;
        const price = document.getElementById('price').value;
        const count = document.getElementById('count').value;

        // Validation and data formatting logic

        const newRow = document.createElement('tr');
        newRow.innerHTML = `
            <td>${name}</td>
            <td>${venue}</td>
            <td>${date}</td>
            <td>${price * count}</td>
            <td><button class="cancelBtn">Cancel</button></td>
        `;

        eventList.appendChild(newRow);

        // Show the event list section if hidden
        if (eventList.children.length > 0) {
            noEventsMsg.style.display = 'none';
            resultSection.style.display = 'block';
        }
    });

    // Event delegation to handle cancel event button clicks
    eventList.addEventListener('click', function(event) {
        if (event.target.classList.contains('cancelBtn')) {
            const row = event.target.closest('tr');
            row.remove();

            // Hide or show no events message based on event list
            if (eventList.children.length === 0) {
                noEventsMsg.style.display = 'block';
                resultSection.style.display = 'none';
            }
        }
    });
});
