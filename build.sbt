lazy val contentFonts = (project in file("."))
  .enablePlugins(GitHubPagesPlugin)
  .settings(
    gitHubPagesSiteDir := baseDirectory.value / "fonts"
  )
