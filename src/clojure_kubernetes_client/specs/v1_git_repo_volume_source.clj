(ns clojure-kubernetes-client.specs.v1-git-repo-volume-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-git-repo-volume-source-data v1-git-repo-volume-source)
(def v1-git-repo-volume-source-data
  {
   (ds/opt :directory) string?
   (ds/req :repository) string?
   (ds/opt :revision) string?
   })

(def v1-git-repo-volume-source
  (ds/spec
    {:name ::v1-git-repo-volume-source
     :spec v1-git-repo-volume-source-data}))

