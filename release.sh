rm -rf target/release
mkdir target/release
cd target/release
git clone git@github.com:burtbeckwith/grails-tcpmon.git
cd grails-tcpmon
grails clean
grails compile
grails publish-plugin --noScm --stacktrace
