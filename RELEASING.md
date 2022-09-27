Releasing
=========

### Prerequisite: Sonatype (Maven Central) Account

Create an account on the [Sonatype issues site](https://issues.sonatype.org/). Ask an existing publisher to open
an issue requesting publishing permissions for `app.cash` projects. They can use [this issue](https://issues.sonatype.org/browse/OSSRH-84839)
as a template to copy.

### Steps

1. Check out a new branch. Update `CHANGELOG.md` with changes since the last release. This
   step is manual and somewhat tedious. Follow the existing CHANGELOG.md format.

2. Set versions:

    ```
    export RELEASE_VERSION=A.B.C
    export NEXT_VERSION=A.B.D-SNAPSHOT
    ```

3. Update documentation and Gradle properties with `RELEASE_VERSION`

    ```
    sed -i "" \
      "s/VERSION_NAME=.*/VERSION_NAME=$RELEASE_VERSION/g" \
      gradle.properties
    sed -i "" \
      "s/\"app.cash.wisp:\([^\:]*\):[^\"]*\"/\"app.cash.wisp:\1:$RELEASE_VERSION\"/g" \
      `find . -maxdepth 2 -name "README.md"`
    ```

4. Tag the release and push to GitHub. Submit and merge PR.

    ```
    git commit -am "Prepare for release $RELEASE_VERSION."
    git tag -a wisp-$RELEASE_VERSION -m "Version $RELEASE_VERSION"
    git push && git push --tags
    # Then create PR and merge it
    ``` 

5. Trigger the "Publish a release" action manually. Wait until it completes, then visit [Sonatype Nexus](https://oss.sonatype.org/)
   to publish the artifacts. Follow the guide [here](https://central.sonatype.org/publish/release/) for detailed steps
   on how to promote (close then release) the artifact. Or drop it if there is a problem! Be warned, the UI is awful and
   may take much time to load the staging repository list.

6. In a new branch, prepare for the next release and push to GitHub. Submit and merge PR.

    ```
    sed -i "" \
      "s/VERSION_NAME=.*/VERSION_NAME=$NEXT_VERSION/g" \
      gradle.properties
    git commit -am "Prepare next development version."
    git push
    # The create PR and merge it
    ```

7. Draft a new [release](https://docs.github.com/en/github/administering-a-repository/managing-releases-in-a-repository) of `A.B.C` and publish it.

## Troubleshooting

- If the github action fails, drop the artifacts from Sonatype and re run the job.
