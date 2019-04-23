(ns kubernetes.specs.v1/preconditions
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def v1/preconditions-data
  {
   (ds/opt :resourceVersion) string?
   (ds/opt :uid) string?
   })

(def v1/preconditions-spec
  (ds/spec
    {:name ::v1/preconditions
     :spec v1/preconditions-data}))
