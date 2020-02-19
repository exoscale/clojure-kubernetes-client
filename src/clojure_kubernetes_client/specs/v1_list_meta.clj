(ns clojure-kubernetes-client.specs.v1-list-meta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(declare v1-list-meta-data v1-list-meta)
(def v1-list-meta-data
  {
   (ds/opt :continue) string?
   (ds/opt :remainingItemCount) int?
   (ds/opt :resourceVersion) string?
   (ds/opt :selfLink) string?
   })

(def v1-list-meta
  (ds/spec
    {:name ::v1-list-meta
     :spec v1-list-meta-data}))

