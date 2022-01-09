package com.github.alayahamza.myfirstintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.alayahamza.myfirstintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
