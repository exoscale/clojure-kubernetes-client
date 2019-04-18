(ns kubernetes.specs.v1/secret-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [kubernetes.specs.v1/secret :refer :all]
            [kubernetes.specs.v1/list-meta :refer :all]
            )
  (:import (java.io File)))


(def v1/secret-list-data
  {
   (ds/opt :apiVersion) string?
   (ds/req :items) (s/coll-of v1/secret-spec)
   (ds/opt :kind) string?
   (ds/opt :metadata) v1/list-meta-spec
   })

(def v1/secret-list-spec
  (ds/spec
    {:name ::v1/secret-list
     :spec v1/secret-list-data}))
