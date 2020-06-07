(defproject hello-cljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [datascript "0.18.13"]]
  :source-paths ["src" "cljs-src"]
  :profiles
  {:dev
   {:dependencies [[org.clojure/clojurescript "1.10.773"]
                   [com.bhauman/figwheel-main "0.2.8"]
                   ;; optional but recommended
                   [com.bhauman/rebel-readline-cljs "0.1.4"]]
    :resource-paths ["target"]
    :clean-targets ^{:protect false} ["target"]}}
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]})
