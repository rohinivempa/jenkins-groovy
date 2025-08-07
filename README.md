
```markdown
# Jenkins Shared Library Example

This repository demonstrates how to create and use a **Jenkins Shared Library** to write reusable Groovy code for Jenkins Pipelines.

## Repository Structure

```

(shared-libs-repo)
├── vars/
│   └── greet.groovy           # Global function accessible in pipeline
└── src/
└── org/example/
└── Utils.groovy       # Utility class for structured logic

````

---

## 🔧 Step-by-Step Setup

### 1. Clone or Create This Repository

Create a Git repository with the above structure. You can name it something like `jenkins-shared-lib`.

### 2. Add Shared Library in Jenkins

1. Open Jenkins.
2. Go to **Manage Jenkins** → **Configure System**.
3. Scroll to **Global Pipeline Libraries** and click **Add**.
4. Set the following:
   - **Name** (thus name will be used for jenkins pipeline code): `my-shared-lib`
   - **Default version**: `main` or the branch name
   - **Retrieval method**: Modern SCM
   - **Source Code Management**: Git
   - **Project Repository**: URL of your Git repository

---

## What Each File Does

### `vars/greet.groovy`

```groovy
def call(String name = 'World') {
    echo "Hello, ${name}!"
}
````

Defines a global method `greet()` that can be used in any Jenkins pipeline directly.

---



## Resources

* [Jenkins Pipeline Shared Libraries Docs](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)

```

---
