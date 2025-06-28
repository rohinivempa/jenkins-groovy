package org.vcjain

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def sayBye(name) {
        steps.echo "Goodbye, ${name}!"
    }
} 