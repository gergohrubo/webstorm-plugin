package com.github.gergohrubo.webstormplugin.services

import com.intellij.openapi.project.Project
import com.github.gergohrubo.webstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
