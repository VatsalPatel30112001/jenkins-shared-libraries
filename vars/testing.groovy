def call(String url, String branch){
    echo "Hello temp friend"
    git branch: branch, url: url
    echo "Code cloning successful"
}
