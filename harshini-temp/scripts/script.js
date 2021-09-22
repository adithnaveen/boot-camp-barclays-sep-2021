
        function tryagain(event) {

            console.log(event)
            event.preventDefault();

            obj = {}

            //url = '';

            obj.username = document.querySelector("#username").value;
            obj.password = document.querySelector("#password").value;
            console.log(obj);
            // console.log(JSON.stringify(obj));
            // var data = 

            fetch("http://acm.mocklab.io/bleh",
                {
                    method: 'POST',
                    body: JSON.stringify(obj),
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                })
                .then(resp => resp.json())
                .then(data => {
                    alert("API accessed!!");
                    console.log(data);
                });

        }
