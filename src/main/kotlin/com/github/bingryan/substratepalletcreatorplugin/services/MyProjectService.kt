package com.github.bingryan.substratepalletcreatorplugin.services

import com.github.bingryan.substratepalletcreatorplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
