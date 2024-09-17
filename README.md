# Snapbar Code


@Composable
fun SnackBarExample()
{
    val snackbarHostState = remember {SnackbarHostState()}
    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        content = {padding ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ){
                Button(onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            message = "This is My SnackBar!",
                            actionLabel = "Dismiss"
                        )
                    }
                },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Show SnackBar")
                }
            }

        }
    ) 
}

@Preview(showBackground = true)
@Composable
fun SnackBarExamplePreview()
{
    SnackBarExample()
}
