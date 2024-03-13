package ski.chrzanow.foldableprojectview

import com.intellij.openapi.extensions.PluginId
import com.intellij.openapi.vcs.FileStatusFactory
import ski.chrzanow.foldableprojectview.FoldableProjectViewBundle.messagePointer

object FoldableProjectViewConstants {

    const val PLUGIN_ID = "ski.chrzanow.foldableprojectview"
    const val DEFAULT_RULE_NAME = "Foldable"
    const val DEFAULT_RULE_PATTERN = ".idea .flattened-pom.xml *.iml"
    const val COLOR_COLUMN_TEXT = "Aa"
    const val STORAGE_FILE = "FoldableProjectView.xml"
    const val FOLDED_STATUS_ID = "FOLDED"

    val pluginId: PluginId = PluginId.getId(PLUGIN_ID)
    val foldedFileStatus = FileStatusFactory.getInstance().createFileStatus(
        FOLDED_STATUS_ID,
        messagePointer("file.status.name.folded"),
        pluginId,
    )
}
