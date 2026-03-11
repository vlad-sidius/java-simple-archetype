def groupId = request.getGroupId()
def artifactId = request.getArtifactId()
def version = request.getVersion()
def outputDir = request.getOutputDirectory()
def archetypeGroupId = request.getArchetypeGroupId()

println "📦 Generating: ${groupId}:${artifactId}:${version}"
println "🎯 From archetype: ${archetypeGroupId}"
println "📁 Output: ${outputDir}"

// Access JVM system properties
def javaVersion = System.getProperty('java.version')
println "🔧 Running on Java ${javaVersion}"

def template = new File("${outputDir}/${artifactId}", "gitignore_template")
def gitignore = new File("${outputDir}/${artifactId}", ".gitignore")

if (template.exists()) {
    if (gitignore.exists()) {
        gitignore.delete()
    }

    template.renameTo(gitignore)
    println "Created .gitignore from template"
} else {
    println "The gitignore_template not found"
}
