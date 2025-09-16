def call(string url, string branch){
    echo "Hello temp friend"
    git url: "${url}", branch: "${branch}"
    echo "Code cloning successful"
}
