#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} #end

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ${NAME}Screen(
    modifier: Modifier = Modifier,
    state: ${NAME}ViewState,
    onEvent: (${NAME}ViewEvent) -> Unit
) {
}

@Preview
@Composable
private fun Preview() {
   ${PROJECT_NAME}Theme {
        ${NAME}Screen(state = ${NAME}ViewState()) { }
    }
}