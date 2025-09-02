# Resume Skills Shop – Data Schema Design

## Overview
To power the “Resume Skills Shop” website, I designed a simple and flexible schema for storing skills and bundles.  
Each skill is treated like a product in an e-commerce site, with metadata that can be used across the frontend and backend.

This schema can be represented in either a **spreadsheet** (for easy editing) or a **JSON seed file** (for direct use in code).

---

## Fields
| Field       | Type      | Description                                                                 |
|-------------|-----------|-----------------------------------------------------------------------------|
| `slug`      | string    | Unique identifier, used in URLs (e.g., `frontend-react`).                   |
| `title`     | string    | Display name of the skill or bundle (e.g., “React Basics”).                 |
| `category`  | string    | Category grouping: `frontend`, `backend`, `fullstack`, `other`.             |
| `shortDesc` | string    | One-line product description.                                               |
| `longDesc`  | string    | Longer description explaining the skill/bundle.                             |
| `techStack` | array     | List of technologies used.                                                  |
| `featured`  | boolean   | Whether the item is highlighted on the homepage/hero section.               |
| `price`     | number    | Playful/analogous value (e.g., `$49`) — not for actual purchase.            |

---

## Example Spreadsheet Representation
This structure works well in Google Sheets or Excel:

| slug              | title                | category  | shortDesc                         | longDesc                                                                 | techStack                               | featured | price |
|-------------------|----------------------|-----------|-----------------------------------|-------------------------------------------------------------------------|-----------------------------------------|----------|-------|
| frontend-react    | React Basics         | frontend  | Build dynamic UIs with React.     | Hands-on experience building SPAs using React hooks, JSX, and component-based design. | React, JSX, Hooks                        | TRUE     | 49    |
| backend-spring    | Spring Boot APIs     | backend   | Robust REST APIs with Spring.     | Designed secure, production-ready APIs with Spring Boot, JWT auth, and PostgreSQL integration. | Java, Spring Boot, JWT, PostgreSQL       | TRUE     | 79    |
| fullstack-ecom    | E-Commerce Kit       | fullstack | Complete store starter kit.       | Full-stack e-commerce demo project: React frontend, Spring Boot backend, PostgreSQL database, and AWS hosting. | React, Spring Boot, PostgreSQL, AWS      | TRUE     | 129   |
| devops-docker     | Docker & CI/CD       | other     | Deploy apps like a pro.           | Containerized apps with Docker, automated tests and builds with GitHub Actions, plus caching with Redis. | Docker, GitHub Actions, Redis            | FALSE    | 39    |

---

## Example JSON Seed File
This JSON file can be imported directly into a database or used in a Next.js/Node.js project as seed data:

```json
[
  {
    "slug": "frontend-react",
    "title": "React Basics",
    "category": "frontend",
    "shortDesc": "Build dynamic UIs with React.",
    "longDesc": "Hands-on experience building SPAs using React hooks, JSX, and component-based design.",
    "techStack": ["React", "JSX", "Hooks"],
    "featured": true,
    "price": 49
  },
  {
    "slug": "backend-spring",
    "title": "Spring Boot APIs",
    "category": "backend",
    "shortDesc": "Robust REST APIs with Spring.",
    "longDesc": "Designed secure, production-ready APIs with Spring Boot, JWT auth, and PostgreSQL integration.",
    "techStack": ["Java", "Spring Boot", "JWT", "PostgreSQL"],
    "featured": true,
    "price": 79
  },
  {
    "slug": "fullstack-ecom",
    "title": "E-Commerce Kit",
    "category": "fullstack",
    "shortDesc": "Complete store starter kit.",
    "longDesc": "Full-stack e-commerce demo project: React frontend, Spring Boot backend, PostgreSQL database, and AWS hosting.",
    "techStack": ["React", "Spring Boot", "PostgreSQL", "AWS"],
    "featured": true,
    "price": 129
  },
  {
    "slug": "devops-docker",
    "title": "Docker & CI/CD",
    "category": "other",
    "shortDesc": "Deploy apps like a pro.",
    "longDesc": "Containerized apps with Docker, automated tests and builds with GitHub Actions, plus caching with Redis.",
    "techStack": ["Docker", "GitHub Actions", "Redis"],
    "featured": false,
    "price": 39
  }
]
