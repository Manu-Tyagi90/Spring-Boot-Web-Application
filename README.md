
## Setting up the Spring Boot project  
- Spring Initailizr 
`https://start.spring.io/`

- Add Dependencies 
    1. Spring Web 
    2. Spring Data JPA
    3. Thymeleaf
    4. Validation
    5. Spring DevTools
    6. MySQl Driver 
    7. lombok

## Object Relational Model (ORM) SetUP

- Spring Datasource Config
` spring.datasource.url=jdbc:mysql://localhost:3306/mydb`
`spring.datasource.username=root`
`spring.datasource.password=root`

- Spring JPA Config
` spring.jpa.show-sql=true`
` spring.jpa.hibernate.ddl-auto=update`
` spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect (if Required)`

## use this Command for using Tailwind css

[tailwind CLI] (https://tailwindcss.com/docs/installation)


- install tailwindcss (tailwind.config.js)
`npm install -D tailwindcss`
`npx tailwindcss init`

- Configure your template paths (edit tailwind.config.js)
` content: ["./src/main/resources/**/*.{html,js}"`

- Add the Tailwind directives to your CSS (in input.css)
` @tailwind base;`
`@tailwind components;`
`@tailwind utilities;`

- Start the Tailwind CLI build process (in output.css)
`npx tailwindcss -i ./src/resources/static/css/input.css -o ./src/resources/static/css/output.css --watch `


## use this Command for using Flowbite for Tailwind.css (Include via CDN)

- include style for Flowbite
`<link href="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.css" rel="stylesheet" />`

- include script for Flowbite
`<script src="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.js"/>`




